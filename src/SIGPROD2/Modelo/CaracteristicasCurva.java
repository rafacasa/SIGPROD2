package SIGPROD2.Modelo;

/**
 *
 * @author Rafael Casa
 * @version 07/04/2016
 */
public class CaracteristicasCurva {

    private String nome;
    private int a, b, p;

    public CaracteristicasCurva() {
    }

    public CaracteristicasCurva(String nome, int a, int b, int p) {
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

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}
