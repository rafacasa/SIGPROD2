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

    public Posicao () {
        this.tipo = null;
        this.corrente = 0;
    }
    
    public Posicao (int corrente) {
        this.corrente = corrente;
        this.tipo = null;
    }
    
    public Posicao(int corrente, String tipo) {
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

    public static Posicao getPosicao(String texto) {
        Posicao temp = new Posicao();
        String[] split = texto.split(":");
        temp.setTipo(split[1]);
        temp.setCorrente(Integer.parseInt(split[0]));
        return temp;
    }
    
    @Override
    public String toString() {
        if (this.corrente == 0 && this.tipo == null) {
            return ":";
        } else {
            if (this.corrente > 0 && this.tipo == null) {
                return String.valueOf(this.corrente) + " kVA ";
            }
        }
        return this.corrente + ":" + this.tipo;
    }
    
    
}
