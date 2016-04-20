package SIGPROD2.DAO;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.ReleBD;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover Relés.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class ReleDao {

    private static final Arquivo ARQUIVO_ID = new Arquivo("rele.ini");
    private static final String INSERT = "INSERT INTO "
            + ReleBD.TABELA + " ("
            + ReleBD.CODIGO + ", "
            + ReleBD.FABRICANTE + ", "
            + ReleBD.MODELO + ", "
            + ReleBD.IS_DIGITAL + ", "
            + ReleBD.FATOR_INICIO_INVERSO_FASE + ", "
            + ReleBD.FATOR_INICIO_INVERSO_NEUTRO + ", "
            + ReleBD.FATOR_INICIO_DEFINIDO_FASE + ", "
            + ReleBD.FATOR_INICIO_DEFINIDO_NEUTRO + ", "
            + ReleBD.EXISTE_CURVA_INVERSA_FASE + ", "
            + ReleBD.EXISTE_CURVA_INVERSA_NEUTRO + ", "
            + ReleBD.EXISTE_CURVA_DEFINIDA_FASE + ", "
            + ReleBD.EXISTE_CURVA_DEFINIDA_NEUTRO + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_TODOS = "SELECT * FROM " + ReleBD.TABELA;

    public static void insereRele(Rele releParaInserir) throws SQLException {
        int codigoAtual = getCodigoRele();
        releParaInserir.setCodigo(codigoAtual);
        atualizaCodigoRele(codigoAtual);
        inserirRele(releParaInserir);
        if (releParaInserir.isDigital()) {
            ReleDigitalDao.insereDadosReleDigital((ReleDigital) releParaInserir);
        } else {
            ReleEletromecanicoDao.insereDadosReleEletromecanico((ReleEletromecanico) releParaInserir);
        }
    }

    private static void inserirRele(Rele releParaInserir) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);

        comando.setInt(1, releParaInserir.getCodigo());
        comando.setString(2, releParaInserir.getFabricante());
        comando.setString(3, releParaInserir.getModelo());
        comando.setBoolean(4, releParaInserir.isDigital());
        comando.setDouble(5, releParaInserir.getFatorInicio(Rele.INVERSA_FASE));
        comando.setDouble(6, releParaInserir.getFatorInicio(Rele.INVERSA_NEUTRO));
        comando.setDouble(7, releParaInserir.getFatorInicio(Rele.DEFINIDO_FASE));
        comando.setDouble(8, releParaInserir.getFatorInicio(Rele.DEFINIDO_NEUTRO));
        comando.setBoolean(9, releParaInserir.existeCurva(Rele.INVERSA_FASE));
        comando.setBoolean(10, releParaInserir.existeCurva(Rele.INVERSA_NEUTRO));
        comando.setBoolean(11, releParaInserir.existeCurva(Rele.DEFINIDO_FASE));
        comando.setBoolean(12, releParaInserir.existeCurva(Rele.DEFINIDO_NEUTRO));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static int getCodigoRele() {
        Gson json = new Gson();
        if (ARQUIVO_ID.existeArquivo()) {
            String leitura = ARQUIVO_ID.lerArquivo();
            return json.fromJson(leitura, Integer.class);
        } else {
            ARQUIVO_ID.criaArquivo();
            String escrita = json.toJson(0);
            ARQUIVO_ID.escreverArquivo(escrita);
            return 0;
        }
    }

    private static void atualizaCodigoRele(int atual) {
        Gson json = new Gson();
        String escrita = json.toJson(atual + 1);

        ARQUIVO_ID.escreverArquivo(escrita);
    }

    public static List<Rele> buscarReles() throws SQLException {
        Rele releRecuperado;
        List<Rele> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_TODOS);
        ResultSet resultado = comando.executeQuery();
        Conexao.fechaConexao();
        while (resultado.next()) {
            if (resultado.getBoolean(ReleBD.IS_DIGITAL)) {
                releRecuperado = new ReleDigital();
            } else {
                releRecuperado = new ReleEletromecanico();
            }
            releRecuperado.setCodigo(resultado.getInt(ReleBD.CODIGO));
            releRecuperado.setFabricante(resultado.getString(ReleBD.FABRICANTE));
            releRecuperado.setModelo(resultado.getString(ReleBD.MODELO));
            releRecuperado.setExisteCurva(Rele.INVERSA_FASE, resultado.getBoolean(ReleBD.EXISTE_CURVA_INVERSA_FASE));
            releRecuperado.setExisteCurva(Rele.INVERSA_NEUTRO, resultado.getBoolean(ReleBD.EXISTE_CURVA_INVERSA_NEUTRO));
            releRecuperado.setExisteCurva(Rele.DEFINIDO_FASE, resultado.getBoolean(ReleBD.EXISTE_CURVA_DEFINIDA_FASE));
            releRecuperado.setExisteCurva(Rele.DEFINIDO_NEUTRO, resultado.getBoolean(ReleBD.EXISTE_CURVA_DEFINIDA_NEUTRO));
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_INVERSO_FASE), Rele.INVERSA_FASE);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_INVERSO_NEUTRO), Rele.INVERSA_NEUTRO);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_DEFINIDO_FASE), Rele.DEFINIDO_FASE);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_DEFINIDO_NEUTRO), Rele.DEFINIDO_NEUTRO);
            if (releRecuperado.isDigital()) {
                lista.add(ReleDigitalDao.buscarRele(releRecuperado));
            } else {
                lista.add(ReleEletromecanicoDao.buscarReleEletromecanico(releRecuperado));
            }
        }
        return lista;
    }

    //public static Rele buscarRele(String fabricante, String modelo)
    //{
    //}
}
