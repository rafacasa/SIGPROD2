package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public class ReleEletromecanico implements Rele {

    private String fabricante;
    private String modelo;
    private int codigo;
    private ArrayList<Double> fatorInicio;
    private TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaFasePickupTempo;
    private TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaNeutroPickupTempo;
    private ArrayList<ArrayList<Double>> correntePickup;
    private ArrayList<ArrayList<Double>> tempo;
    private int qtdPontosFase;
    private int qtdPontosNeutro;
    private boolean[] existeCurva;

    public ReleEletromecanico() {
        this.fatorInicio = new ArrayList<>(4);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.mapaFasePickupTempo = new TreeMap<>();
        this.mapaNeutroPickupTempo = new TreeMap<>();
        this.qtdPontosFase = 0;
        this.qtdPontosNeutro = 0;
        this.tempo = new ArrayList<>(2);
        this.correntePickup = new ArrayList<>();
        this.correntePickup.add(null);
        this.correntePickup.add(null);
        this.correntePickup.add(null);
        this.correntePickup.add(null);
        this.existeCurva = new boolean[4];
    }

    public void addCorrentePickup(ArrayList<Double> corrente, int tipo) {
        this.correntePickup.set(tipo, new ArrayList<>(corrente));
        if (tipo == INVERSA_FASE) {
            for (Double c : corrente) {
                this.mapaFasePickupTempo.put(c, new ArrayList<>());
            }
        } else if (tipo == INVERSA_NEUTRO) {
            for (Double c : corrente) {
                this.mapaNeutroPickupTempo.put(c, new ArrayList<>());
            }
        }
    }

    public void removeCorrentePickup(int tipo) {
        this.correntePickup.set(tipo, new ArrayList());
        if (tipo == INVERSA_FASE) {
            this.mapaFasePickupTempo = new TreeMap<>();
        } else {
            this.mapaNeutroPickupTempo = new TreeMap<>();
        }
    }

    public void addDialDeTempo(int tipo, double corrente, double dial, ArrayList<PontoCurva> pontos) {
        DialDeTempoMecanico dm = new DialDeTempoMecanico(dial, pontos);
        ArrayList<DialDeTempoMecanico> array;

        if (tipo == INVERSA_FASE) {
            array = this.mapaFasePickupTempo.get(corrente);
            array.add(dm);
            this.mapaFasePickupTempo.put(corrente, array);
            this.qtdPontosFase += pontos.size();
        } else {
            array = this.mapaNeutroPickupTempo.get(corrente);
            array.add(dm);
            this.mapaNeutroPickupTempo.put(corrente, array);
            this.qtdPontosNeutro += pontos.size();
        }
    }

    public void removeDialDeTempo(int tipo) {
        if (tipo == Rele.INVERSA_FASE) {
            this.mapaFasePickupTempo = new TreeMap<>();
            this.qtdPontosFase = 0;
        } else {
            this.mapaNeutroPickupTempo = new TreeMap<>();
            this.qtdPontosNeutro = 0;
        }
    }

    public ArrayList<Double> getDialDeTempo(int tipo, double corrente) {
        ArrayList<Double> dial = new ArrayList<>();
        ArrayList<DialDeTempoMecanico> diais;
        if (tipo == INVERSA_FASE) {
            diais = this.mapaFasePickupTempo.get(corrente);
        } else {
            diais = this.mapaNeutroPickupTempo.get(corrente);
        }

        for (DialDeTempoMecanico d : diais) {
            dial.add(d.getDial());
        }
        return dial;
    }

    public ArrayList<PontoCurva> getPontosDialDeTempo(double corrente, double dial, int tipo) {
        ArrayList<DialDeTempoMecanico> dt;
        if (tipo == Rele.INVERSA_FASE) {
            dt = this.mapaFasePickupTempo.get(corrente);
        } else {
            dt = this.mapaNeutroPickupTempo.get(corrente);
        }

        for (DialDeTempoMecanico d : dt) {
            if (d.getDial() == dial) {
                return d.getPontosCurva();
            }
        }
        return null;
    }

    public int getQtdPontosCurva() {
        return qtdPontosFase + qtdPontosNeutro;
    }

    public ArrayList<Double> getCorrentePickup(int tipo) {
        return this.correntePickup.get(tipo);
    }

    public void addTempoDeAtuacao(ArrayList<Double> tempo, int tipo) {
        tipo = tipo - 2;
        this.tempo.add(tipo, tempo);
    }

    public ArrayList<Double> getTempoDeAtuacao(int tipo) {
        tipo = tipo - 2;
        return this.tempo.get(tipo);
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
        return fabricante;
    }

    @Override
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getTipo() {
        return ELETROMECANICO;
    }

    @Override
    public boolean isDigital() {
        return false;

    }

    @Override
    public int getCodigo() {
        return codigo;
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
