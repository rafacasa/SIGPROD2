package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Religador.CaracteristicasCurvaBD;
import SIGPROD2.BD.Tables.Religador.CorrenteTempoDigitalBD;
import SIGPROD2.Modelo.Religador;
import SIGPROD2.Modelo.ReligadorDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rafael Casa
 * @version 01/06/2016
 */
public class ReligadorDigitalDao {
    private static final String INSERT_CORRENTE_TEMPO = "INSERT INTO "
            + CorrenteTempoDigitalBD.TABELA + " ("
            + CorrenteTempoDigitalBD.CODIGO_RELIGADOR + ", "
            + CorrenteTempoDigitalBD.TIPO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_MAXIMO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_MINIMO + ", "
            + CorrenteTempoDigitalBD.CORRENTE_PASSO + ", "
            + CorrenteTempoDigitalBD.TEMPO_MAXIMO_LENTA + ", "
            + CorrenteTempoDigitalBD.TEMPO_MINIMO_LENTA + ", "
            + CorrenteTempoDigitalBD.TEMPO_PASSO_LENTA + ", "
            + CorrenteTempoDigitalBD.TEMPO_MAXIMO_RAPIDA + ", "
            + CorrenteTempoDigitalBD.TEMPO_MINIMO_RAPIDA + ", "
            + CorrenteTempoDigitalBD.TEMPO_PASSO_RAPIDA + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String INSERT_CARACTERISTICAS = "INSERT INTO "
            + CaracteristicasCurvaBD.TABELA + "( "
            + CaracteristicasCurvaBD.CODIGO_RELIGADOR + ", "
            + CaracteristicasCurvaBD.IS_FASE + ", "
            + CaracteristicasCurvaBD.IS_RAPIDA + ", "
            + CaracteristicasCurvaBD.NOME + ", "
            + CaracteristicasCurvaBD.A + ", "
            + CaracteristicasCurvaBD.B + ", "
            + CaracteristicasCurvaBD.P + ") VALUES (?, ?, ?, ?, ?, ?, ?)";
    
    public static void insereDadosReligadorDigital(ReligadorDigital religadorParaInserir) throws SQLException {
        insereDadosReligadorDigital(religadorParaInserir, Religador.DEFINIDO_FASE);
        insereDadosReligadorDigital(religadorParaInserir, Religador.DEFINIDO_NEUTRO);
        insereDadosReligadorDigital(religadorParaInserir, Religador.INVERSA_FASE);
        insereDadosReligadorDigital(religadorParaInserir, Religador.INVERSA_NEUTRO);
        insereCaracteristicasCurva(religadorParaInserir);
    }
    
    private static void insereDadosReligadorDigital(ReligadorDigital religadorParaInserir, int tipo) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT_CORRENTE_TEMPO);
        
        comando.setInt(1, religadorParaInserir.getCodigo());
        comando.setInt(2, tipo);
        comando.setDouble(3, religadorParaInserir.getCorrenteMax(tipo));
        comando.setDouble(4, religadorParaInserir.getCorrenteMin(tipo));
        comando.setDouble(5, religadorParaInserir.getCorrentePasso(tipo));
        comando.setDouble(6, religadorParaInserir.getTempoMax(tipo, false));
        comando.setDouble(7, religadorParaInserir.getTempoMin(tipo, false));
        comando.setDouble(8, religadorParaInserir.getTempoPasso(tipo, false));
        comando.setDouble(9, religadorParaInserir.getTempoMax(tipo, true));
        comando.setDouble(10, religadorParaInserir.getTempoMin(tipo, true));
        comando.setDouble(11, religadorParaInserir.getTempoPasso(tipo, true));
        comando.executeUpdate();
    }
    
    private static void insereCaracteristicasCurva(ReligadorDigital religadorParaInserir) {
        
    }
    
    public static void inserirCaracteristicasCurva(ReligadorDigital religadorParaInserir, boolean isFase, boolean isRapida) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT_CARACTERISTICAS);
        
    }
}
