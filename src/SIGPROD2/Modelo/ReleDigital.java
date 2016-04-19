package SIGPROD2.Modelo;

import java.util.ArrayList;
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

    public ReleDigital() {
        this.fatorInicio = new ArrayList(4);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.listaFase = new ArrayList();
        this.listaNeutro = new ArrayList();
        this.correnteMax = new ArrayList(4);
        this.correnteMin = new ArrayList(4);
        this.correntePasso = new ArrayList(4);
        this.tempoMax = new ArrayList(2);
        this.tempoMin = new ArrayList(2);
        this.tempoPasso = new ArrayList(2);
    }

    public List<Double> getTempoMax() {
        return this.tempoMax;
    }

    public void setTempoMax(int tipo, double tempo) {
        this.tempoMax.set(tipo, tempo);
    }

    public void setTempoMax(List<Double> tempoMax) {
        this.tempoMax = tempoMax;
    }

    public List<Double> getTempoMin() {
        return this.tempoMin;
    }

    public void setTempoMin(int tipo, double tempo) {
        this.tempoMin.set(tipo, tempo);
    }

    public void setTempoMin(List<Double> tempoMin) {
        this.tempoMin = tempoMin;
    }

    public List<Double> getTempoPasso() {
        return this.tempoPasso;
    }

    public void setTempoPasso(int tipo, double tempo) {
        this.tempoPasso.set(tipo, tempo);
    }

    public void setTempoPasso(List<Double> tempoPasso) {
        this.tempoPasso = tempoPasso;
    }

    public List<Double> getCorrenteMax() {
        return this.correnteMax;
    }

    public void setCorrenteMax(int tipo, double corrente) {
        this.correnteMax.set(tipo, corrente);
    }

    public void setCorrenteMax(List<Double> correnteMax) {
        this.correnteMax = correnteMax;
    }

    public List<Double> getCorrenteMin() {
        return this.correnteMin;
    }

    public void setCorrenteMin(int tipo, double corrente) {
        this.correnteMin.set(tipo, corrente);
    }

    public void setCorrenteMin(List<Double> correnteMin) {
        this.correnteMin = correnteMin;
    }

    public List<Double> getCorrentePasso() {
        return this.correntePasso;
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
    public void addFatorInicio(double fator, int tipo) {
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
}
