package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrenteDigitalBD;
import SIGPROD2.BD.Tables.TempoDigitalBD;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * lasse responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover os dados de um Rele Digital.
 *
 * @author Rafael Casa
 * @version 12/04/2016
 */
public class ReleDigitalDao {

    private static final String INSERT_CORRENTE = "INSERT INTO "
            + CorrenteDigitalBD.TABELA + " ("
            + CorrenteDigitalBD.CODIGO_RELE + ", "
            + CorrenteDigitalBD.TIPO + ", "
            + CorrenteDigitalBD.CORRENTE_MAXIMO + ", "
            + CorrenteDigitalBD.CORRENTE_MINIMO + ", "
            + CorrenteDigitalBD.CORRENTE_PASSO + ") VALUES (?, ?, ?, ?, ?)";
    private static final String INSERT_TEMPO = "INSERT INTO "
            + TempoDigitalBD.TABELA + " ("
            + TempoDigitalBD.CODIGO_RELE + ", "
            + TempoDigitalBD.IS_FASE + ", "
            + TempoDigitalBD.TEMPO_MAXIMO + ", "
            + TempoDigitalBD.TEMPO_MINIMO + ", "
            + TempoDigitalBD.TEMPO_PASSO + ") VALUES (?, ?, ?, ?, ?)";

    public static void insereDadosReleDigital(ReleDigital releParaInserir) throws SQLException {
        insereTempo(releParaInserir);
        insereCorrente(releParaInserir);
        CaracteristicasCurvaDao.insereCaracteristicasCurva(releParaInserir);
    }

    private static void insereTempo(ReleDigital releParaInserir) throws SQLException {
        insereTempo(releParaInserir, true);
        insereTempo(releParaInserir, false);
    }

    private static void insereTempo(ReleDigital releParaInserir, boolean tipo) throws SQLException {
        int index;
        if (tipo) {
            index = Rele.INVERSA_FASE;
        } else {
            index = Rele.INVERSA_NEUTRO;
        }
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT_TEMPO);

        comando.setInt(1, releParaInserir.getCodigo());
        comando.setBoolean(2, tipo);
        comando.setDouble(3, releParaInserir.getTempoMax().get(index));
        comando.setDouble(4, releParaInserir.getTempoMin().get(index));
        comando.setDouble(5, releParaInserir.getTempoPasso().get(index));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static void insereCorrente(ReleDigital releParaInserir) throws SQLException {
        insereCorrente(releParaInserir, Rele.DEFINIDO_FASE);
        insereCorrente(releParaInserir, Rele.DEFINIDO_NEUTRO);
        insereCorrente(releParaInserir, Rele.INVERSA_FASE);
        insereCorrente(releParaInserir, Rele.INVERSA_NEUTRO);
    }

    private static void insereCorrente(ReleDigital releParaInserir, int tipo) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT_CORRENTE);

        comando.setInt(1, releParaInserir.getCodigo());
        comando.setInt(2, tipo);
        comando.setDouble(3, releParaInserir.getCorrenteMax().get(tipo));
        comando.setDouble(4, releParaInserir.getCorrenteMin().get(tipo));
        comando.setDouble(5, releParaInserir.getCorrentePasso().get(tipo));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
}
