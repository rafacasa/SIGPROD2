package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public class ReleEletromecanico extends Rele {

    TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaFasePickupTempo;
    TreeMap<Double, ArrayList<DialDeTempoMecanico>> mapaNeutroPickupTempo;
    ArrayList<ArrayList<Double>> tempo;

    public ReleEletromecanico() {
        super();
        this.setTipo(ELETROMECANICO);
        this.mapaFasePickupTempo = new TreeMap();
        this.mapaNeutroPickupTempo = new TreeMap();
        this.tempo = new ArrayList<>();
    }

    /*public void setCorrentePickup(String correntes, int tipo) {
        
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

     public void addDialDeTempo(int tipo, double correntePickup, double dialTempo) {
     if (tipo == INVERSA_FASE) {
     this.mapaFasePickupTempo.get(correntePickup).add(new DialDeTempoMecanico(dialTempo));
     } else if (tipo == INVERSA_NEUTRO) {
     this.mapaNeutroPickupTempo.get(correntePickup).add(new DialDeTempoMecanico(dialTempo));
     } else {
     throw new IllegalArgumentException();
     }
     }*/
    @Override
    public void addCorrentePickup(List<Double> corrente, int tipo) {
        super.addCorrentePickup(corrente, tipo);
        if (tipo == INVERSA_FASE) {
            for (Double c : corrente) {
                this.mapaFasePickupTempo.put(c, new ArrayList<>());
            }
        } else {
            for (Double c : corrente) {
                this.mapaNeutroPickupTempo.put(c, new ArrayList<>());
            }
        }
    }

    @Override
    public void removeCorrentePickup(int tipo) {
        super.removeCorrentePickup(tipo);
        if (tipo == INVERSA_FASE) {
            this.mapaFasePickupTempo = new TreeMap<>();
        } else {
            this.mapaNeutroPickupTempo = new TreeMap<>();
        }
    }

    public void addDialDeTempo(int tipo, double corrente, double dial, ArrayList<PontoCurva> pontos) {
        if (tipo == INVERSA_FASE) {
            DialDeTempoMecanico dm = new DialDeTempoMecanico(dial, pontos);
            ArrayList<DialDeTempoMecanico> array;
            array = this.mapaFasePickupTempo.get(corrente);
            array.add(dm);
            this.mapaFasePickupTempo.put(corrente, array);
        }
    }

    public ArrayList<Double> getDialDeTempo(int tipo, double corrente) {
        ArrayList<Double> dial = new ArrayList<>();
        if (tipo == INVERSA_FASE) {
            ArrayList<DialDeTempoMecanico> diais = this.mapaFasePickupTempo.get(corrente);
            for (DialDeTempoMecanico d : diais) {
                dial.add(d.getDial());
            }
        } else {

        }
        return dial;
    }

    public ArrayList<PontoCurva> getPontosDialDeTempo(double corrente, double dial, int tipo) {
        if (tipo == Rele.INVERSA_FASE) {
            ArrayList<DialDeTempoMecanico> dt = this.mapaFasePickupTempo.get(corrente);
            for (DialDeTempoMecanico d : dt) {
                if (d.getDial() == dial) {
                    return new ArrayList(d.getPontosCurva());
                }
            }
        }
        return null;
    }
    
    public void addTempoDeAtuacao (ArrayList<Double> tempo, int tipo) {
        tipo = tipo - 2;
        this.tempo.add(tipo, tempo);
    }

}
