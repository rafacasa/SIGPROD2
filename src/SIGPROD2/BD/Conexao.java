/**
 * Esta Classe faz a conexão com o banco de dados.
 */
package SIGPROD2.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase gerencia a criação, o armazenamento e o fechamento de conexões com
 * o banco de dados.
 *
 * @author Adrian Borba
 */
public class Conexao {

    private static Connection conexao;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String NOME_BD = "sigProdBd";
    private static final String IP = "127.0.0.1";
    private static final String PORTA = "3306";
    private static final String JDBC = "jdbc:mysql://" + IP + ":" + PORTA + "/" + NOME_BD;
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    /**
     * Método que fecha a conexao armazenada, caso haja uma. Caso não tenha
     * nenhuma conexão armazenada, nada será executado
     *
     * @return true caso o processo tenha sucesso
     */
    public static boolean fechaConexao() {
        try {
            if (conexao != null) {
                conexao.close();
                conexao = null;
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao fechar a conexão com o banco de dados");
        }
        return false;
    }

    /**
     * Método que cria uma conexão nova
     *
     * @return A conexão criada
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados
     */
    private static Connection abreConexao() throws SQLException {
        try {
            conexao = DriverManager.getConnection(JDBC, USUARIO, SENHA);
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao conectar à base de dados:");
        }
        return null;
    }

    /**
     * Método que retorna uma conexão com o banco de dados para ser usada. Esta
     * conexão deve ser fechada pelo método Conexao.fechaconexao()
     *
     * @return A conexão com o banco de dados
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados
     */
    public static Connection getConexao() throws SQLException {
        if (conexao == null) {
            conexao = abreConexao();
        }
        return conexao;
    }
}
