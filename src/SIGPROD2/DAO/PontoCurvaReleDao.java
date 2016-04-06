package SIGPROD2.DAO;

import SIGPROD2.BD.Tables.PontoDeCurvaReleBD;
import SIGPROD2.Modelo.Rele;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover pontos de curva de um Relé.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class PontoCurvaReleDao {

    private static final String INSERT = "INSERT INTO "
            + PontoDeCurvaReleBD.TABELA + " ("
            + PontoDeCurvaReleBD.CORRENTE + ", "
            + PontoDeCurvaReleBD.TEMPO + ", "
            + PontoDeCurvaReleBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaReleBD.IS_FASE + ", "
            + PontoDeCurvaReleBD.DIAL + ", "
            + PontoDeCurvaReleBD.CODIGO_RELE + ") VALUES (?, ?, ?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?, ?)";

    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }
    
    private static void inserePontosCurva(Rele releParaInserir)
    {
        
    }
}
