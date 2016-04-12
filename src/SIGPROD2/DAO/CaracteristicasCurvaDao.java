package SIGPROD2.DAO;

import SIGPROD2.BD.Tables.CaracteristicasCurvaBD;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover as Características de Curva de um Relé Digital.
 *
 * @author Rafael Casa
 * @version 07/04/2016
 */
public class CaracteristicasCurvaDao {

    private static String INSERT = "INSERT INTO "
            + CaracteristicasCurvaBD.TABELA + "( "
            + CaracteristicasCurvaBD.CODIGO_RELE + ", "
            + CaracteristicasCurvaBD.NOME + ", "
            + CaracteristicasCurvaBD.A + ", "
            + CaracteristicasCurvaBD.B + ", "
            + CaracteristicasCurvaBD.P + ") VALUES (?, ?, ?, ?, ?)";
    private static String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?)";

    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }
}
