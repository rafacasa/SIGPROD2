package SIGPROD2.DAO;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Rele.ReleBD;
import static SIGPROD2.DAO.ReleDigitalDao.*;
import static SIGPROD2.DAO.ReleEletromecanicoDao.*;
import SIGPROD2.Modelo.Rele;
import static SIGPROD2.Modelo.Rele.*;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
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
    private static final String GET_CODIGO = "SELECT max( "
            + ReleBD.CODIGO + " ) FROM "
            + ReleBD.TABELA + " GROUP BY "
            + ReleBD.CODIGO;

    public static void insereRele(Rele releParaInserir) throws SQLException {
        int codigoAtual = getCodigoRele();
        releParaInserir.setCodigo(codigoAtual);
        inserirRele(releParaInserir);
        if (releParaInserir.isDigital()) {
            insereDadosReleDigital((ReleDigital) releParaInserir);
        } else {
            insereDadosReleEletromecanico((ReleEletromecanico) releParaInserir);
        }
    }

    private static void inserirRele(Rele releParaInserir) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);

        comando.setInt(1, releParaInserir.getCodigo());
        comando.setString(2, releParaInserir.getFabricante());
        comando.setString(3, releParaInserir.getModelo());
        comando.setBoolean(4, releParaInserir.isDigital());
        comando.setDouble(5, releParaInserir.getFatorInicio(INVERSA_FASE));
        comando.setDouble(6, releParaInserir.getFatorInicio(INVERSA_NEUTRO));
        comando.setDouble(7, releParaInserir.getFatorInicio(DEFINIDO_FASE));
        comando.setDouble(8, releParaInserir.getFatorInicio(DEFINIDO_NEUTRO));
        comando.setBoolean(9, releParaInserir.existeCurva(INVERSA_FASE));
        comando.setBoolean(10, releParaInserir.existeCurva(INVERSA_NEUTRO));
        comando.setBoolean(11, releParaInserir.existeCurva(DEFINIDO_FASE));
        comando.setBoolean(12, releParaInserir.existeCurva(DEFINIDO_NEUTRO));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static int getCodigoRele() throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(GET_CODIGO);
        ResultSet resultado = comando.executeQuery();
        if (resultado.next()) {
            return (resultado.getInt("max( " + ReleBD.CODIGO + " )")) + 1;
        }
        return 0;
    }

    public static List<Rele> buscarReles() throws SQLException {
        Rele releRecuperado;
        List<Rele> lista = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(SELECT_TODOS);
        ResultSet resultado = comando.executeQuery();
        while (resultado.next()) {
            if (resultado.getBoolean(ReleBD.IS_DIGITAL)) {
                releRecuperado = new ReleDigital();
            } else {
                releRecuperado = new ReleEletromecanico();
            }
            releRecuperado.setCodigo(resultado.getInt(ReleBD.CODIGO));
            releRecuperado.setFabricante(resultado.getString(ReleBD.FABRICANTE));
            releRecuperado.setModelo(resultado.getString(ReleBD.MODELO));
            releRecuperado.setExisteCurva(INVERSA_FASE, resultado.getBoolean(ReleBD.EXISTE_CURVA_INVERSA_FASE));
            releRecuperado.setExisteCurva(INVERSA_NEUTRO, resultado.getBoolean(ReleBD.EXISTE_CURVA_INVERSA_NEUTRO));
            releRecuperado.setExisteCurva(DEFINIDO_FASE, resultado.getBoolean(ReleBD.EXISTE_CURVA_DEFINIDA_FASE));
            releRecuperado.setExisteCurva(DEFINIDO_NEUTRO, resultado.getBoolean(ReleBD.EXISTE_CURVA_DEFINIDA_NEUTRO));
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_INVERSO_FASE), INVERSA_FASE);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_INVERSO_NEUTRO), INVERSA_NEUTRO);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_DEFINIDO_FASE), DEFINIDO_FASE);
            releRecuperado.setFatorInicio(resultado.getDouble(ReleBD.FATOR_INICIO_DEFINIDO_NEUTRO), DEFINIDO_NEUTRO);
            if (releRecuperado.isDigital()) {
                lista.add(ReleDigitalDao.buscarRele(releRecuperado));
            } else {
                lista.add(ReleEletromecanicoDao.buscarReleEletromecanico(releRecuperado));
            }
        }
        Conexao.fechaConexao();
        return lista;
    }

    //public static Rele buscarRele(String fabricante, String modelo)
    //{
    //}
}
