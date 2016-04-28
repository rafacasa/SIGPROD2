package SIGPROD2.Auxiliar;

import SIGPROD2.GUI.GUI_Reles;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Esta classe tem métodos estáticos para apresentar mensagens de erro ao
 * usuário.
 *
 * @author Rafael Coelho
 * @version 16/08/2015
 */
public class Erro {

    private static void mostraMensagem(JFrame janela, String texto) {
        JOptionPane.showMessageDialog(janela,
                texto,
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void arquivoInexistente(JFrame janela) {
        mostraMensagem(janela, "Arquivo Inexistente");
    }

    public static void aberturaDeArquivo(JFrame janela) {
        mostraMensagem(janela, "Não foi possível abrir o arquivo");
    }

    public static void naoPermitidaLeitura(JFrame janela) {
        mostraMensagem(janela, "Não é permitido ler este Arquivo");
    }

    public static void correnteVazia(JFrame janela) {
        mostraMensagem(janela, "Digite algum valor para a Corrente Nominal");
    }

    public static void linhaNaoSelecionada(JFrame janela) {
        mostraMensagem(janela, "Linha não selecionada");
    }

    public static void mostraMensagemSQL(JFrame janela) {
        mostraMensagem(janela, "Erro de SQL no banco de dados.");
    }

    public static void correnteExistente(JFrame janela) {
        mostraMensagem(janela, "Corrente Nominal existente");
    }

    public static void mostraMensagemClasse(JFrame janela, Exception ex) {
        mostraMensagem(janela, "Erro de Classe no banco de dados.");
    }

    public static void entradaSomenteNumeros(JFrame janela) {
        mostraMensagem(janela, "Entrada somente com Números");
    }

    public static void entradaInvalida(JFrame janela) {
        mostraMensagem(janela, "Entrada inválida");
    }

    public static void configureBancoDados(JFrame janela) {
        mostraMensagem(janela, "Você deve configurar as informações de acesso ao Banco de Dados");
    }

    public static void selecioneTipoRele(JFrame janela) {
        mostraMensagem(janela, "Você deve selecionar o tipo de Relé que deseja inserir");
    }

    public static void selecioneUnidadeRele(JFrame janela) {
        mostraMensagem(janela, "Você deve selecionar pelo menos uma unidade para o Relé");
    }

    public static void camposVazios(JFrame janela) {
        mostraMensagem(janela, "Campos vazios");
    }

    public static void valorCadastrado(JFrame janela) {
        mostraMensagem(janela, "Dial já cadastrado");
    }
}
