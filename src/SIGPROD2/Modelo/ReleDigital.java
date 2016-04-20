package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 12/04/2016
 */
public class ReleDigital implements Rele {

    private String fabricante;
    private String modelo;
    private int codigo;
    private List<Double> fatorInicio;
    private List<CaracteristicasCurva> listaFase, listaNeutro;
    private List<Double> correnteMax, correnteMin, correntePasso;
    private List<Double> tempoMax, tempoMin, tempoPasso;
    private boolean[] existeCurva;

    public ReleDigital() {
        this.fatorInicio = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.listaFase = new ArrayList<>();
        this.listaNeutro = new ArrayList<>();
        this.correnteMax = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correnteMin = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correntePasso = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.tempoMax = Arrays.asList(0.0, 0.0);
        this.tempoMin = Arrays.asList(0.0, 0.0);
        this.tempoPasso = Arrays.asList(0.0, 0.0);
        this.existeCurva = new boolean[4];

    }

    public Double getTempoMax(int tipo) {
        return this.tempoMax.get(tipo);
    }

    public void setTempoMax(int tipo, double tempo) {
        this.tempoMax.set(tipo, tempo);
    }

    public void setTempoMax(List<Double> tempoMax) {
        this.tempoMax = tempoMax;
    }

    public Double getTempoMin(int tipo) {
        return this.tempoMin.get(tipo);
    }

    public void setTempoMin(int tipo, double tempo) {
        this.tempoMin.set(tipo, tempo);
    }

    public void setTempoMin(List<Double> tempoMin) {
        this.tempoMin = tempoMin;
    }

    public Double getTempoPasso(int tipo) {
        return this.tempoPasso.get(tipo);
    }

    public void setTempoPasso(int tipo, double tempo) {
        this.tempoPasso.set(tipo, tempo);
    }

    public void setTempoPasso(List<Double> tempoPasso) {
        this.tempoPasso = tempoPasso;
    }

    public Double getCorrenteMax(int tipo) {
        return this.correnteMax.get(tipo);
    }

    public void setCorrenteMax(int tipo, double corrente) {
        this.correnteMax.set(tipo, corrente);
    }

    public void setCorrenteMax(List<Double> correnteMax) {
        this.correnteMax = correnteMax;
    }

    public Double getCorrenteMin(int tipo) {
        return this.correnteMin.get(tipo);
    }

    public void setCorrenteMin(int tipo, double corrente) {
        this.correnteMin.set(tipo, corrente);
    }

    public void setCorrenteMin(List<Double> correnteMin) {
        this.correnteMin = correnteMin;
    }

    public Double getCorrentePasso(int tipo) {
        return this.correntePasso.get(tipo);
    }

    public void setCorrentePasso(int tipo, double corrente) {
        this.correntePasso.set(tipo, corrente);
    }

    public void setCorrentePasso(List<Double> correntePasso) {
        this.correntePasso = correntePasso;
    }

    public List<CaracteristicasCurva> getListaFase() {
        return this.listaFase;
    }

    public void setListaFase(List<CaracteristicasCurva> listaFase) {
        this.listaFase = new ArrayList(listaFase);
    }

    public List<CaracteristicasCurva> getListaNeutro() {
        return this.listaNeutro;
    }

    public void setListaNeutro(List<CaracteristicasCurva> listaNeutro) {
        this.listaNeutro = new ArrayList(listaNeutro);
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
        return DIGITAL;
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
