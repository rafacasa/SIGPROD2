package SIGPROD2.Auxiliar;

import SIGPROD2.Modelo.Curvas;
import SIGPROD2.Modelo.PontoCurva;
import java.awt.BasicStroke;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
 * @version 29/03/2016
 */
public class Grafico {

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
        ArrayList<PontoCurva> pontos;

        for (int i = 0; i < qtdCurvas; i++) {
            curva = new XYSeries(curvas.getNomeCurva(i));
            pontos = curvas.getCurva(i);

            for (PontoCurva ponto : pontos) {
                curva.add(ponto.getTempo(), ponto.getCorrente());
            }
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
     * Método responsável por configurar a exibição do gráfico.
     *
     * @param plot O {@link Plot} do gráfico.
     * @param curvas Um objeto de uma implementação de
     * {@link SIGPROD2.Modelo.Curvas} do qual será criado o gráfico.
     */
    private static void configurarPlot(XYPlot plot, Curvas curvas) {
        LogAxis xAxis = configurarEscala("Tempo");
        LogAxis yAxis = configurarEscala("Corrente");

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
     * @return Um objeto da classe {@link LogAxis} que representa o eixo
     * configurado.
     */
    private static LogAxis configurarEscala(String nome) {
        LogAxis axis = new LogAxis(nome);
        DecimalFormat decForm = new DecimalFormat();

        axis.setBase(10);
        axis.setMinorTickCount(8);
        axis.setMinorTickMarksVisible(true);
        axis.setBase(10);
        axis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        axis.setNumberFormatOverride(decForm);
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
                "Tempo",
                "Corrente",
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
