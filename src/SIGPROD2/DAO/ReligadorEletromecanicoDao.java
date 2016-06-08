package SIGPROD2.DAO;

import static SIGPROD2.Auxiliar.StringUtils.montarComandoSQL;
import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Religador.PickupDefinidaEletromecanicoBD;
import SIGPROD2.BD.Tables.Religador.PontoDeCurvaBD;
import SIGPROD2.BD.Tables.Religador.TempoAtuacaoDefinidaEletromecanicoBD;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Religador;
import SIGPROD2.Modelo.ReligadorEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael Casa
 * @version 02/06/2016
 */
public class ReligadorEletromecanicoDao {

    private static final String INSERT_CORRENTE = "INSERT INTO "
            + PickupDefinidaEletromecanicoBD.TABELA + " ("
            + PickupDefinidaEletromecanicoBD.CODIGO_RELIGADOR + ", "
            + PickupDefinidaEletromecanicoBD.CORRENTE_PICKUP + ", "
            + PickupDefinidaEletromecanicoBD.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String INSERT_TEMPO_ATUACAO = "INSERT INTO "
            + TempoAtuacaoDefinidaEletromecanicoBD.TABELA + " ("
            + TempoAtuacaoDefinidaEletromecanicoBD.CODIGO_RELIGADOR + ", "
            + TempoAtuacaoDefinidaEletromecanicoBD.TEMPO_ATUACAO + ", "
            + TempoAtuacaoDefinidaEletromecanicoBD.IS_FASE + ", "
            + TempoAtuacaoDefinidaEletromecanicoBD.IS_RAPIDA + ") VALUES (?, ?, ?, ?)";
    private static final String INSERT_PONTOS_CURVA = "INSERT INTO "
            + PontoDeCurvaBD.TABELA + " ("
            + PontoDeCurvaBD.CORRENTE + ", "
            + PontoDeCurvaBD.TEMPO + ", "
            + PontoDeCurvaBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaBD.IS_FASE + ", "
            + PontoDeCurvaBD.DIAL + ", "
            + PontoDeCurvaBD.CODIGO_RELIGADOR + ", "
            + PontoDeCurvaBD.IS_RAPIDA + ") VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT_CORRENTE = ", (?, ?, ?)";
    private static final String VARIAVEIS_INSERT_TEMPO = ", (?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT_PONTO_CURVA = ", (?, ?, ?, ?, ?, ?, ?)";

    public static void inserirDadosReligadorEletromecanico(ReligadorEletromecanico religadorParaInserir) throws SQLException {
        insereCorrentePickupDefinida(religadorParaInserir);
        insereTempoAtuacaoDefinido(religadorParaInserir);
        inserePontosCurva(religadorParaInserir);
    }

