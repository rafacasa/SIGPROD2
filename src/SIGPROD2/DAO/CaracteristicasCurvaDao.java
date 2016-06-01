package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Rele.CaracteristicasCurvaBD;
import SIGPROD2.Modelo.CaracteristicasCurva;
import SIGPROD2.Modelo.ReleDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover as Características de Curva de um Relé Digital.
 *
 * @author Rafael Casa
 * @version 07/04/2016
 */
public class CaracteristicasCurvaDao {
    
    private static final String INSERT = "INSERT INTO "
            + CaracteristicasCurvaBD.TABELA + "( "
            + CaracteristicasCurvaBD.CODIGO_RELE + ", "
            + CaracteristicasCurvaBD.IS_FASE + ", "
            + CaracteristicasCurvaBD.NOME + ", "
            + CaracteristicasCurvaBD.A + ", "
            + CaracteristicasCurvaBD.B + ", "
            + CaracteristicasCurvaBD.P + ") VALUES (?, ?, ?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?, ?)";
    private static final String BUSCAR = "SELECT * FROM "
            + CaracteristicasCurvaBD.TABELA + " WHERE "
            + CaracteristicasCurvaBD.CODIGO_RELE + " = ?";
    
    private static String montarComando(int qtd) {
        String comando = INSERT;
        
        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }
    
    private static void insereCaracteristicasCurva(ReleDigital releParaInserir, boolean isFase) throws SQLException {
        List<CaracteristicasCurva> lista;
        if (isFase) {
            lista = releParaInserir.getListaFase();
        } else {
            lista = releParaInserir.getListaNeutro();
        }
        int qtd = lista.size();
        String comandosql = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandosql);
        
        for (int i = 0; i < qtd * 6; i += 6) {
            comando.setInt(i + 1, releParaInserir.getCodigo());
            comando.setBoolean(i + 2, isFase);
            comando.setString(i + 3, lista.get(i / 6).getNome());
            comando.setDouble(i + 4, lista.get(i / 6).getA());
            comando.setDouble(i + 5, lista.get(i / 6).getB());
            comando.setDouble(i + 6, lista.get(i / 6).getP());
        }
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
    
    public static void insereCaracteristicasCurva(ReleDigital releParaInserir) throws SQLException {
        insereCaracteristicasCurva(releParaInserir, true);
        insereCaracteristicasCurva(releParaInserir, false);
    }
    
    public static void buscarCaracteristicasCurva(ReleDigital rele) throws SQLException {
        CaracteristicasCurva caracteristicas;
        ArrayList<CaracteristicasCurva> listaFase = new ArrayList<>();
        ArrayList<CaracteristicasCurva> listaNeutro = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(BUSCAR);
        comando.setInt(1, rele.getCodigo());
        ResultSet resultado = comando.executeQuery();
        
        while (resultado.next()) {
            caracteristicas = new CaracteristicasCurva();
            caracteristicas.setNome(resultado.getString(CaracteristicasCurvaBD.NOME));
            caracteristicas.setA(resultado.getDouble(CaracteristicasCurvaBD.A));
            caracteristicas.setB(resultado.getDouble(CaracteristicasCurvaBD.B));
            caracteristicas.setP(resultado.getDouble(CaracteristicasCurvaBD.P));
            if (resultado.getBoolean(CaracteristicasCurvaBD.IS_FASE)) {
                listaFase.add(caracteristicas);
            } else {
                listaNeutro.add(caracteristicas);
            }
        }
        rele.setListaFase(listaFase);
        rele.setListaNeutro(listaNeutro);
    }
}
