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

    private static final String INSERT = "INSERT INTO PontoCurva (corrente, tempo, ehCurvaDeMaxima, correnteElo) VALUES (?, ?, ?, ?)";
    private static final String VARIAVEISINSERT = ", (?, ?, ?, ?)";
    private static final String DELETE = "DELETE FROM PontoCurva WHERE correnteElo = ?;";
    private static final String BUSCAR = "SELECT Id, corrente, tempo FROM PontoCurva WHERE (correnteElo = ? AND ehCurvaDeMaxima = ?);";

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
        Conexao.fechaConexao();
    }

    /**
     * Método responsável por gerenciar a inclusão de uma grande quantidade de
     * Pontos de Curva no Banco de Dados
     *
     * @param lista ArrayList com os pontos de curva a serem adicionados
     * @param ehCurvaMaxima Informa em qual curva está este ponto. Utilize as
     * constantes SIGPRO2.Modelo.PontoCurva.PONTODACURVAMAXIMA e
     * SIGPRO2.Modelo.PontoCurva.PONTODACURVAMINIMA.
     * @param correnteElo A Corrente Nominal do Elo em que será adicionado os
     * Pontos
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos
     */
    public static void inserePontoCurva(ArrayList<PontoCurva> lista, boolean ehCurvaMaxima, int correnteElo) throws SQLException {
        int qtd = lista.size();
        String comandoSql = INSERT;
        for (int i = 1; i < qtd; i++) {
            comandoSql += VARIAVEISINSERT;
        }
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 4; i += 4) {
            comando.setDouble(i + 1, lista.get(i / 4).getCorrente());
            comando.setDouble(i + 2, lista.get(i / 4).getTempo());
            comando.setBoolean(i + 3, ehCurvaMaxima);
            comando.setInt(i + 4, correnteElo);
        }

        comando.executeUpdate();
        Conexao.fechaConexao();
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
        Conexao.fechaConexao();
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
        Conexao.fechaConexao();
        return lista;
    }
}
