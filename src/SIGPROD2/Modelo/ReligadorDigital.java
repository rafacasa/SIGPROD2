package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 19/05/16
 */
public class ReligadorDigital implements Religador {

    private String fabricante;
    private String modelo;
    private int codigo;
    private List<Double> fatorInicio;
    private List<Double> correnteMax, correnteMin, correntePasso;
    private List<Double> tempoRapidoMax, tempoRapidoMin, tempoRapidoPasso;
    private List<Double> tempoLentoMax, tempoLentoMin, tempoLentoPasso;
    private List<CaracteristicasCurva> listaLentaFase, listaLentaNeutro, listaRapidaFase, listaRapidaNeutro;
    private boolean[] existeCurva;
    private double religamentoMin, religamentoMax, religamentoPasso;

    public ReligadorDigital() {
        this.fatorInicio = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.listaLentaFase = new ArrayList<>();
        this.listaLentaNeutro = new ArrayList<>();
        this.listaRapidaFase = new ArrayList<>();
        this.listaRapidaNeutro = new ArrayList<>();
        this.correnteMax = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correnteMin = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correntePasso = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoRapidoMax = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoRapidoMin = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoRapidoPasso = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoLentoMax = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoLentoMin = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoLentoPasso = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.existeCurva = new boolean[4];
    }

    public void setValuesCorrente(int tipo, double min, double max, double pas) {
        this.correnteMin.set(tipo, min);
        this.correnteMax.set(tipo, max);
        this.correntePasso.set(tipo, pas);
    }

    public void setValuesTempo(int tipo, double min, double max, double pas, boolean rapida) {
        if (rapida) {
            this.tempoRapidoMin.set(tipo, min);
            this.tempoRapidoMax.set(tipo, max);
            this.tempoRapidoPasso.set(tipo, pas);
        } else {
            this.tempoLentoMin.set(tipo, min);
            this.tempoLentoMax.set(tipo, max);
            this.tempoLentoPasso.set(tipo, pas);
        }
    }

    public void setValuesReligamento(int min, int max, int pas) {
        this.religamentoMin = min;
        this.religamentoMax = max;
        this.religamentoPasso = pas;
    }

    public void setListaFaseRapida(List<CaracteristicasCurva> lista) {
        this.listaRapidaFase = new ArrayList<>(lista);
    }

    public void setListaFaseLenta(List<CaracteristicasCurva> lista) {
        this.listaLentaFase = new ArrayList<>(lista);
    }

    public void setListaNeutroRapida(List<CaracteristicasCurva> lista) {
        this.listaRapidaNeutro = new ArrayList<>(lista);
    }

    public void setListaNeutroLenta(List<CaracteristicasCurva> lista) {
        this.listaLentaNeutro = new ArrayList<>(lista);
    }

    @Override
    public double getFatorInicio(int tipo) {
        return this.fatorInicio.get(tipo);
    }

    @Override
    public void setFatorInicio(double fator, int tipo) {
        this.fatorInicio.set(tipo, fator);
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getTipo() {
        return Religador.DIGITAL;
    }

    @Override
    public boolean isDigital() {
        return true;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean existeCurva(int codigo) {
        return this.existeCurva[codigo];
    }

    @Override
    public void setExisteCurva(int codigo, boolean existeCurva) {
        this.existeCurva[codigo] = existeCurva;
    }
}
