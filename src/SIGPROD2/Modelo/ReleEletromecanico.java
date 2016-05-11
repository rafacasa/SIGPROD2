package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public class ReleEletromecanico extends Rele {

    private TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaFasePickupTempo;
    private TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaNeutroPickupTempo;
    private List<ArrayList<Double>> correntePickup;
    private List<ArrayList<Double>> tempo;
    private int qtdPontosFase;
    private int qtdPontosNeutro;

    public ReleEletromecanico() {
        super();
        this.setTipo(ELETROMECANICO);
        this.mapaFasePickupTempo = new TreeMap();
        this.mapaNeutroPickupTempo = new TreeMap();
        this.qtdPontosFase = 0;
        this.qtdPontosNeutro = 0;
        this.tempo = Arrays.asList(new ArrayList(), new ArrayList());
        this.correntePickup = Arrays.asList(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public void setCorrentePickup(List<Double> corrente, int tipo) {
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
    
    public void removeDialDeTempo (int tipo) {
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
        ArrayList<DialDeTempoMecanico> dm;
        
        if (tipo == INVERSA_FASE) {
            dm = this.mapaFasePickupTempo.get(corrente);
        } else {
            dm = this.mapaNeutroPickupTempo.get(corrente);
        }
        for (DialDeTempoMecanico d : dm) {
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

    public void setTempoDeAtuacao(List<Double> tempo, int tipo) {
        tipo = tipo - 2;
        this.tempo.set(tipo, new ArrayList(tempo));
    }

    public ArrayList<Double> getTempoDeAtuacao(int tipo) {
        tipo = tipo - 2;
        return this.tempo.get(tipo);
    }
}
