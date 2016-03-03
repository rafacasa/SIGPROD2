/**
 *
 * Esta classe representa o modelo da tabela de posições dos elos de Transformador.
 */
package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Modelo.Posicao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Coelho
 * @version 29/10/2015
 */
public class TransformadorTableModel extends DefaultTableModel {

    private ArrayList<ArrayList<String>> pos;
    private String titulos[];

    public TransformadorTableModel() {
        pos = new ArrayList<>();
        titulos = new String[]{"Nome", "Posição 1", "Posição 2", "Posição 3", "Posição 4", "Posição 5"};
    }

    public void remove(int row) {
        if (row != -1) {
            pos.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }

    public void add(Posicao a, int row, int col) {        
        this.pos.get(row).add(col, a.toString());
    }

    public void add(ArrayList<Posicao> a) {        
        ArrayList<String> p = new ArrayList();
        
        for (Posicao a1 : a) {
            if (a1.getCorrente() == -1)
                p.add(a1.getTipo());
            else   
                p.add(a1.toString());
        }
        this.pos.add(new ArrayList<String>());
        this.pos.get(getRowCount() - 1).addAll(p);        
        for (Posicao a1 : a) {
            System.out.print(a1.toString() + " ");
        }
        System.out.println("");        
        fireTableCellUpdated(0, 0);
    }
    
    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public int getRowCount() {
        if (pos == null) {
            return 0;
        }
        return pos.size();
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (!pos.isEmpty() && row < pos.size() && col < pos.get(row).size()) {
            String a = pos.get(row).get(col);

            if (a != null) {
                 return a;
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return titulos[col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            Posicao valor = (Posicao) value;
                                    
            if (pos != null && !pos.isEmpty()) {
                if (valor.getCorrente() != -1)
                    pos.get(row).set(col, valor.toString());
                else
                    pos.get(row).set(col, valor.getTipo());
            }
            fireTableCellUpdated(row, col);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    public void removeTodos() {
        do {
            if (!pos.isEmpty()) {
                remove(0);
            }
        } while (!pos.isEmpty());
    }
}
