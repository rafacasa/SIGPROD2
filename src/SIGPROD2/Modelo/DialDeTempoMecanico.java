package SIGPROD2.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Rafael Casa
 * @version
 */
public class DialDeTempoMecanico {

    private ArrayList<PontoCurva> pontosCurva;
    private double dial;

    public DialDeTempoMecanico(double dial) {
        this.pontosCurva = new ArrayList<>();
        this.dial = dial;
    }

    public void addPontoCurva(PontoCurva ponto) {
        this.pontosCurva.add(ponto);
    }

    public ArrayList<PontoCurva> getPontosCurva() {
        return pontosCurva;
    }

    public void setPontosCurva(ArrayList<PontoCurva> pontosCurva) {
        this.pontosCurva = pontosCurva;
    }

    public double getDial() {
        return dial;
    }

    public void setDial(double dial) {
        this.dial = dial;
    }

}
