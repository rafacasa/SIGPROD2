package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Religador.CaracteristicasCurvaBD;
import SIGPROD2.BD.Tables.Religador.CorrenteTempoDigitalBD;
import SIGPROD2.Modelo.CaracteristicasCurva;
import SIGPROD2.Modelo.Religador;
import SIGPROD2.Modelo.ReligadorDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 02/06/2016
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
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?, ?, ?)";

    private static String montarComando(int qtd) {
        String comando = INSERT_CARACTERISTICAS;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

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

    private static void insereCaracteristicasCurva(ReligadorDigital religadorParaInserir) throws SQLException {
        inserirCaracteristicasCurva(religadorParaInserir, true, true);
        inserirCaracteristicasCurva(religadorParaInserir, true, false);
        inserirCaracteristicasCurva(religadorParaInserir, false, true);
        inserirCaracteristicasCurva(religadorParaInserir, false, false);
    }

    private static void inserirCaracteristicasCurva(ReligadorDigital religadorParaInserir, boolean isFase, boolean isRapida) throws SQLException {
        List<CaracteristicasCurva> listaParaInserir;
        if (isFase) {
            if (isRapida) {
                listaParaInserir = religadorParaInserir.getListaRapidaFase();
            } else {
                listaParaInserir = religadorParaInserir.getListaLentaFase();
            }
        } else if (isRapida) {
            listaParaInserir = religadorParaInserir.getListaRapidaNeutro();
        } else {
            listaParaInserir = religadorParaInserir.getListaLentaNeutro();
        }
        int qtd = listaParaInserir.size();
        String comandoSql = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 7; i += 7) {
            comando.setInt(qtd + 1, religadorParaInserir.getCodigo());
            comando.setBoolean(qtd + 2, isFase);
            comando.setBoolean(qtd + 3, isRapida);
            comando.setString(qtd + 4, listaParaInserir.get(i / 7).getNome());
            comando.setDouble(i + 5, listaParaInserir.get(i / 7).getA());
            comando.setDouble(i + 6, listaParaInserir.get(i / 7).getB());
            comando.setDouble(i + 7, listaParaInserir.get(i / 7).getP());
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
}
