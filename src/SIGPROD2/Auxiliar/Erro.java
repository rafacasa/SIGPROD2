package SIGPROD2.Auxiliar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Esta classe tem métodos estáticos para apresentar mensagens de erro ao
 * usuário.
 *
 * @author Rafael Coelho
 * @version 15/06/2016
 */
public class Erro {
    
    private static final Logger LOGGER = LogManager.getLogger(SIGPROD2.Auxiliar.Erro.class);
    
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
    
    public static void mostraMensagemSQL(JFrame janela, Exception ex) {
        LOGGER.error("SQL EXCEPTION - :" + ex);
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
    
    public static void valoresVazios(JFrame janela) {
        mostraMensagem(janela, "Valores vazios");
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
    
    public static void expressaoInvalida(JFrame janela) {
        mostraMensagem(janela, "Expressão Inválida");
    }
}
