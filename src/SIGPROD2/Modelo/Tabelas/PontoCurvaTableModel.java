/**
 *
 * Esta classe representa o modelo da tabela de pontos de curva dos elos
 */
package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Modelo.PontoCurva;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Coelho
 * @version 16/08/2015
 */
public class PontoCurvaTableModel extends DefaultTableModel {

    private ArrayList<PontoCurva> pontos;
    private String titulos[];

    public PontoCurvaTableModel() {//REVISADO
        pontos = new ArrayList<>();
        titulos = new String[]{"Corrente", "Tempo"};
    }

    public void remove(int row) {//REVISADO
        if (row != -1) {
            pontos.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }

    public void add(ArrayList<PontoCurva> pontos) {
        this.pontos = pontos;
    }

    public void add(PontoCurva a) {//REVISADO
        this.pontos.add(a);
    }

    public ArrayList<PontoCurva> getArrayList() {
        ArrayList<PontoCurva> ponto = new ArrayList();
        for (PontoCurva p : this.pontos) {
            ponto.add(new PontoCurva(p));
        }
        return ponto;
    }
    public void setArrayList(ArrayList<PontoCurva> pontos){
        this.pontos = pontos;
    }
    
    @Override
    public int getColumnCount() {//REVISADO
        return 2;
    }

    @Override
    public int getRowCount() {//REVISADO
        if (pontos == null) {
            return 0;
        }
        return pontos.size();
    }

    @Override
    public Object getValueAt(int row, int col) {//REVISADO
        if (!pontos.isEmpty()) {
            PontoCurva a = pontos.get(row);
            
            if (a != null) {
                switch (col) {
                    case 0:
                        return a.getCorrente();
                    case 1:
                        return a.getTempo();
                    default:
                        break;
                }
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return titulos[col];
    }
    
    @Override
    public Class<?> getColumnClass (int coluna) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            String val = value.toString();
            val = val.replace(',', '.');
            double valor = Double.parseDouble(val);
            PontoCurva a = pontos.get(row);

            switch (col) {
                case 0:
                    a.setCorrente(valor);
                    break;
                case 1:
                    a.setTempo(valor);
                    break;
                default:
                    break;
            }
            fireTableCellUpdated(row, col);
        } catch (Exception ex) {
            Erro.entradaSomenteNumeros(null);
        }
    }

    public void removeTodos() {
        this.pontos = new ArrayList<>();
    }

}
