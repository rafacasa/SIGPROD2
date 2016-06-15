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
    
    private boolean first;
    private String tipo;
    private int corrente;

    public Posicao () {
        this.tipo = null;
        this.corrente = 0;
    }
    
    public Posicao (int corrente, boolean first) {
        this.corrente = corrente;
        this.first = first;
        this.tipo = null;
    }
    
    public Posicao(int corrente, String tipo) {
        this.tipo = tipo;
        this.corrente = corrente;
    }

    public String getTipo() {
        return tipo.trim();
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
        String[] list = texto.split(":");
        
        temp.setTipo(list[1]);
        temp.setCorrente(Integer.parseInt(list[0].trim()));
        return temp;
    }
    
    @Override
    public String toString() {
        if ( this.first ) {
            return String.valueOf(this.corrente) + " kVA ";
        } else {
            if ( this.corrente == 0 && this.tipo == null ) {
                return " : ";                
            } 
        }
        return this.corrente + " : " + this.tipo;
    }
    
}
