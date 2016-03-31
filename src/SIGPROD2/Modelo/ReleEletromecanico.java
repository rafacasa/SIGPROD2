package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public class ReleEletromecanico extends Rele {

    TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaFasePickupTempo;
    TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaNeutroPickupTempo;

    public ReleEletromecanico() {
        super();
        this.setTipo(ELETROMECANICO);
        this.mapaFasePickupTempo = new TreeMap();
        this.mapaNeutroPickupTempo = new TreeMap();
    }

    public void setCorrentePickup(String correntes, int tipo) {
        String[] vetorCorrentes = correntes.split(",");

        for (String corrente : vetorCorrentes) {
            corrente = corrente.trim();
            super.addCorrentePickup(Double.parseDouble(corrente), tipo);
        }
    }

    public void setDialTempo(int tipo, double correntePickup, ArrayList<DialDeTempoMecanico> dialTempo) {
        if (tipo == INVERSA_FASE) {
            this.mapaFasePickupTempo.put(correntePickup, dialTempo);
        } else if (tipo == INVERSA_NEUTRO) {
            this.mapaNeutroPickupTempo.put(correntePickup, dialTempo);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addPontoCurva(int tipo, double correntePickup, double dialTempo, double corrente, double tempo) {
        PontoCurva paraInserir = new PontoCurva(corrente, tempo);
        if (tipo == INVERSA_FASE) {
            ArrayList<DialDeTempoMecanico> array = this.mapaFasePickupTempo.get(correntePickup);
            for (DialDeTempoMecanico dial : array) {
                if (dial.getDial() == dialTempo) {
                    dial.addPontoCurva(paraInserir);
                }
            }
        } else if (tipo == INVERSA_NEUTRO) {
            ArrayList<DialDeTempoMecanico> array = this.mapaNeutroPickupTempo.get(correntePickup);
            for (DialDeTempoMecanico dial : array) {
                if (dial.getDial() == dialTempo) {
                    dial.addPontoCurva(paraInserir);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addDialDeTempo(int tipo, int correntePickup, double dialTempo) {
        if (tipo == INVERSA_FASE) {
            this.mapaFasePickupTempo.get(correntePickup).add(new DialDeTempoMecanico(dialTempo));
        } else if (tipo == INVERSA_NEUTRO) {
            this.mapaNeutroPickupTempo.get(correntePickup).add(new DialDeTempoMecanico(dialTempo));
        } else {
            throw new IllegalArgumentException();
        }
    }
}
