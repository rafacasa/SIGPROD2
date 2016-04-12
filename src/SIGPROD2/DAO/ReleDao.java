package SIGPROD2.DAO;

import SIGPROD2.Auxiliar.Arquivo;
import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.ReleBD;
import SIGPROD2.BD.Tables.CorrenteDigitalBD;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleDigital;
import SIGPROD2.Modelo.ReleEletromecanico;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            + ReleBD.FATOR_INICIO_DEFINIDO_NEUTRO + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

    public static void insereRele(Rele releParaInserir) throws SQLException {
        releParaInserir.setCodigo(getCodigoRele());
        atualizaCodigoRele();
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
            return 0;
        }
    }

    private static void atualizaCodigoRele() {
        Gson json = new Gson();
        int atual = getCodigoRele();
        String escrita = json.toJson(atual + 1);

        ARQUIVO_ID.escreverArquivo(escrita);
    }
}
