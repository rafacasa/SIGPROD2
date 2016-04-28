/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGPROD;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.Modelo.EloK;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rafael
 */
public class inserirElos {

    public static void main(String[] args) {
        Gson json = new Gson();
        List<Arquivo> arq = Arrays.asList(new Arquivo("6.temp"), new Arquivo("10.temp"), new Arquivo("15.temp"), new Arquivo("25.temp"), new Arquivo("40.temp"), new Arquivo("65.temp"));
        arq.forEach(a -> {
            String s = a.lerArquivo();
            EloK elo = json.fromJson(s, EloK.class);
            try {
                SIGPROD2.DAO.EloKDao.insereEloK(elo);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        /*List<Double> lista = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        lista.set(0, 1.1);
        lista.set(1, 2.2);
        lista.set(2, 3.3);
        lista.set(3, 4.4);
        lista.add(5.5);
        lista.forEach(d -> System.out.println(d));*/
    }
}
