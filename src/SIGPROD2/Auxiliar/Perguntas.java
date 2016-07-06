package SIGPROD2.Auxiliar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe responsável por gerenciar as perguntas necessárias para a execução do
 * programa.
 *
 * @author Sérgio Brunetta
 * @version 13/04/2016
 */
public class Perguntas {

    private static int fazPergunta(JFrame janela, String text) {
        return JOptionPane.showConfirmDialog(janela, text, "Confirmação", JOptionPane.YES_NO_OPTION);
    }

    public static int perguntaCancelar(JFrame janela) {
        return fazPergunta(janela, "Deseja cancelar?");
    }

}
