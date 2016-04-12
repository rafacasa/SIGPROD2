package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrentePickupDefinidoBD;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover as Correntes de Pickup da Curva Definida de um Relé.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class CorrentePickupDefinidoDao {

    private static final String INSERT = "INSERT INTO "
            + CorrentePickupDefinidoBD.TABELA + " ("
            + CorrentePickupDefinidoBD.CODIGO_RELE + ", "
            + CorrentePickupDefinidoBD.CORRENTE_PICKUP + ", "
            + CorrentePickupDefinidoBD.TEMPO_ATUACAO + ", "
            + CorrentePickupDefinidoBD.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?)";

    public static void insereCorrentePickupDefinida(ReleEletromecanico releParaInserir) throws SQLException {
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_FASE), null, true);
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_NEUTRO), null, false);
    }
    
    public static void insereCorrentePickupDefinida(ReleDigital releParaInserir) throws SQLException {
        
    }
    
    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

    //PREVINIR QTDS DIFERENTES DE CORRENTES E TEMPOS ATUACAO.
    private static void inserirCorrentePickup(int codigoRele, List<Double> correntes, List<Double> tempoAtuacao, boolean fase) throws SQLException {
        int qtd = correntes.size();
        String comandoString = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(i + 1, codigoRele);
            comando.setDouble(i + 2, correntes.get(i / 3));
            comando.setDouble(i + 3, tempoAtuacao.get(i / 3));
            comando.setBoolean(i + 4, fase);
        }
        comando.executeUpdate();
    }
}
