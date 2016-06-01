package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Rele.PickupDefinidaEletromecanico;
import SIGPROD2.BD.Tables.Rele.TempoAtuacaoDefinidaEletromecanico;
import static SIGPROD2.DAO.PontoCurvaReleDao.*;
import SIGPROD2.Modelo.Rele;
import static SIGPROD2.Modelo.Rele.*;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    private static final String SELECT_CORRENTE = "SELECT "
            + PickupDefinidaEletromecanico.CORRENTE_PICKUP + " FROM "
            + PickupDefinidaEletromecanico.TABELA + " WHERE "
            + PickupDefinidaEletromecanico.CODIGO_RELE + " = ? AND "
            + TempoAtuacaoDefinidaEletromecanico.IS_FASE + " = ?";
    private static final String SELECT_TEMPO_ATUACAO = "SELECT "
            + TempoAtuacaoDefinidaEletromecanico.TEMPO_ATUACAO + " FROM "
            + TempoAtuacaoDefinidaEletromecanico.TABELA + " WHERE "
            + TempoAtuacaoDefinidaEletromecanico.CODIGO_RELE + " = ? AND "
            + TempoAtuacaoDefinidaEletromecanico.IS_FASE + " = ?";

    public static void insereDadosReleEletromecanico(ReleEletromecanico releParaInserir) throws SQLException {
        if (releParaInserir.existeCurva(DEFINIDO_FASE)) {
            inserirCorrentePickup(releParaInserir, DEFINIDO_FASE);
            inserirTempoAtuacao(releParaInserir, DEFINIDO_FASE);
        }
        if (releParaInserir.existeCurva(DEFINIDO_NEUTRO)) {
            inserirCorrentePickup(releParaInserir, DEFINIDO_NEUTRO);
            inserirTempoAtuacao(releParaInserir, DEFINIDO_NEUTRO);
        }

        inserirPontosCurva(releParaInserir);
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
            comando.setBoolean(i + 3, tipo == DEFINIDO_FASE);
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
            comando.setBoolean(i + 3, tipo == DEFINIDO_FASE);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    public static ReleEletromecanico buscarReleEletromecanico(Rele rele) throws SQLException {
        ReleEletromecanico releE = (ReleEletromecanico) rele;
        releE = buscarCorrentes(releE);
        releE = buscarTempos(releE);
        releE = buscarRele(releE);
        return releE;
    }

    private static ReleEletromecanico buscarTempos(ReleEletromecanico rele) throws SQLException {
        if (rele.existeCurva(DEFINIDO_FASE)) {
            rele = buscarTempos(rele, true);
        }
        if (rele.existeCurva(DEFINIDO_NEUTRO)) {
            rele = buscarTempos(rele, false);
        }
        return rele;
    }

    private static ReleEletromecanico buscarTempos(ReleEletromecanico rele, boolean isFase) throws SQLException {
        ArrayList<Double> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_TEMPO_ATUACAO);
        comando.setInt(1, rele.getCodigo());
        comando.setBoolean(2, isFase);
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            lista.add(resultado.getDouble(TempoAtuacaoDefinidaEletromecanico.TEMPO_ATUACAO));
        }
        if (isFase) {
            rele.addTempoDeAtuacao(lista, DEFINIDO_FASE);
        } else {
            rele.addTempoDeAtuacao(lista, DEFINIDO_NEUTRO);
        }
        return rele;
    }

    private static ReleEletromecanico buscarCorrentes(ReleEletromecanico rele) throws SQLException {
        if (rele.existeCurva(DEFINIDO_FASE)) {
            rele = buscarCorrentes(rele, true);
        }
        if (rele.existeCurva(DEFINIDO_NEUTRO)) {
            rele = buscarCorrentes(rele, false);
        }
        return rele;
    }

    private static ReleEletromecanico buscarCorrentes(ReleEletromecanico rele, boolean isFase) throws SQLException {
        ArrayList<Double> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_CORRENTE);
        comando.setInt(1, rele.getCodigo());
        comando.setBoolean(2, isFase);
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            lista.add(resultado.getDouble(PickupDefinidaEletromecanico.CORRENTE_PICKUP));
        }
        if (isFase) {
            rele.addCorrentePickup(lista, DEFINIDO_FASE);
        } else {
            rele.addCorrentePickup(lista, DEFINIDO_NEUTRO);
        }
        return rele;
    }
}
