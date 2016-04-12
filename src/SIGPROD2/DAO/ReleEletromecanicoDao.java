package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.CorrentePickupDefinidoEletromecanicoBD;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover os dados de um Rele Eletromecanico.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class ReleEletromecanicoDao {

    private static final String INSERT = "INSERT INTO "
            + CorrentePickupDefinidoEletromecanicoBD.TABELA + " ("
            + CorrentePickupDefinidoEletromecanicoBD.CODIGO_RELE + ", "
            + CorrentePickupDefinidoEletromecanicoBD.CORRENTE_PICKUP + ", "
            + CorrentePickupDefinidoEletromecanicoBD.TEMPO_ATUACAO + ", "
            + CorrentePickupDefinidoEletromecanicoBD.IS_FASE + ") VALUES (?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?)";

    public static void insereDadosReleEletromecanico(ReleEletromecanico releParaInserir) throws SQLException {
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_FASE), null, true);
        inserirCorrentePickup(releParaInserir.getCodigo(), releParaInserir.getCorrentePickup(Rele.DEFINIDO_NEUTRO), null, false);
        PontoCurvaReleDao.inserirPontosCurva((ReleEletromecanico) releParaInserir);
    }

    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

    //PREVINIR QTDS DIFERENTES DE CORRENTES E TEMPOS ATUACAO.
    private static void inserirCorrentePickup(int codigoRele, List<Double> correntes, List<Double> tempoAtuacao, boolean fase) throws SQLException {
        int qtd = correntes.size();
        String comandoString = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        for (int i = 0; i < qtd * 3; i += 3) {
            comando.setInt(i + 1, codigoRele);
            comando.setDouble(i + 2, correntes.get(i / 3));
            comando.setDouble(i + 3, tempoAtuacao.get(i / 3));
            comando.setBoolean(i + 4, fase);
        }
        comando.executeUpdate();
    }
}
