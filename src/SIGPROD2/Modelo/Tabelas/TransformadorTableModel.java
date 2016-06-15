/**
 *
 * Esta classe representa o modelo da tabela de posições dos elos de Transformador.
 */
package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Modelo.Posicao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Coelho
 * @version 29/10/2015
 * 
 */

public class TransformadorTableModel extends DefaultTableModel {

    private List<List<String>> pos;
    private List<String> titulos;

    public TransformadorTableModel() {
        this.pos = new ArrayList<>();
        this.titulos = new ArrayList<>();
        
        this.titulos.add(" ");
    }

    public void remove(int row) {
        if (row != -1) {
            pos.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }
    
    public void addColumn (String name) {
        this.titulos.add(name);
    }
    
    public void removeColumn (int pos) {
        this.titulos.remove(pos);
    }
    
    public void add(Posicao a, int row, int col) {        
        this.pos.get(row).add(col, a.toString());
    }

    public void add(List<Posicao> a) {        
        List<String> p = new ArrayList();
        
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
    
    public String[][] getDataArray() {
        if (pos.size() > 0) {
            if (pos.get(0).size() > 0) {
                String[][] vetor = new String[pos.size()][pos.get(0).size()];
                for (int i = 0; i < pos.size(); i++) {
                    List<String> linha = pos.get(i);
                    for (int j = 0; j < linha.size(); j++) {
                        vetor[i][j] = linha.get(j);
                        System.out.println(linha.get(j));
                    }
                }
                return vetor;
            }
        }
        return new String[0][0];
    }

    @Override
    public int getColumnCount() {
        return titulos.size();
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
        return this.titulos.get(col);
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
                    //pos.get(row).set(col, valor.getTipo());
                    System.out.println("Hello");
            }
            fireTableCellUpdated(row, col);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    public void removeTodos() {
        pos = new ArrayList<List<String>>();
    }
}
