package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Rele.PontoDeCurvaBD;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover pontos de curva de um Relé.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class PontoCurvaReleDao {

    private static final String INSERT = "INSERT INTO "
            + PontoDeCurvaBD.TABELA + " ("
            + PontoDeCurvaBD.CORRENTE + ", "
            + PontoDeCurvaBD.TEMPO + ", "
            + PontoDeCurvaBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaBD.IS_FASE + ", "
            + PontoDeCurvaBD.DIAL + ", "
            + PontoDeCurvaBD.CODIGO_RELE + ") VALUES (?, ?, ?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?, ?)";
    private static final String BUSCAR_PICKUP = "SELECT DISTINCT "
            + PontoDeCurvaBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaBD.IS_FASE + " FROM "
            + PontoDeCurvaBD.TABELA + " WHERE "
            + PontoDeCurvaBD.CODIGO_RELE + " = ?";
    private static final String BUSCAR_DIAL = "SELECT DISTINCT "
            + PontoDeCurvaBD.DIAL + ", "
            + PontoDeCurvaBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaBD.IS_FASE + " FROM "
            + PontoDeCurvaBD.TABELA + " WHERE "
            + PontoDeCurvaBD.CODIGO_RELE + " = ?";
    private static final String BUSCAR_PONTOS = "SELECT "
            + PontoDeCurvaBD.CORRENTE + " ,"
            + PontoDeCurvaBD.TEMPO + " FROM "
            + PontoDeCurvaBD.TABELA + " WHERE "
            + PontoDeCurvaBD.CODIGO_RELE + " = ? AND "
            + PontoDeCurvaBD.CORRENTE_PICKUP + " = ? AND "
            + PontoDeCurvaBD.DIAL + " = ? AND "
            + PontoDeCurvaBD.IS_FASE + " = ?";

    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

    public static void inserirPontosCurva(ReleEletromecanico releParaInserir) throws SQLException {
        int parou = 0;
        int qtd = releParaInserir.getQtdPontosCurva();
        String comandoString = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        parou = inserePontosCurva(releParaInserir, comando, Rele.INVERSA_FASE, parou);
        inserePontosCurva(releParaInserir, comando, Rele.INVERSA_NEUTRO, parou);
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static int inserePontosCurva(ReleEletromecanico releParaInserir, PreparedStatement comando, int tipo, int inicio) throws SQLException {
        List<Double> listaCorrentes = releParaInserir.getCorrentePickup(tipo);
        List<Double> listaDial;
        List<PontoCurva> listaPontosCurva;
        int contador = inicio;

        for (double corrente : listaCorrentes) {
            listaDial = releParaInserir.getDialDeTempo(tipo, corrente);

            for (double dial : listaDial) {
                listaPontosCurva = releParaInserir.getPontosDialDeTempo(corrente, dial, tipo);

                for (PontoCurva ponto : listaPontosCurva) {
                    comando.setDouble(contador + 1, ponto.getCorrente());
                    comando.setDouble(contador + 2, ponto.getTempo());
                    comando.setDouble(contador + 3, corrente);
                    comando.setBoolean(contador + 4, tipo == Rele.INVERSA_FASE);
                    comando.setDouble(contador + 5, dial);
                    comando.setInt(contador + 6, releParaInserir.getCodigo());

                    contador += 6;
                }
            }
        }
        return contador;
    }

    public static ReleEletromecanico buscarRele(ReleEletromecanico rele) throws SQLException {
        buscarCorrentesPickupInversa(rele);
        buscarDiais(rele);
        return rele;
    }

    public static void buscarCorrentesPickupInversa(ReleEletromecanico rele) throws SQLException {
        ArrayList<Double> correntesFase = new ArrayList<>();
        ArrayList<Double> correntesNeutro = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR_PICKUP);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            if (resultado.getBoolean(PontoDeCurvaBD.IS_FASE)) {
                correntesFase.add(resultado.getDouble(PontoDeCurvaBD.CORRENTE_PICKUP));
            } else {
                correntesNeutro.add(resultado.getDouble(PontoDeCurvaBD.CORRENTE_PICKUP));
            }
        }
        rele.addCorrentePickup(correntesFase, Rele.INVERSA_FASE);
        rele.addCorrentePickup(correntesNeutro, Rele.INVERSA_NEUTRO);
    }

    public static void buscarDiais(ReleEletromecanico rele) throws SQLException {
        double dial, corrente;
        boolean isFase;
        int tipo;
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR_DIAL);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            dial = resultado.getDouble(PontoDeCurvaBD.DIAL);
            corrente = resultado.getDouble(PontoDeCurvaBD.CORRENTE_PICKUP);
            isFase = resultado.getBoolean(PontoDeCurvaBD.IS_FASE);
            tipo = isFase ? Rele.INVERSA_FASE : Rele.INVERSA_NEUTRO;
            rele.addDialDeTempo(tipo, corrente, dial, buscarPontos(rele.getCodigo(), corrente, dial, isFase));
        }
    }

    private static ArrayList<PontoCurva> buscarPontos(int codigo, double corrente, double dial, boolean isFase) throws SQLException {
        ArrayList<PontoCurva> listaPontos = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR_PONTOS);
        comando.setInt(1, codigo);
        comando.setDouble(2, corrente);
        comando.setDouble(3, dial);
        comando.setBoolean(4, isFase);
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            listaPontos.add(new PontoCurva(
                    resultado.getDouble(PontoDeCurvaBD.CORRENTE),
                    resultado.getDouble(PontoDeCurvaBD.TEMPO)));
        }
        return listaPontos;
    }
}
