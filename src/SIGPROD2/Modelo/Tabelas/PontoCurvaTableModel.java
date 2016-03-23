/**
 *
 * Esta classe representa o modelo da tabela de pontos de curva dos elos
 */
package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Modelo.PontoCurva;
import java.util.ArrayList;
import java.util.Collections;
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
    
    public ArrayList<PontoCurva> getArrayList () {
        return this.pontos;
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
                }
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {//REVISADO
        return titulos[col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {//REVISADO
        return true;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            double valor = Double.parseDouble((String) value);
            PontoCurva a = pontos.get(row);

            switch (col) {
                case 0:
                    a.setCorrente(valor);
                    break;
                case 1:
                    a.setTempo(valor);
            }
            fireTableCellUpdated(row, col);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    /*public void removeTodos() {
        long init = System.currentTimeMillis();
        do {
            if (!pontos.isEmpty()) {
                remove(0);
            }
        } while (!pontos.isEmpty());
        long end = System.currentTimeMillis();
        System.out.println("this" + (end - init));
    }*/
    
    public void removeTodos () {
        this.pontos = new ArrayList<>();
    }
    
}
