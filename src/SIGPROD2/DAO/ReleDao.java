package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.ReleBD;
import SIGPROD2.Modelo.Rele;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover Relés.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class ReleDao {

    private static final String INSERT = "INSERT INTO "
            + ReleBD.TABELA + " ("
            + ReleBD.FABRICANTE + ", "
            + ReleBD.MODELO + ", "
            + ReleBD.IS_DIGITAL + ", "
            + ReleBD.FATOR_INICIO_INVERSO_FASE + ", "
            + ReleBD.FATOR_INICIO_INVERSO_NEUTRO + ", "
            + ReleBD.FATOR_INICIO_DEFINIDO_FASE + ", "
            + ReleBD.FATOR_INICIO_DEFINIDO_NEUTRO + ") VALUES (?, ?, ?, ?, ?, ?, ?);";

    public static void insereRele(Rele releParaInserir) throws SQLException {
        inserirRele(releParaInserir);

    }

    private static void inserirRele(Rele releParaInserir) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);

        comando.setString(1, releParaInserir.getFabricante());
        comando.setString(2, releParaInserir.getModelo());
        comando.setBoolean(3, releParaInserir.isDigital());
        comando.setDouble(4, releParaInserir.getFatorInicio(Rele.INVERSA_FASE));
        comando.setDouble(5, releParaInserir.getFatorInicio(Rele.INVERSA_NEUTRO));
        comando.setDouble(6, releParaInserir.getFatorInicio(Rele.DEFINIDO_FASE));
        comando.setDouble(7, releParaInserir.getFatorInicio(Rele.DEFINIDO_NEUTRO));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
}
