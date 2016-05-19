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
    private List<Double> tempoMax, tempoMin, tempoPasso;
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
        this.tempoMax = Arrays.asList(0.0, 0.0);
        this.tempoMin = Arrays.asList(0.0, 0.0);
        this.tempoPasso = Arrays.asList(0.0, 0.0);
        this.existeCurva = new boolean[4];
    }

    public void setValuesCorrente(int tipo, double min, double max, double pas) {
        this.correnteMin.set(tipo, min);
        this.correnteMax.set(tipo, max);
        this.correntePasso.set(tipo, pas);
    }

    public void setValuesTempo(int tipo, double min, double max, double pas) {
        this.tempoMax.set(tipo, min);
        this.tempoMin.set(tipo, max);
        this.tempoPasso.set(tipo, pas);
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
}
