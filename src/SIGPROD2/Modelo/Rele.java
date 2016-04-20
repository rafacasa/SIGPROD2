package SIGPROD2.Modelo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 30/03/2016
 */
public abstract class Rele {

    private String fabricante;
    private String modelo;
    private int tipo;
    private int codigo;
    private List<Double> fatorInicio;

    public static final int DIGITAL = 0;
    public static final int ELETROMECANICO = 1;
    public static final int INVERSA_FASE = 0;
    public static final int INVERSA_NEUTRO = 1;
    public static final int DEFINIDO_FASE = 2;
    public static final int DEFINIDO_NEUTRO = 3;

    public Rele() {
        this.fatorInicio = Arrays.asList(0.0, 0.0, 0.0, 0.0);
    }

    public double getFatorInicio(int tipo) {
        return this.fatorInicio.get(tipo);
    }

    public void setFatorInicio(double fator, int tipo) {
        this.fatorInicio.set(tipo, fator);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isDigital() {
        return this.tipo == DIGITAL;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
