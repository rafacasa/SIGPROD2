/*
 * Esta classe tem métodos estáticos para apresentar mensagens de erro ao usuário.
 */
package SIGPROD2.Auxiliar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Coelho
 * @version 16/08/2015
 */
public class Erro {

    public static void mostraMensagem(JFrame janela, String texto) {
        JOptionPane.showMessageDialog(janela,
                texto,
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
        System.out.println(texto);
    }

    public static void mostraMensagemSQL(JFrame janela, Exception ex) {
        JOptionPane.showMessageDialog(janela,
                "Erro de SQL no banco de dados.",
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }

    public static void mostraMensagemClasse(JFrame janela, Exception ex) {
        JOptionPane.showMessageDialog(janela,
                "Erro de Classe no banco de dados.",
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }

    public static void mostraMensagemInsercao(JFrame janela) {
        JOptionPane.showMessageDialog(janela,
                "Erro no cadastro. Visualize o arquivo de log para maiores informações.",
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
        System.out.println("Erro no cadastro.");
    }
}
