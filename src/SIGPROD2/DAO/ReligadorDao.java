package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.Religador.ReligadorBD;
import SIGPROD2.Modelo.Religador;
import static SIGPROD2.Modelo.Religador.*;
import SIGPROD2.Modelo.ReligadorDigital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Rafael Casa
 * @version 01/06/2016
 */
public class ReligadorDao {
    private static final String INSERT = "INSERT INTO "
            + ReligadorBD.TABELA + " ("
            + ReligadorBD.CODIGO + ", "
            + ReligadorBD.FABRICANTE + ", "
            + ReligadorBD.MODELO + ", "
            + ReligadorBD.IS_DIGITAL + ", "
            + ReligadorBD.FATOR_INICIO_INVERSO_FASE + ", "
            + ReligadorBD.FATOR_INICIO_INVERSO_NEUTRO + ", "
            + ReligadorBD.FATOR_INICIO_DEFINIDO_FASE + ", "
            + ReligadorBD.FATOR_INICIO_DEFINIDO_NEUTRO + ", "
            + ReligadorBD.EXISTE_CURVA_INVERSA_FASE + ", "
            + ReligadorBD.EXISTE_CURVA_INVERSA_NEUTRO + ", "
            + ReligadorBD.EXISTE_CURVA_DEFINIDA_FASE + ", "
            + ReligadorBD.EXISTE_CURVA_DEFINIDA_NEUTRO + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    
    public static void insereReligador(Religador religadorParaInserir) throws SQLException {
        int codigoAtual = getCodigoReligador();
        religadorParaInserir.setCodigo(codigoAtual);
        inserirReligador(religadorParaInserir);
        if( religadorParaInserir.isDigital() ) {
            ReligadorDigitalDao.insereDadosReligadorDigital((ReligadorDigital) religadorParaInserir);
        } else {
            
        }
    }
    
    public static void inserirReligador(Religador religadorParaInserir) throws SQLException {
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(INSERT);

        comando.setInt(1, religadorParaInserir.getCodigo());
        comando.setString(2, religadorParaInserir.getFabricante());
        comando.setString(3, religadorParaInserir.getModelo());
        comando.setBoolean(4, religadorParaInserir.isDigital());
        comando.setDouble(5, religadorParaInserir.getFatorInicio(INVERSA_FASE));
        comando.setDouble(6, religadorParaInserir.getFatorInicio(INVERSA_NEUTRO));
        comando.setDouble(7, religadorParaInserir.getFatorInicio(DEFINIDO_FASE));
        comando.setDouble(8, religadorParaInserir.getFatorInicio(DEFINIDO_NEUTRO));
        comando.setBoolean(9, religadorParaInserir.existeCurva(INVERSA_FASE));
        comando.setBoolean(10, religadorParaInserir.existeCurva(INVERSA_NEUTRO));
        comando.setBoolean(11, religadorParaInserir.existeCurva(DEFINIDO_FASE));
        comando.setBoolean(12, religadorParaInserir.existeCurva(DEFINIDO_NEUTRO));
        comando.executeUpdate();
        Conexao.fechaConexao();
    }
    
    public static int getCodigoReligador() {
        return 0;
    }
}
