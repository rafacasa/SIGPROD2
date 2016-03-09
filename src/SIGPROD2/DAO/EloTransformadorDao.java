package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.Modelo.Posicao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover Elos de Transformador
 *
 * @author Rafael Casa
 */
public class EloTransformadorDao {

    //public static final String INSERT = "INSERT INTO elotransformador (potencia, kv, tipo, corrente, monofasico) VALUES (?, ?, ?, ?, ?)";
    //public static final String VARIAVEISINSERT = ", (?, ?, ?, ?, ?)";
    //public static final String SELECT = "SELECT * FROM elotransformador";
    public static final String SELECTKV = "SELECT * FROM kv";
    public static final String SELECTPOT = "SELECT * FROM potencia";

    public void inserirEloTransformador() {

    }

    private ArrayList<String> buscarKv() throws SQLException {
        ArrayList<String> lista = new ArrayList();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECTKV);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            lista.add(resultado.getInt("id"), resultado.getString("kv"));
        }
        return lista;
    }

    private ArrayList<String> buscarPotencia() throws SQLException {
        ArrayList<String> lista = new ArrayList();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECTPOT);
        ResultSet resultado = comando.executeQuery();
        
        while (resultado.next()) {
            lista.add(resultado.getInt("id"), resultado.getString("potencia"));
        }
        return lista;
    }

    public Posicao[][] buscarElosTransformador(int quantidadeKv, int quantidadePot) throws SQLException {
        Posicao temp = new Posicao();
        Posicao[][] matriz = new Posicao[][];
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
                        
        }
    }
}
