package SIGPROD2.Auxiliar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe responsável por JOptionPanes que entram com dados
 *
 * @author Sérgio Brunetta Júnior
 * @version 15/03/2016
 */
public class Entrada {

    private static String perguntaEntrada(JFrame janela, String text, String titulo) {
        return JOptionPane.showInputDialog(janela, text, titulo, 3);
    }

    public static String valorColuna(JFrame janela) {
        return perguntaEntrada(janela, "Insira o valor(kV)", "valorColuna");
    }

    public static String valorLinha(JFrame janela) {
        return perguntaEntrada(janela, "Insira o valor(kVA)", "valorLinha");
    }

    public static String alteraValorPosicao(JFrame janela, String oldValue) {
        return JOptionPane.showInputDialog(janela, "Corrente : Tipo", oldValue);
    }

}
