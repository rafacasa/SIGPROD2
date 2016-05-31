package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Rafael Casa
 * @version 19/05/16
 */
public class ReligadorEletromecanico implements Religador {

    private String fabricante;
    private String modelo;
    private int codigo;
    private List<Double> fatorInicio;
    private List<Double> tempoReligamento;
    private boolean[] existeCurva;
    private Map<Double, List<DialDeTempoMecanico>> mapaFaseRapidaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaNeutroRapidaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaFaseLentaPickupTempo;
    private Map<Double, List<DialDeTempoMecanico>> mapaNeutroLentaPickupTempo;
    private List<List<Double>> correntePickup;
    private List<Double> tempoDefinidaFaseLenta;
    private List<Double> tempoDefinidaNeutraLenta;
    private List<Double> tempoDefinidaFaseRapida;
    private List<Double> tempoDefinidaNeutraRapida;
    /*private int qtdPontosFase;
    private int qtdPontosNeutro;*/

    public ReligadorEletromecanico() {
        this.fatorInicio = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        this.correntePickup = Arrays.asList(null, null, null, null);
        this.mapaFaseLentaPickupTempo = new TreeMap<>();
        this.mapaFaseRapidaPickupTempo = new TreeMap<>();
        this.mapaNeutroLentaPickupTempo = new TreeMap<>();
        this.mapaNeutroRapidaPickupTempo = new TreeMap<>();
        this.tempoReligamento = new ArrayList<>();
        this.tempoDefinidaFaseLenta = new ArrayList<>();
        this.tempoDefinidaFaseRapida = new ArrayList<>();
        this.tempoDefinidaNeutraRapida = new ArrayList<>();
        this.tempoDefinidaNeutraLenta = new ArrayList<>();
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
        return Religador.ELETROMECANICO;
    }

    @Override
    public boolean isDigital() {
        return false;
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
