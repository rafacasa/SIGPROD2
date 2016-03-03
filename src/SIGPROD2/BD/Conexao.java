/**
 * Esta Classe faz a conexão com o banco de dados. 
 */
package SIGPROD2.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Adrian Borba
 */
public class Conexao {

    private static Connection conexao;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String NOME_BD = "SIGPRODBD";
    private static final String IP = "127.0.0.1";
    private static final String PORTA = "3306";
    private static final String JDBC = "jdbc:mysql://" + IP + ":" + PORTA + "/" + NOME_BD;
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static boolean fechaConexao() {
        try {
            if (conexao != null) {
                conexao.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao fechar a conexão com o banco de dados");
        }
        return false;
    }

    public static Connection abreConexao() throws SQLException {
        conexao = DriverManager.getConnection(JDBC, USUARIO, SENHA);
        return conexao;
    }

    public static void main(String[] args) {
        try {
            if (abreConexao() != null && fechaConexao()) {
                System.out.println("Conexão terminada com sucesso.");
            }
        } catch (SQLException ex) {
            System.out.println("Erro de sql");
        }
    }
}