    private static void inserirCorrentePickupDefinida(ReligadorEletromecanico religadorParaInserir, int tipo) throws SQLException {
        List<Double> listaParaInserir = religadorParaInserir.getCorrentePickup(tipo);
        int qtd = listaParaInserir.size();
        String comandoSql = montarComandoSQL(qtd, INSERT_CORRENTE, VARIAVEIS_INSERT_CORRENTE);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(qtd + 1, religadorParaInserir.getCodigo());
            comando.setDouble(qtd + 2, listaParaInserir.get(i / 3));
            comando.setBoolean(qtd + 3, tipo == Religador.DEFINIDO_FASE);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static void inserirTempoAtuacaoDefinido(ReligadorEletromecanico religadorParaInserir, int tipo, boolean isRapida) throws SQLException {
        List<Double> listaParaInserir = religadorParaInserir.getTempoAtuacao(tipo, isRapida);
        int qtd = listaParaInserir.size();
        String comandoSql = montarComandoSQL(qtd, INSERT_TEMPO_ATUACAO, VARIAVEIS_INSERT_TEMPO);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 4; i += 4) {
            comando.setInt(qtd + 1, religadorParaInserir.getCodigo());
            comando.setDouble(qtd + 2, listaParaInserir.get(i / 4));
            comando.setBoolean(qtd + 3, tipo == Religador.DEFINIDO_FASE);
            comando.setBoolean(qtd + 4, isRapida);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static int inserirPontosCurva(ReligadorEletromecanico religadorParainserir, PreparedStatement comando, int tipo, boolean isRapida, int inicio) throws SQLException {
        List<Double> listaCorrentes = religadorParainserir.getCorrentePickup(tipo);
        List<Double> listaDial;
        List<PontoCurva> listaPontosCurva;
        int contador = inicio;

        for (double corrente : listaCorrentes) {
            listaDial = religadorParainserir.getDialDeTempo(tipo, isRapida, corrente);

            for (double dial : listaDial) {
                listaPontosCurva = religadorParainserir.getPontosDialDeTempo(corrente, dial, tipo, isRapida);

                for (PontoCurva ponto : listaPontosCurva) {
                    comando.setDouble(contador + 1, ponto.getCorrente());
                    comando.setDouble(contador + 2, ponto.getTempo());
                    comando.setDouble(contador + 3, corrente);
                    comando.setBoolean(contador + 4, tipo == Religador.INVERSA_FASE);
                    comando.setDouble(contador + 5, dial);
                    comando.setInt(contador + 6, religadorParainserir.getCodigo());
                    comando.setBoolean(contador + 7, isRapida);

                    contador += 7;
                }
            }
        }
        return contador;
    }

    private static void inserePontosCurva(ReligadorEletromecanico religadorParaInserir) throws SQLException {
        int parou = 0;
        int qtd = religadorParaInserir.getQtdPontosCurva();
        String comandoString = montarComandoSQL(qtd, INSERT_PONTOS_CURVA, VARIAVEIS_INSERT_PONTO_CURVA);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        if (religadorParaInserir.existeCurva(Religador.INVERSA_FASE)) {
            parou = inserirPontosCurva(religadorParaInserir, comando, Religador.INVERSA_FASE, true, parou);
            parou = inserirPontosCurva(religadorParaInserir, comando, Religador.INVERSA_FASE, false, parou);
        }
        if (religadorParaInserir.existeCurva(Religador.INVERSA_NEUTRO)) {
            parou = inserirPontosCurva(religadorParaInserir, comando, Religador.INVERSA_NEUTRO, true, parou);
            inserirPontosCurva(religadorParaInserir, comando, Religador.INVERSA_NEUTRO, false, parou);
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static void insereTempoAtuacaoDefinido(ReligadorEletromecanico religadorParaInserir) throws SQLException {
        if (religadorParaInserir.existeCurva(Religador.DEFINIDO_FASE)) {
            inserirTempoAtuacaoDefinido(religadorParaInserir, Religador.DEFINIDO_FASE, true);
            inserirTempoAtuacaoDefinido(religadorParaInserir, Religador.DEFINIDO_FASE, false);
        }
        if (religadorParaInserir.existeCurva(Religador.DEFINIDO_NEUTRO)) {
            inserirTempoAtuacaoDefinido(religadorParaInserir, Religador.DEFINIDO_NEUTRO, true);
            inserirTempoAtuacaoDefinido(religadorParaInserir, Religador.DEFINIDO_NEUTRO, false);
        }
    }

    private static void insereCorrentePickupDefinida(ReligadorEletromecanico religadorParaInserir) throws SQLException {
        if (religadorParaInserir.existeCurva(Religador.DEFINIDO_FASE)) {
            inserirCorrentePickupDefinida(religadorParaInserir, Religador.DEFINIDO_FASE);
        }
        if (religadorParaInserir.existeCurva(Religador.DEFINIDO_NEUTRO)) {
            inserirCorrentePickupDefinida(religadorParaInserir, Religador.DEFINIDO_NEUTRO);
        }
    }
}
