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
 * remover Elos Tipo K
 *
 * @author Rafael Casa
 */
public class EloKDao {

    public static final String INSERT = "INSERT INTO Elo(correnteNominal, preferencial) VALUES (?, ?);";
    public static final String DELETE = "DELETE FROM Elo WHERE correnteNominal = ?;";
    public static final String BUSCAR = "SELECT * FROM Elo";

    /**
     * Método para inserir um ELO Tipo K no Banco de Dados
     *
     * @param eloParaInserir As informações do Elo a ser Inserido
     * @throws java.sql.SQLException Caso houver erro de acesso ao Banco de
     * Dados, ou os Dados forem inválidos
     */
    public static void insereEloK(EloK eloParaInserir) throws SQLException {
        inserirEloK(eloParaInserir);

        PontoCurvaDAO.inserePontoCurva(eloParaInserir.getCurvaDeMinimaFusao(),
                PontoCurva.PONTODACURVAMINIMA,
                eloParaInserir.getCorrenteNominal());

        PontoCurvaDAO.inserePontoCurva(eloParaInserir.getCurvaDeMaximaInterrupcao(),
                PontoCurva.PONTODACURVAMAXIMA,
                eloParaInserir.getCorrenteNominal());
    }

    /**
     * Método responsável por inserir as informações de um Elo tipo K na
     * respectiva tabela do Banco de Dados
     *
     * @param eloParaInserir O elo a ser inserido
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos
     */
    private static void inserirEloK(EloK eloParaInserir) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);
        comando.setInt(1, eloParaInserir.getCorrenteNominal());
        comando.setBoolean(2, eloParaInserir.isPreferencial());
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    /**
     * Método para deletar um ELO Tipo K no Banco de Dados
     *
     * @param eloParaDeletar As informações do Elo a ser deletado
     * @throws java.sql.SQLException Caso houver erro de acesso ao Banco de
     * Dados, ou os Dados forem inválidos
     */
    public static void deletaEloK(EloK eloParaDeletar) throws SQLException {
        PontoCurvaDAO.deletaPontosCurvaDoElo(eloParaDeletar);
        Connection conexao = Conexao.getConexao();
        try (PreparedStatement comando = conexao.prepareStatement(DELETE)) {
            comando.setInt(1, eloParaDeletar.getCorrenteNominal());
            comando.executeUpdate();
        }
        Conexao.fechaConexao();
    }

    /**
     * Método que busca no banco de dados as informações básicas dos Elos
     * cadastrados(corrente nominal e preferencial)
     *
     * @return ArrayList com os elos encontrados
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados
     */
    public static ArrayList<EloK> buscarCorrentes() throws SQLException {
        ArrayList<EloK> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            EloK elo = new EloK();
            elo.setCorrenteNominal(resultado.getInt("correnteNominal"));
            elo.setPreferencial(resultado.getBoolean("preferencial"));
            lista.add(elo);
        }
        Conexao.fechaConexao();
        return lista;
    }

    /**
     * Método que carrega no elo todos os pontos de curva salvos no Banco de
     * Dados
     *
     * @param elo o elo (contendo corrente nominal e preferencial) a ser
     * carregado com os pontos de curva
     * @return O Elo já carregado com os pontos de curva
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados
     */
    public static EloK buscarEloK(EloK elo) throws SQLException {
        elo.setCurvaDeMinimaFusao(PontoCurvaDAO.buscaPontosCurva(elo.getCorrenteNominal(), PontoCurva.PONTODACURVAMINIMA));
        elo.setCurvaDeMaximaInterrupcao(PontoCurvaDAO.buscaPontosCurva(elo.getCorrenteNominal(), PontoCurva.PONTODACURVAMAXIMA));
        return elo;
    }
}
