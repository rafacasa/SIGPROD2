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
 * 
 */
public class Erro {

    private static void mostraMensagem(JFrame janela, String texto) {
        JOptionPane.showMessageDialog(janela,
                texto,
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public static void arquivoInexistente (JFrame janela) {
        mostraMensagem(janela, "Arquivo Inexistente");
    }
    
    public static void aberturaDeArquivo (JFrame janela) {
        mostraMensagem(janela, "Não foi possível abrir o arquivo");
    }
    
    public static void naoPermitidaLeitura (JFrame janela) {
        mostraMensagem(janela, "Não é permitido ler este Arquivo");
    }
    
    public static void correnteVazia (JFrame janela) {
        mostraMensagem(janela, "Digite algum valor para a Corrente Nominal");
    }
    
    public static void linhaNaoSelecionada(JFrame janela) {
        mostraMensagem(janela, "Linha não selecionada");
    }
    
    public static void mostraMensagemSQL(JFrame janela) {
        mostraMensagem(janela, "Erro de SQL no banco de dados.");
    }
    
    public static void correnteExistente (JFrame janela) {
        mostraMensagem(janela, "Corrente Nominal existente");
    }

    public static void mostraMensagemClasse(JFrame janela, Exception ex) {
        mostraMensagem(janela, "Erro de Classe no banco de dados.");
    }
    
    public static void entradaSomenteNumeros (JFrame janela) {
        mostraMensagem(janela, "Entrada somente com Números");
    }
    
    public static void entradaInvalida (JFrame janela) {
        mostraMensagem(janela, "Entrada inválida");
    }
}
