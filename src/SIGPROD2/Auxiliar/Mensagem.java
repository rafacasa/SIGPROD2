package SIGPROD2.Auxiliar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Esta classe tem métodos estáticos para apresentar mensagens de erro ao
 * usuário.
 *
 * @author Rafael Coelho
 * @author Sérgio Brunetta Júnior
 * @version 23/03/2K16
 *
 */
public class Mensagem {

    private static void mostraMensagem(JFrame janela, String message, String titulo) {
        JOptionPane.showMessageDialog(janela,
                message,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostraMensagemInsercao(JFrame janela, int numElo) {
        mostraMensagem(janela, "ELO " + numElo + " inserido com Sucesso!", "Inserção");
    }

    public static void mostraMensagemExclusao(JFrame janela, int numElo) {
        mostraMensagem(janela, "ELO " + numElo + " deletado com sucesso!", "Remoção");
    }

    public static void mostraMensagemSelecioneColuna(JFrame janela) {
        mostraMensagem(janela, "Coluna não selecionada", "Seleção");
    }

    public static void mostraMensagemSucesso(JFrame janela) {
        mostraMensagem(janela, "Operação concluída com sucesso", "Sucesso");
    }
}
