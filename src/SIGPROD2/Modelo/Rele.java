package SIGPROD2.Modelo;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.AbstractList;
import java.util.ArrayList;
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
    private List<List<Double>> correntePickup;
    private List<Double> fatorInicio;

    public static final int DIGITAL = 0;
    public static final int ELETROMECANICO = 1;
    public static final int INVERSA_FASE = 0;
    public static final int INVERSA_NEUTRO = 1;
    public static final int DEFINIDO_FASE = 2;
    public static final int DEFINIDO_NEUTRO = 3;

    public Rele() {
        this.correntePickup = new ArrayList<>();
        this.fatorInicio = new ArrayList<>();
        
        this.correntePickup.add(0, new ArrayList<>());
        this.correntePickup.add(1, new ArrayList<>());
        this.correntePickup.add(2, new ArrayList<>());
        this.correntePickup.add(3, new ArrayList<>());
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
        this.fatorInicio.add(0.0);
    }

    public double getFatorInicio(int tipo) {
        return this.fatorInicio.get(tipo);
    }

    public List<Double> getCorrentePickup(int tipo) {
        return this.correntePickup.get(tipo);
    }

    public void addFatorInicio(double fator, int tipo) {
        this.fatorInicio.add(tipo, fator);
    }

    protected void addCorrentePickup(List<Double> corrente, int tipo) {
        this.correntePickup.add(tipo, corrente);
    }
    
    protected void removeCorrentePickup (int tipo) {
        this.correntePickup.set(tipo, new ArrayList());
    }

    public void addCorrentePickup(double corrente, int tipo) {
        this.correntePickup.get(tipo).add(corrente);
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
