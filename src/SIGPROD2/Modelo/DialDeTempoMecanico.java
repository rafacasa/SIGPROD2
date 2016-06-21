package SIGPROD2.Modelo;

import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version
 */
public class DialDeTempoMecanico implements Curvas {

    private List<PontoCurva> pontosCurva;
    private double dial;

    public DialDeTempoMecanico(double dial) {
        this.pontosCurva = new ArrayList<>();
        this.dial = dial;
    }

    public DialDeTempoMecanico(double dial, List<PontoCurva> pontos) {
        this.dial = dial;
        this.pontosCurva = pontos;
    }

    public void addPontoCurva(PontoCurva ponto) {
        this.pontosCurva.add(ponto);
    }

    public List<PontoCurva> getPontosCurva() {
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

    @Override
    public String toString() {
        return String.valueOf(this.dial);
    }

    @Override
    public String getTitulo() {
        return "Gráfico do Dial " + this.dial;
    }

    @Override
    public int getQtdCurvas() {
        return 1;
    }

    @Override
    public String getNomeCurva(int index) {
        return "Curva do Dial " + this.dial;
    }

    @Override
    public ArrayList<PontoCurva> getCurva(int index) {
        return new ArrayList<>(this.pontosCurva);
    }

    @Override
    public Paint getCurvaPaint(int index) {
        return java.awt.Color.BLACK;
    }
}
