/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.Modelo;

/**
 *
 * @author sbrunettajr
 */

public class CaracteristicaCurva {
    
    private String nome;
    private String a;
    private String b;
    private String p;

    public CaracteristicaCurva (String nome, String a, String b, String p) {
        this.nome = nome;
        this.a = a;
        this.b = b;
        this.p = p;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getP() {
        return p;
    }    
    
}
