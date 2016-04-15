package SIGPROD2.Modelo.Tabelas;

import SIGPROD2.Auxiliar.Erro;
import SIGPROD2.Modelo.CaracteristicasCurva;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sbrunettajr
 */
public class CaracteristicasTableModel extends DefaultTableModel {

    private ArrayList<CaracteristicasCurva> caracteristica;
    private String[] titulos;

    public CaracteristicasTableModel() {
        this.caracteristica = new ArrayList<>();
        this.titulos = new String[]{"Nome", "A", "B", "P"};
    }

    public void remove(int row) {//REVISADO
        if (row != -1) {
            this.caracteristica.remove(row);
            fireTableRowsDeleted(row, row);
        }
    }

    public void add(ArrayList<CaracteristicasCurva> caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void add(CaracteristicasCurva c) {//REVISADO
        this.caracteristica.add(c);
    }

    public ArrayList<CaracteristicasCurva> getArrayList() {
        return this.caracteristica;
    }

    @Override
    public int getColumnCount() {//REVISADO
        return 4;
    }

    @Override
    public int getRowCount() {//REVISADO
        if (this.caracteristica == null) {
            return 0;
        }
        return this.caracteristica.size();
    }

    @Override
    public Object getValueAt(int row, int col) {//REVISADO
        if (!this.caracteristica.isEmpty()) {
            CaracteristicasCurva c = this.caracteristica.get(row);

            if (c != null) {
                switch (col) {
                    case 0:
                        return c.getNome();
                    case 1:
                        return c.getA();
                    case 2:
                        return c.getB();
                    case 3:
                        return c.getP();
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
    public boolean isCellEditable(int row, int col) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        try {
            String valor = (String) value;
            CaracteristicasCurva c = caracteristica.get(row);

            switch (col) {
                case 0:
                    c.setNome(valor);
                    break;
                case 1:
                    c.setA(Double.valueOf(valor));
                    break;
                case 2:
                    c.setB(Double.valueOf(valor));
                    break;
                case 3:
                    c.setP(Double.valueOf(valor));
                    break;
            }
            fireTableCellUpdated(row, col);
        } catch (NumberFormatException ex) {
            Erro.entradaSomenteNumeros(null);
        }
    }

    public void removeTodos() {
        this.caracteristica = new ArrayList<>();
    }

}
