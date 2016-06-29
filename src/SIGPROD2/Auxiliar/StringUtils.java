/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.Auxiliar;

import java.util.List;

/**
 *
 * @author sbrunettajr
 */
public class StringUtils {

    public static boolean separaValores(String valores, List<Double> a) {
        String[] v = valores.split(",");        
        
        for (String item : v) {
            String i = item.trim();
            
            if (!i.isEmpty() && isNumber(i)) {
                    double valor = Double.parseDouble(i);
                    
                    a.add(valor);
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNumber (String valor) {
        try {
            double d = Double.parseDouble(valor);
            
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    public static boolean isLetter(char digit) {
        int value = (int) digit;

        if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
            return true;
        }
        return false;
    }
    
    public static boolean verificaExpressao(double min, double max, double pas) {
        if (min < max && (max - min) >= pas) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        System.out.println(verificaExpressao(1, 3, 2));
        
    }
}
