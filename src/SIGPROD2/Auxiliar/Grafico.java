package SIGPROD2.Auxiliar;

import SIGPROD2.Modelo.Curvas;
import SIGPROD2.Modelo.PontoCurva;
import java.awt.BasicStroke;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Classe responsável por criar um Gráfico com informações recebidas.
 *
 * @see org.jfree.chart.JFreeChart
 * @author Rafael Casa
 * @version 05/04/2016
 */
public class Grafico {

    /**
     * Variáveis que guardam os limites dos dados que serão exibidos no Gráfico
     * para ajudar a renderizar corretamente a escala Logarítmica.
     */
    private static double maxX = Double.MIN_VALUE,
            minX = Double.MAX_VALUE,
            maxY = Double.MIN_VALUE,
            minY = Double.MAX_VALUE;

    /**
     * Método que verifica e atualiza as variáveis de mínimo e máximo dos dados
     * do Gráfico.
     *
     * @param dados Os dados de uma curva do Gráfico.
     */
    private static void verificarLimites(XYSeries dados) {
        double atualMaxX = dados.getMaxX();
        double atualMinX = dados.getMinX();
        double atualMaxY = dados.getMaxY();
        double atualMinY = dados.getMinY();

        maxX = atualMaxX > maxX ? atualMaxX : maxX;
        minX = atualMinX < minX ? atualMinX : minX;
        maxY = atualMaxY > maxY ? atualMaxY : maxY;
        minY = atualMinY < minY ? atualMinY : minY;
    }

    /**
     * Método responsável por criar um Dataset com todos os dados das curvas a
     * serem exibidas no gráfico.
     *
     * @param curvas Um objeto de uma implementação de
     * {@link SIGPROD2.Modelo.Curvas} do qual será criado o gráfico.
     * @return Um objeto de {@link XYDataset} com todos os dados das curvas a
     * serem exibidas no gráfico.
     */
    private static XYDataset getDataSet(Curvas curvas) {
        int qtdCurvas = curvas.getQtdCurvas();
        XYSeriesCollection conjuntoLinhas = new XYSeriesCollection();
        XYSeries curva;
        List<PontoCurva> pontos;

        for (int i = 0; i < qtdCurvas; i++) {
            curva = new XYSeries(curvas.getNomeCurva(i));
            pontos = curvas.getCurva(i);

            for (PontoCurva ponto : pontos) {
                curva.add(ponto.getCorrente(), ponto.getTempo());
            }
            verificarLimites(curva);
            conjuntoLinhas.addSeries(curva);
        }

        return conjuntoLinhas;
    }

    /**
     * Método responsável por criar e configurar o
     * {@link XYLineAndShapeRenderer} do gráfico.
     *
     * @param curvas Um objeto de uma implementação de
     * {@link SIGPROD2.Modelo.Curvas} do qual será criado o gráfico.
     * @return O {@link XYLineAndShapeRenderer} já criado e configurado para o
     * gráfico.
     */
    private static XYLineAndShapeRenderer criarRender(Curvas curvas) {
        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer(true, false);
        int qtdCurvas = curvas.getQtdCurvas();

        for (int i = 0; i < qtdCurvas; i++) {
            render.setSeriesPaint(i, curvas.getCurvaPaint(i));
            render.setSeriesStroke(i, new BasicStroke(2.0f));
        }
        return render;
    }

    /**
     * Método responsável por calcular o expoente da potência inteira de base 10
     * imediatamnte superior ao numero recebido.
     *
     * @param numero O número que se deseja calcular o expoente.
     * @return O expoente.
     */
    public static double getExpoente(double numero) {
        double log = Math.log10(numero);
        return Math.ceil(log);
    }

    /**
     * Método responsável por configurar a exibição do gráfico.
     *
     * @param plot O {@link Plot} do gráfico.
     * @param curvas Um objeto de uma implementação de
     * {@link SIGPROD2.Modelo.Curvas} do qual será criado o gráfico.
     */
    private static void configurarPlot(XYPlot plot, Curvas curvas) {
        LogAxis xAxis = configurarEscala("Corrente (A)", 0);
        LogAxis yAxis = configurarEscala("Tempo (s)", 1);

        plot.setRenderer(criarRender(curvas));
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setDomainMinorGridlinesVisible(true);
        plot.setDomainMinorGridlinePaint(Color.BLACK);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setRangeMinorGridlinesVisible(true);
        plot.setRangeMinorGridlinePaint(Color.BLACK);
        plot.setDomainAxis(xAxis);
        plot.setRangeAxis(yAxis);
    }

    /**
     * Método responsável por configurar a escala do gráfico, eixo por eixo.
     *
     * @param nome O nome do eixo a ser configurado.
     * @param eixo 0 para eixo X, 1 para eixo Y.
     * @return Um objeto da classe {@link LogAxis} que representa o eixo
     * configurado.
     */
    private static LogAxis configurarEscala(String nome, int eixo) {
        LogAxis axis = new LogAxis(nome);
        DecimalFormat decForm = new DecimalFormat();
        double minimo = eixo == 0 ? minX : minY;
        double maximo = eixo == 0 ? maxX : maxY;
        double min10;
        double max10 = Math.pow(10, getExpoente(maximo)) + Math.pow(10, getExpoente(maximo) - 1);

        if (minimo < 1) {
            min10 = Math.pow(10, getExpoente(minimo) - 1.1);
        } else {
            min10 = Math.pow(10, getExpoente(minimo) - 1);
        }
        axis.setBase(10);
        axis.setMinorTickCount(8);
        axis.setMinorTickMarksVisible(true);
        axis.setBase(10);
        axis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        axis.setNumberFormatOverride(decForm);
        axis.setRange(min10, max10 + 1);
        return axis;
    }

    /**
     * Método responsável por criar um Gráfico.
     *
     * @param curvas Um objeto de uma implementação de
     * {@link SIGPROD2.Modelo.Curvas} do qual será criado o gráfico.
     * @return Uma janela {@link javax.swing.JFrame} com o gráfico criado.
     */
    public static JFrame criarGrafico(Curvas curvas) {
        JFrame janela = new JFrame(curvas.getTitulo());
        XYDataset dados = getDataSet(curvas);
        JFreeChart grafico = ChartFactory.createXYLineChart(curvas.getTitulo(),
                "Corrente (A)",
                "Tempo (s)",
                dados,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        XYPlot plot = grafico.getXYPlot();

        configurarPlot(plot, curvas);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setContentPane(new ChartPanel(grafico));
        janela.pack();
        return janela;
    }
}
