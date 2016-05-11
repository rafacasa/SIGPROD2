/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.Auxiliar;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sbrunettajr
 */
public class StringUtils {

    public static boolean separaValores(String valores, List<Double> a) {
        String[] s = valores.split(",");        
        
        for (String item : s) {
            String str = item.trim();
            
            if (!str.isEmpty()) {
                if (isNumeric(str)) {
                    double valor = Double.parseDouble(str);
                    
                    a.add(valor);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNumeric (String valor) {
        try {
            double d = Double.parseDouble(valor);
            
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList();

        if (separaValores("2, 3, 4, 5, 5, 4", a)) {

            for (Double valore : a) {
                System.out.println(valore);
            }
        } else {
            System.out.println("Bug");
        }
    }
}
