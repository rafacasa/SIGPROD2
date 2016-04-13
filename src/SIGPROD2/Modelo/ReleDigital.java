package SIGPROD2.Modelo;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public class ReleDigital extends Rele {

    TreeMap<Integer, ArrayList<DialDeTempoDigital>> mapaFasePickupTempo;
    TreeMap<Integer, ArrayList<DialDeTempoDigital>> mapaNeutroPickupTempo;

    public ReleDigital() {
        super();
        super.setTipo(DIGITAL);
        this.mapaFasePickupTempo = new TreeMap();
        this.mapaNeutroPickupTempo = new TreeMap();
    }

    public void setCorrentePickup(double inicio, double fim, double passo, int tipo) {
        for (double x = inicio; x <= fim; x += passo) {
            super.addCorrentePickup(x, tipo);
        }
    }

    public void setDialTempo(int tipo, int correntePickup, ArrayList<DialDeTempoDigital> dialTempo) {
        if (tipo == INVERSA_FASE) {
            this.mapaFasePickupTempo.put(correntePickup, dialTempo);
        } else if (tipo == INVERSA_NEUTRO) {
            this.mapaNeutroPickupTempo.put(correntePickup, dialTempo);
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    
}
