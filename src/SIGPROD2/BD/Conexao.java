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
    private static final String NOME_BD = "sigProdBd";
    private static final String IP = "127.0.0.1";
    private static final String PORTA = "3306";
    private static final String JDBC = "jdbc:mysql://" + IP + ":" + PORTA + "/" + NOME_BD;
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

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

    public static Connection abreConexao() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(JDBC, USUARIO, SENHA);
            return conexao;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Não foi possível carregar o driver.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao conectar à base de dados:");
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            if (abreConexao() != null && fechaConexao()) {
                System.out.println("Conexão terminada com sucesso.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro de classe");
        } catch (SQLException ex) {
            System.out.println("Erro de sql");
        }
    }
}
