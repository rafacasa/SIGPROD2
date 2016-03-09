/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.Modelo;

/**
 *
 * @author Coelho
 * 
 */

public class Posicao {
    
    private String tipo;
    private int corrente;

    public Posicao(String tipo, int corrente) {
        this.tipo = tipo;
        this.corrente = corrente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCorrente() {
        return corrente;
    }

    public void setCorrente(int corrente) {
        this.corrente = corrente;
    }

    @Override
    public String toString() {
        return tipo + ":" + String.valueOf(corrente);
    }
    
    
}
