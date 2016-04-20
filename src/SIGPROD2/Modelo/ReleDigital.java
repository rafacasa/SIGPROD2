package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 12/04/2016
 */
public class ReleDigital extends Rele {

    private List<CaracteristicasCurva> listaFase, listaNeutro;
    private List<Double> correnteMax, correnteMin, correntePasso;
    private List<Double> tempoMax, tempoMin, tempoPasso;

    public ReleDigital() {
        super();
        this.setTipo(DIGITAL);
        this.listaFase = new ArrayList();
        this.listaNeutro = new ArrayList();
        this.correnteMax = Arrays.asList(0.0, 0.0,0.0, 0.0);
        this.correnteMin = Arrays.asList(0.0, 0.0,0.0, 0.0);
        this.correntePasso = Arrays.asList(0.0, 0.0,0.0, 0.0);
        this.tempoMax = Arrays.asList(0.0, 0.0);
        this.tempoMin = Arrays.asList(0.0, 0.0);
        this.tempoPasso = Arrays.asList(0.0, 0.0);
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

    public List<Double> getTempoMax() {
        return tempoMax;
    }

    public void setTempoMax(int tipo, double tempo) {
        this.tempoMax.set(tipo, tempo);
    }

    public void setTempoMax(List<Double> tempoMax) {
        this.tempoMax = tempoMax;
    }

    public List<Double> getTempoMin() {
        return tempoMin;
    }

    public void setTempoMin(int tipo, double tempo) {
        this.tempoMin.set(tipo, tempo);
    }

    public void setTempoMin(List<Double> tempoMin) {
        this.tempoMin = tempoMin;
    }

    public List<Double> getTempoPasso() {
        return tempoPasso;
    }

    public void setTempoPasso(int tipo, double tempo) {
        this.tempoPasso.set(tipo, tempo);
    }

    public void setTempoPasso(List<Double> tempoPasso) {
        this.tempoPasso = tempoPasso;
    }

    public List<Double> getCorrenteMax() {
        return correnteMax;
    }

    public void setCorrenteMax(int tipo, double corrente) {
        this.correnteMax.set(tipo, corrente);
    }

    public void setCorrenteMax(List<Double> correnteMax) {
        this.correnteMax = correnteMax;
    }

    public List<Double> getCorrenteMin() {
        return correnteMin;
    }

    public void setCorrenteMin(int tipo, double corrente) {
        this.correnteMin.set(tipo, corrente);
    }

    public void setCorrenteMin(List<Double> correnteMin) {
        this.correnteMin = correnteMin;
    }

    public List<Double> getCorrentePasso() {
        return correntePasso;
    }

    public void setCorrentePasso(int tipo, double corrente) {
        this.correntePasso.set(tipo, corrente);
    }

    public void setCorrentePasso(List<Double> correntePasso) {
        this.correntePasso = correntePasso;
    }

    public List<CaracteristicasCurva> getListaFase() {
        return listaFase;
    }

    public void setListaFase(List<CaracteristicasCurva> listaFase) {
        this.listaFase = new ArrayList(listaFase);
    }

    public List<CaracteristicasCurva> getListaNeutro() {
        return listaNeutro;
    }

    public void setListaNeutro(List<CaracteristicasCurva> listaNeutro) {
        this.listaNeutro = new ArrayList(listaNeutro);
    }
}
