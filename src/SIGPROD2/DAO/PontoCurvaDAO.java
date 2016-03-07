package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.Modelo.EloK;
import SIGPROD2.Modelo.PontoCurva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover pontos de curva
 *
 * @author Rafael Casa
 */
public class PontoCurvaDAO {

    private static final String INSERT = "INSERT INTO PontoCurva (corrente, tempo, ehCurvaDeMaxima, correnteElo) VALUES (?, ?, ?, ?);";
    private static final String DELETE = "DELETE FROM PontoCurva WHERE correnteElo = ?;";
    private static final String BUSCAR = "SELECT Id, corrente, tempo FROM PontoCurva WHERE correnteElo = ? AND ehCurvaDeMaxima = ?;";

    /**
     * Método responsável por inserir um Ponto de Curva no Banco de Dados
     *
     * @param ponto O Ponto a ser inserido
     * @param ehCurvaMaxima Informa em qual curva está este ponto. Utilize as
     * constantes SIGPRO2.Modelo.PontoCurva.PONTODACURVAMAXIMA e
     * SIGPRO2.Modelo.PontoCurva.PONTODACURVAMINIMA.
     * @param elo O Elo a que pertence este Ponto de Curva
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos
     */
    public static void inserePontoCurva(PontoCurva ponto, boolean ehCurvaMaxima, EloK elo) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);
        comando.setDouble(1, ponto.getCorrente());
        comando.setDouble(2, ponto.getTempo());
        comando.setBoolean(3, ehCurvaMaxima);
        comando.setInt(4, elo.getCorrenteNominal());
        comando.executeUpdate();
    }

    /**
     * Método responsável por deletar todos os pontos de curva do Elo informado.
     *
     * @param eloParaDeletar O Elo que será deletado
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos
     */
    public static void deletaPontosCurvaDoElo(EloK eloParaDeletar) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(DELETE);
        comando.setInt(1, eloParaDeletar.getCorrenteNominal());
        comando.executeUpdate();
    }

    /**
     * Método responsável por recuperar todos os Pontos de Curva salvos no Banco
     * de Dados do Elo informado
     *
     * @param correnteNominal A Corrente Nominal do Elo
     * @param curva Informa de qual curva deverá ser buscado os Pontos. Utilize
     * as constantes SIGPRO2.Modelo.PontoCurva.PONTODACURVAMAXIMA e
     * SIGPRO2.Modelo.PontoCurva.PONTODACURVAMINIMA.
     * @return Um ArrayList com os Pontos de Curva localizados no Banco de Dados
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos
     */
    public static ArrayList<PontoCurva> buscaPontosCurva(int correnteNominal, boolean curva) throws SQLException {
        ArrayList<PontoCurva> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR);
        comando.setInt(1, correnteNominal);
        comando.setBoolean(2, curva);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            PontoCurva pontoCurva = new PontoCurva();
            pontoCurva.setId(resultado.getInt("Id"));
            pontoCurva.setCorrente(resultado.getDouble("corrente"));
            pontoCurva.setTempo(resultado.getDouble("tempo"));
            lista.add(pontoCurva);
        }
        return lista;
    }
}
