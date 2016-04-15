package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.PickupDefinidaEletromecanico;
import SIGPROD2.BD.Tables.TempoAtuacaoDefinidaEletromecanico;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover os dados de um Rele Eletromecanico.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class ReleEletromecanicoDao {

    private static final String INSERT_CORRENTE = "INSERT INTO "
            + PickupDefinidaEletromecanico.TABELA + " ("
            + PickupDefinidaEletromecanico.CODIGO_RELE + ", "
            + PickupDefinidaEletromecanico.CORRENTE_PICKUP + ", "
            + PickupDefinidaEletromecanico.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String INSERT_TEMPO_ATUACAO = "INSERT INTO "
            + TempoAtuacaoDefinidaEletromecanico.TABELA + " ("
            + TempoAtuacaoDefinidaEletromecanico.CODIGO_RELE + ", "
            + TempoAtuacaoDefinidaEletromecanico.TEMPO_ATUACAO + ", "
            + TempoAtuacaoDefinidaEletromecanico.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?)";

    public static void insereDadosReleEletromecanico(ReleEletromecanico releParaInserir) throws SQLException {
        inserirCorrentePickup(releParaInserir, Rele.DEFINIDO_FASE);
        inserirCorrentePickup(releParaInserir, Rele.DEFINIDO_NEUTRO);
        inserirTempoAtuacao(releParaInserir, Rele.DEFINIDO_FASE);
        inserirTempoAtuacao(releParaInserir, Rele.DEFINIDO_NEUTRO);
        PontoCurvaReleDao.inserirPontosCurva(releParaInserir);
    }

    private static String montarComando(int qtd, String original) {
        String comando = original;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

    private static void inserirCorrentePickup(ReleEletromecanico releParaInserir, int tipo) throws SQLException {
        List<Double> correntes = releParaInserir.getCorrentePickup(tipo);
        int qtd = correntes.size();
        String comandoString = montarComando(qtd, INSERT_CORRENTE);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(i + 1, releParaInserir.getCodigo());
            comando.setDouble(i + 2, correntes.get(i / 3));
            comando.setBoolean(i + 3, tipo == Rele.DEFINIDO_FASE);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static void inserirTempoAtuacao(ReleEletromecanico releParaInserir, int tipo) throws SQLException {
        List<Double> tempos = releParaInserir.getTempoDeAtuacao(tipo);
        int qtd = tempos.size();
        String comandoString = montarComando(qtd, INSERT_TEMPO_ATUACAO);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(i + 1, releParaInserir.getCodigo());
            comando.setDouble(i + 2, tempos.get(i / 3));
            comando.setBoolean(i + 3, tipo == Rele.DEFINIDO_FASE);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
}
