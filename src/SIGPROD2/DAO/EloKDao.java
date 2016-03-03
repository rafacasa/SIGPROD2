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
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e remover Elos Tipo K
 * @author Rafael Casa
 */
public class EloKDao {
    public static final String INSERT = "INSERT INTO Elo(ID, correnteNominal, tipo, preferencial) VALUES (null, ?, ?, ?);";
    public static final String DELETE = "DELETE FROM Elo WHERE ID = ?;";
    public static final String BUSCARTODOS = "SELECT * FROM Elo WHERE tipo = ?;";
    public static final String BUSCAID = "SELECT ID FROM Elo WHERE tipo = ? AND correnteNominal = ? AND preferencial = ?;";
    
    /**
     * Método para inserir um ELO Tipo K no Banco de Dados
     * @param eloParaInserir As informações do Elo a ser Inserido
     * @throws java.sql.SQLException Caso houver erro de acesso ao Banco de Dados, ou os Dados forem inválidos
     */
    public static void insereEloK(EloK eloParaInserir) throws SQLException
    {
        Connection conexao = Conexao.abreConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);
        comando.setNull(1, java.sql.Types.INTEGER);
        comando.setInt(2, eloParaInserir.getCorrenteNominal());
        comando.setString(3, "K");
        comando.setBoolean(4, eloParaInserir.isPreferencial());
        comando.executeUpdate();
        comando.close();
        eloParaInserir.getCurvaDeMinimaFusao().forEach(
                                                        ponto -> PontoCurvaDAO.inserePontoCurva(
                                                                                                conexao, 
                                                                                                ponto, 
                                                                                                PontoCurva.PONTODACURVAMINIMA, 
                                                                                                eloParaInserir));
        eloParaInserir.getCurvadeMaximaInterrupcao().forEach(
                                                             ponto -> PontoCurvaDAO.inserePontoCurva(
                                                                                                      conexao, 
                                                                                                      ponto, 
                                                                                                      PontoCurva.PONTODACURVAMAXIMA, 
                                                                                                      eloParaInserir));
        Conexao.fechaConexao();
    }
    
    /**
     * Método para deletar um ELO Tipo K no Banco de Dados
     * @param eloParaDeletar As informações do Elo a ser deletado
     * @throws java.sql.SQLException Caso houver erro de acesso ao Banco de Dados, ou os Dados forem inválidos
     */
    public static void deletaEloK(EloK eloParaDeletar) throws SQLException
    {
        Connection conexao = Conexao.abreConexao();
        eloParaDeletar.getCurvaDeMinimaFusao().forEach(ponto -> PontoCurvaDAO.deletaPontoCurva(conexao, ponto));
        eloParaDeletar.getCurvadeMaximaInterrupcao().forEach(ponto -> PontoCurvaDAO.deletaPontoCurva(conexao, ponto));
        try (PreparedStatement comando = conexao.prepareStatement(DELETE)) {
            comando.setInt(1, eloParaDeletar.getId());
            comando.executeUpdate();
        }
        Conexao.fechaConexao();
    }
    
    /**
     * 
     * @return
     * @throws SQLException 
     */
    public static ArrayList<EloK> buscarTodos() throws SQLException
    {
        ArrayList<EloK> lista = new ArrayList();        
        Connection conexao = Conexao.abreConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCARTODOS);
        comando.setString(1, "K");
        ResultSet resultado = comando.executeQuery();
        EloK elo;
        while(resultado.next())
        {
            elo = new EloK();
            elo.setId(resultado.getInt("ID"));
            elo.setCorrenteNominal(resultado.getInt("correnteNominal"));
            elo.setPreferencial(resultado.getBoolean("preferencial"));
        }
        
        
        
        return null;
    }
    
}
