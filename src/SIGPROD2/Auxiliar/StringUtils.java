/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD2.Auxiliar;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

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

    public static String montarComandoSQL(int qtd, String original, String variaveis) {
        String comando = original;

        for (int i = 1; i < qtd; i++) {
            comando += variaveis;
        }
        return comando;
    }

    public static String getStackTrace(Exception ex) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        ex.printStackTrace(pw);
        return sw.toString();
    }

    public static boolean isNumeric(String valor) {
        try {
            double d = Double.parseDouble(valor);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean verificaExpressao(double min, double max, double pas) {
        return min < max && (max - min) >= pas;
    }
}
