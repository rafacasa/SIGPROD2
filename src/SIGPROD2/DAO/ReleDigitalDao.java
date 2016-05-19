package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrenteTempoDigitalBD;
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
    
    private static final String INSERT = "INSERT INTO "
            + CorrenteTempoDigitalBD.TABELA + " ("
            + CorrenteTempoDigitalBD.CODIGO_RELE + ", "
            + CorrenteTempoDigitalBD.TIPO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_MAXIMO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_MINIMO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_PASSO + ", "
            + CorrenteTempoDigitalBD.TEMPO_MAXIMO + ", "
            + CorrenteTempoDigitalBD.TEMPO_MINIMO + ", "
            + CorrenteTempoDigitalBD.TEMPO_PASSO + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT = "SELECT * FROM "
            + CorrenteTempoDigitalBD.TABELA + " WHERE "
            + CorrenteTempoDigitalBD.CODIGO_RELE + " = ?";
    
    public static void insereDadosReleDigital(ReleDigital releParaInserir) throws SQLException {
        insereDadosReleDigital(releParaInserir, Rele.DEFINIDO_FASE);
        insereDadosReleDigital(releParaInserir, Rele.DEFINIDO_NEUTRO);
        insereDadosReleDigital(releParaInserir, Rele.INVERSA_FASE);
        insereDadosReleDigital(releParaInserir, Rele.INVERSA_NEUTRO);
        insereCaracteristicasCurva(releParaInserir);
    }
    
    public static void insereDadosReleDigital(ReleDigital releParaInserir, int tipo) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);
        
        comando.setInt(1, releParaInserir.getCodigo());
        comando.setInt(2, tipo);
        comando.setDouble(3, releParaInserir.getCorrenteMax(tipo));
        comando.setDouble(4, releParaInserir.getCorrenteMin(tipo));
        comando.setDouble(5, releParaInserir.getCorrentePasso(tipo));
        comando.setDouble(6, releParaInserir.getTempoMax(tipo));
        comando.setDouble(7, releParaInserir.getTempoMin(tipo));
        comando.setDouble(8, releParaInserir.getTempoPasso(tipo));
        comando.executeUpdate();
    }
    
    public static ReleDigital buscarRele(Rele rele) throws SQLException {
        ReleDigital releDigital = (ReleDigital) rele;
        buscarDadosReleDigital(releDigital);
        CaracteristicasCurvaDao.buscarCaracteristicasCurva(releDigital);
        return releDigital;
    }
    
    private static void buscarDadosReleDigital(ReleDigital rele) throws SQLException {
        int tipo;
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();
        
        while (resultado.next()) {
            tipo = resultado.getInt(CorrenteTempoDigitalBD.TIPO);
            rele.setCorrenteMax(tipo, resultado.getDouble(CorrenteTempoDigitalBD.CORRENTE_MAXIMO));
            rele.setCorrenteMin(tipo, resultado.getDouble(CorrenteTempoDigitalBD.CORRENTE_MINIMO));
            rele.setCorrentePasso(tipo, resultado.getDouble(CorrenteTempoDigitalBD.CORRENTE_PASSO));
            rele.setTempoMax(tipo, resultado.getDouble(CorrenteTempoDigitalBD.TEMPO_MAXIMO));
            rele.setTempoMin(tipo, resultado.getDouble(CorrenteTempoDigitalBD.TEMPO_MINIMO));
            rele.setTempoPasso(tipo, resultado.getDouble(CorrenteTempoDigitalBD.TEMPO_PASSO));
        }
    }
}