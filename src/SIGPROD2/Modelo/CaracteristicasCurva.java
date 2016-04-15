package SIGPROD2.Modelo;

/**
 * Classe responsável por modelar as Características de Curva de um Relé
 * digital.
 *
 * @author Rafael Casa
 * @version 07/04/2016
 */
public class CaracteristicasCurva {

    private String nome;
    private double a, b, p;

    public CaracteristicasCurva() {
    }

    public CaracteristicasCurva(String nome, double a, double b, double p) {
        this.nome = nome;
        this.a = a;
        this.b = b;
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }
}
