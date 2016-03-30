package SIGPROD2.Modelo;

/**
 * Esta classe representa um Ponto de Curva de um ELO
 *
 * @author Coelho
 * @version 16/08/2015
 */
public class PontoCurva {

    public static final boolean PONTODACURVAMAXIMA = true;
    public static final boolean PONTODACURVAMINIMA = false;
    private double corrente;
    private double tempo;
    private int id;

    public PontoCurva(double corrente, double tempo, int id) {
        this.corrente = corrente;
        this.tempo = tempo;
        this.id = id;
    }

    public PontoCurva() {
    }

    public PontoCurva(double corrente, double tempo) {
        this.corrente = corrente;
        this.tempo = tempo;
    }

    public double getCorrente() {
        return corrente;
    }

    public void setCorrente(double corrente) {
        this.corrente = corrente;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
