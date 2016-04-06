package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrentePickupDefinidoBD;
import SIGPROD2.Modelo.Rele;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class CorrentePickupDefinidoDao {
    
    private static final String INSERT = "INSERT INTO "
            + CorrentePickupDefinidoBD.TABELA + " ("
            + CorrentePickupDefinidoBD.CODIGO_RELE + ", "
            + CorrentePickupDefinidoBD.CORRENTE_PICKUP + ", "
            + CorrentePickupDefinidoBD.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?)";
    
    public static void insereCorrentePickupDefinida(Rele releParaInserir) throws SQLException {
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_FASE), true);
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_NEUTRO), false);
    }
    
    private static String montarComando(int qtd) {
        String comando = INSERT;
        
        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }
    
    private static void inserirCorrentePickup(int codigoRele, List<Double> correntes, boolean fase) throws SQLException {
        int qtd = correntes.size();
        String comandoString = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);
        
        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(i + 1, codigoRele);
            comando.setDouble(i + 2, correntes.get(i / 3));
            comando.setBoolean(i + 3, fase);
        }
    }   
}
