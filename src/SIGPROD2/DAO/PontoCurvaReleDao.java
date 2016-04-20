package SIGPROD2.DAO;

import SIGPROD2.BD.Conexao;
import SIGPROD2.BD.Tables.PontoDeCurvaReleBD;
import SIGPROD2.Modelo.PontoCurva;
import SIGPROD2.Modelo.Rele;
import SIGPROD2.Modelo.ReleEletromecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Classe responsável por interagir com o Banco de Dados para inserir, alterar e
 * remover pontos de curva de um Relé.
 *
 * @author Rafael Casa
 * @version 06/04/2016
 */
public class PontoCurvaReleDao {

    private static final String INSERT = "INSERT INTO "
            + PontoDeCurvaReleBD.TABELA + " ("
            + PontoDeCurvaReleBD.CORRENTE + ", "
            + PontoDeCurvaReleBD.TEMPO + ", "
            + PontoDeCurvaReleBD.CORRENTE_PICKUP + ", "
            + PontoDeCurvaReleBD.IS_FASE + ", "
            + PontoDeCurvaReleBD.DIAL + ", "
            + PontoDeCurvaReleBD.CODIGO_RELE + ") VALUES (?, ?, ?, ?, ?, ?)";
    private static final String VARIAVEIS_INSERT = ", (?, ?, ?, ?, ?, ?)";
    private static final String BUSCAR = "";

    private static String montarComando(int qtd) {
        String comando = INSERT;

        for (int i = 1; i < qtd; i++) {
            comando += VARIAVEIS_INSERT;
        }
        return comando;
    }

    public static void inserirPontosCurva(ReleEletromecanico releParaInserir) throws SQLException {
        int qtd = releParaInserir.getQtdPontosCurva();
        String comandoString = montarComando(qtd);
        Connection conexao = Conexao.getConexao();
        PreparedStatement comando = conexao.prepareStatement(comandoString);

        int parou = inserePontosCurva(releParaInserir, comando, Rele.INVERSA_FASE, 0);
        inserePontosCurva(releParaInserir, comando, Rele.INVERSA_NEUTRO, parou);
        comando.executeUpdate();
        Conexao.fechaConexao();
    }

    private static int inserePontosCurva(ReleEletromecanico releParaInserir, PreparedStatement comando, int tipo, int inicio) throws SQLException {
        List<Double> listaCorrentes = releParaInserir.getCorrentePickup(tipo);
        List<Double> listaDial;
        List<PontoCurva> listaPontosCurva;
        int contador = inicio;

        for (double corrente : listaCorrentes) {
            listaDial = releParaInserir.getDialDeTempo(tipo, corrente);

            for (double dial : listaDial) {
                listaPontosCurva = releParaInserir.getPontosDialDeTempo(corrente, dial, tipo);

                for (PontoCurva ponto : listaPontosCurva) {
                    comando.setDouble(contador + 1, ponto.getCorrente());
                    comando.setDouble(contador + 2, ponto.getTempo());
                    comando.setDouble(contador + 3, corrente);
                    comando.setBoolean(contador + 4, tipo == Rele.INVERSA_FASE);
                    comando.setDouble(contador + 5, dial);
                    comando.setInt(contador + 6, releParaInserir.getCodigo());

                    contador += 6;
                }
            }
        }
        return contador;
    }
    
    public static ReleEletromecanico buscarRele(ReleEletromecanico rele)
    {
        rele.
    }
}
