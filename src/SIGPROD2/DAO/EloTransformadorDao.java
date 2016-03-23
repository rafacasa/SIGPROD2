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

    private static final String SELECT_ELO_TRI = "SELECT * FROM elotransformadorTri";
    private static final String SELECT_KV_TRI = "SELECT * FROM kvTri";
    private static final String SELECT_POT_TRI = "SELECT * FROM potenciaTri";
    private static final String INSERT_KV_TRI = "INSERT INTO kvTri (id, kv) VALUES (?, ?)";
    private static final String INSERT_POT_TRI = "INSERT INTO potenciaTri (id, potencia) VALUES (?, ?)";
    private static final String INSERT_ELO_TRI = "INSERT INTO elotransformadorTri (corrente, tipo, kvId, potenciaId) VALUES (?, ?, ?, ?)";
    private static final String DELETE_ELO_TRI = "DELETE FROM elotransformadorTri WHERE 1;";
    private static final String DELETE_KV_TRI = "DELETE FROM kvTri WHERE 1;";
    private static final String DELETE_POT_TRI = "DELETE FROM potenciaTri WHERE 1;";

    private static final String SELECT_ELO_MONO = "SELECT * FROM elotransformadorMono";
    private static final String SELECT_KV_MONO = "SELECT * FROM kvMono";
    private static final String SELECT_POT_MONO = "SELECT * FROM potenciaMono";
    private static final String INSERT_KV_MONO = "INSERT INTO kvMono (id, kv) VALUES (?, ?)";
    private static final String INSERT_POT_MONO = "INSERT INTO potenciaMono (id, potencia) VALUES (?, ?)";
    private static final String INSERT_ELO_MONO = "INSERT INTO elotransformadorMono (corrente, tipo, kvId, potenciaId) VALUES (?, ?, ?, ?)";
    private static final String DELETE_ELO_MONO = "DELETE FROM elotransformadorMono WHERE 1;";
    private static final String DELETE_KV_MONO = "DELETE FROM kvMono WHERE 1;";
    private static final String DELETE_POT_MONO = "DELETE FROM potenciaMono WHERE 1;";

    private static final String VARIAVEIS_ELO = ", (?, ?, ?, ?)";
    private static final String VARIAVEIS_KV_POT = ", (?, ?)";

    public static final boolean MONOFASICO = false;
    public static final boolean TRIFASICO = true;

    /**
     * Método responsável por inserir os Kv's da Jtable no Banco de Dados
     *
     * @param vetor Um vetor de String's com os Kv's.
     * @param trifasico Informa quais Kv's desejam ser inseridos: monofásicos ou
     * trifásicos. Use as constantes EloTransfromadorDao.MONOFASICO e
     * EloTransformadorDao.TRIFASICO.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static void inserirKv(String[] vetor, boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? INSERT_KV_TRI : INSERT_KV_MONO;
        int qtd = vetor.length;
        comandoSql = montarComandoSql(comandoSql, VARIAVEIS_KV_POT, qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 2; i += 2) {
            comando.setInt(i + 1, i / 2);
            comando.setString(i + 2, vetor[i / 2]);
        }
        comando.executeUpdate();
    }

    /**
     * Método responsável por inserir as Potências da JTable no Banco de Dados
     *
     * @param vetor Um vetor de String's com as Potências.
     * @param trifasico Informa quais potências desejam ser inseridas:
     * monofásicas ou trifásicas. Use as constantes
     * EloTransfromadorDao.MONOFASICO e EloTransformadorDao.TRIFASICO.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static void inserirPot(String[] vetor, boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? INSERT_POT_TRI : INSERT_POT_MONO;
        int qtd = vetor.length;
        comandoSql = montarComandoSql(comandoSql, VARIAVEIS_KV_POT, qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        for (int i = 0; i < qtd * 2; i += 2) {
            comando.setInt(i + 1, i / 2);
            comando.setString(i + 2, vetor[i / 2]);
        }
        comando.executeUpdate();
    }

    /**
     * Método responsável por facilitar a insersão de uma grande quantidade de
     * linhas em uma table de banco de dados. Para a insersão em Banco de Dados
     * ficar mais rápida utilizamos apensas um comando sql para inserir várias
     * linhas. Este método monta um comando sql para essas inserções.
     *
     * @param comandoSql O comando básico, com apenas uma linha de inserção.
     * @param variaveis O comando para cada uma das linhas de inserção.
     * @param tamanho A quantidade de linhas para inserir.
     * @return O comando sql montado e pronto para ser usado.
     */
    private static String montarComandoSql(String comandoSql, String variaveis, int tamanho) {
        for (int i = 1; i < tamanho; i++) {
            comandoSql += variaveis;
        }
        return comandoSql;
    }

    /**
     * Método responsável por salvar no Banco de Dados os Elos de Transformador.
     *
     * @param matriz Matriz Bidimensional de Posicao com os dados dos Elos de
     * transformador na JTable
     * @param quantidadeKv Quantidade de Kv's (colunas) da matriz.
     * @param quantidadePot Quantidade de Potências (linhas) da matriz.
     * @param trifasico Informa quais elos desejam ser inseridos: monofásicos ou
     * trifásicos. Use as constantes EloTransfromadorDao.MONOFASICO e
     * EloTransformadorDao.TRIFASICO.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    /*public static void inserirEloTransformador(Posicao[][] matriz, int quantidadeKv, int quantidadePot, boolean trifasico) throws SQLException {
     String comandoSql = trifasico ? DELETEELOTRI : DELETEELOMONO;
     Connection conexao = Conexao.getConexao();
     PreparedStatement comando = conexao.prepareStatement(comandoSql);
        
     comando.executeUpdate();
        
     comandoSql = trifasico ? INSERTELOTRI : INSERTELOMONO;
     int qtd = matriz[0].length;
     comandoSql = montarComandoSql(comandoSql, VARIAVEISELO, qtd);

     for (int x = 1; x < quantidadeKv + 1; x++) {
     comando = conexao.prepareStatement(comandoSql);

     for (int y = 0; y < quantidadePot * 4; y += 4) {
     comando.setInt(y + 1, matriz[x][y / 4].getCorrente());
     comando.setString(y + 2, matriz[x][y / 4].getTipo());
     comando.setInt(y + 3, x);
     comando.setInt(y + 4, y / 4);
     }
     comando.executeUpdate();
     }
     Conexao.fechaConexao();
     }*/
    public static void inserirEloTransformador(String[][] matriz, int quantidadeKv, int quantidadePot, boolean trifasico) throws SQLException {
        Posicao temp;
        String comandoSql = trifasico ? INSERT_ELO_TRI : INSERT_ELO_MONO;
        int qtd = matriz.length;
        comandoSql = montarComandoSql(comandoSql, VARIAVEIS_ELO, qtd);
        Connection conexao = Conexao.getConexao();

        for (int x = 1; x < quantidadeKv; x++) {
            PreparedStatement comando = conexao.prepareStatement(comandoSql);

            for (int y = 0; y < quantidadePot * 4; y += 4) {
                System.out.println(matriz[y / 4][x]);
                temp = Posicao.getPosicao(matriz[y / 4][x]);
                comando.setInt(y + 1, temp.getCorrente());
                comando.setString(y + 2, temp.getTipo());
                comando.setInt(y + 3, x);
                comando.setInt(y + 4, y / 4);
            }
            comando.executeUpdate();
        }
        Conexao.fechaConexao();
    }

    /**
     * Método responsável por buscar no banco de dados os Kv's salvos para usar
     * no cabeçalho da JTable.
     *
     * @param trifasico Informa quais Kv's desejam ser buscados: monofásicos ou
     * trifásicos. Use as constantes EloTransfromadorDao.MONOFASICO e
     * EloTransformadorDao.TRIFASICO.
     * @return Um ArrayList de String's com todos os Kv's salvos no Banco de
     * Dados.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static ArrayList<String> buscarKv(boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? SELECT_KV_TRI : SELECT_KV_MONO;
        ArrayList<String> lista = new ArrayList();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            lista.add(resultado.getInt("id"), resultado.getString("kv"));
        }
        return lista;
    }

    /**
     * Método responsável por buscar no banco de dados as potências salvas para
     * usar no cabeçalho da JTable.
     *
     * @param trifasico Informa quais potências desejam ser buscados:
     * monofásicas ou trifásicas. Use as constantes
     * EloTransfromadorDao.MONOFASICO e EloTransformadorDao.TRIFASICO.
     * @return Um ArrayList de String's com todos as potências salvas no Banco
     * de Dados.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static ArrayList<String> buscarPotencia(boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? SELECT_POT_TRI : SELECT_POT_MONO;
        ArrayList<String> lista = new ArrayList();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);
        ResultSet resultado = comando.executeQuery();

        while (resultado.next()) {
            lista.add(resultado.getInt("id"), resultado.getString("potencia"));
        }
        return lista;
    }

    /**
     * Método responsável por extrair do Banco de Dados os elos de transformador
     * Traz em forma de matriz para exibição na JTable
     *
     * @param quantidadeKv A quantidade de colunas da tabela e, consequntemente,
     * da matriz.
     * @param trifasico Informa quais elos desejam ser buscados: monofásicos ou
     * trifásicos. Use as constantes EloTransfromadorDao.MONOFASICO e
     * EloTransformadorDao.TRIFASICO.
     * @return Um array bidimensional de Posicao(Posicao[potencia][kv]) contendo
     * todos os Elos de Transformador (monofásicos ou trifásicos) salvos no
     * banco de dados.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static Posicao[][] buscarElos(int quantidadeKv, boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? SELECT_ELO_TRI : SELECT_ELO_MONO;
        Posicao temp = new Posicao();
        ArrayList<String> listaPot = buscarPotencia(trifasico);
        Posicao[][] matriz = new Posicao[listaPot.size()][quantidadeKv];

        for (int i = 0; i < listaPot.size(); i++) {
            matriz[i][0] = new Posicao(-1, listaPot.get(i));
        }
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            resultado.getInt("id");
            temp.setCorrente(resultado.getInt("corrente"));
            temp.setTipo(resultado.getString("tipo"));
            matriz[resultado.getInt("potenciaId")][resultado.getInt("kvId")] = temp;
            temp = new Posicao();
        }
        return matriz;
    }

    /**
     * Método responsável por deletar todas as entradas das tabelas do Banco de
     * Dados referentes a Elos de Transformador
     *
     * @param trifasico Informa quais elos desejam ser deletados: monofásicos ou
     * trifásicos. Use as constantes EloTransfromadorDao.MONOFASICO e
     * EloTransformadorDao.TRIFASICO.
     * @throws SQLException Caso houver erro de acesso ao Banco de Dados, ou os
     * Dados forem inválidos.
     */
    public static void limparBanco(boolean trifasico) throws SQLException {
        String comandoSql = trifasico ? DELETE_ELO_TRI : DELETE_ELO_MONO;
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoSql);

        comando.executeUpdate();

        comandoSql = trifasico ? DELETE_KV_TRI : DELETE_KV_MONO;
        comando = conexao.prepareStatement(comandoSql);

        comando.executeUpdate();

        comandoSql = trifasico ? DELETE_POT_TRI : DELETE_POT_MONO;
        comando = conexao.prepareStatement(comandoSql);

        comando.executeUpdate();
    }
}