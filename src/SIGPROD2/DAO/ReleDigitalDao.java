package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrenteDigitalBD;
import SIGPROD2.BD.Tables.TempoDigitalBD;
import static SIGPROD2.DAO.CaracteristicasCurvaDao.insereCaracteristicasCurva;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    private static final String SELECT_CORRENTE = "SELECT * FROM "
            + CorrenteDigitalBD.TABELA + " WHERE "
            + CorrenteDigitalBD.CODIGO_RELE + " = ?";
    private static final String SELECT_TEMPO = "SELECT * FROM "
            + TempoDigitalBD.TABELA + " WHERE "
            + TempoDigitalBD.CODIGO_RELE + " = ?";

    public static void insereDadosReleDigital(ReleDigital releParaInserir) throws SQLException {
        insereTempo(releParaInserir);
        insereCorrente(releParaInserir);
        insereCaracteristicasCurva(releParaInserir);
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
        comando.setDouble(3, releParaInserir.getTempoMax(index));
        comando.setDouble(4, releParaInserir.getTempoMin(index));
        comando.setDouble(5, releParaInserir.getTempoPasso(index));
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
        comando.setDouble(3, releParaInserir.getCorrenteMax(tipo));
        comando.setDouble(4, releParaInserir.getCorrenteMin(tipo));
        comando.setDouble(5, releParaInserir.getCorrentePasso(tipo));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    public static ReleDigital buscarRele(Rele rele) throws SQLException {
        ReleDigital releDigital = (ReleDigital) rele;
        buscarCorrentes(releDigital);
        buscarTempos(releDigital);
        
        return releDigital;
    }

    private static void buscarCorrentes(ReleDigital rele) throws SQLException {
        int tipo;
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_CORRENTE);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            tipo = resultado.getInt(CorrenteDigitalBD.TIPO);
            rele.setCorrenteMax(tipo, resultado.getDouble(CorrenteDigitalBD.CORRENTE_MAXIMO));
            rele.setCorrenteMin(tipo, resultado.getDouble(CorrenteDigitalBD.CORRENTE_MINIMO));
            rele.setCorrentePasso(tipo, resultado.getDouble(CorrenteDigitalBD.CORRENTE_PASSO));
        }
    }
    
    private static void buscarTempos(ReleDigital rele) throws SQLException {
        int tipo;
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_TEMPO);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            tipo = resultado.getBoolean(TempoDigitalBD.IS_FASE) ? Rele.INVERSA_FASE : Rele.INVERSA_NEUTRO;
            rele.setTempoMax(tipo, resultado.getDouble(TempoDigitalBD.TEMPO_MAXIMO));
            rele.setTempoMin(tipo, resultado.getDouble(TempoDigitalBD.TEMPO_MINIMO));
            rele.setTempoPasso(tipo, resultado.getDouble(TempoDigitalBD.TEMPO_PASSO));
        }
    }
}
