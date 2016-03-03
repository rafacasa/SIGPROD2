/*
 * Esta classe tem métodos estáticos para apresentar mensagens de erro ao usuário.
 */
package SIGPROD2.Auxiliar;

import SIGPROD2.GUI.GUI_Elo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Coelho
 * @version 16/08/2015
 */
public class Mensagem {

    public static void mostraMensagemInsercao(JFrame janela) {
        JOptionPane.showMessageDialog(janela,
                "Cadastro realizado com sucesso!",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
    }    

    public static void mostraMensagemExclusao(JFrame janela) {
        JOptionPane.showMessageDialog(janela,
                "Exclusão realizada com sucesso!",
                "Remoção",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostraMensagemArquivo(GUI_Elo janela) {
        JOptionPane.showMessageDialog(janela,
                "Arquivo salvo com sucesso!",
                "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
