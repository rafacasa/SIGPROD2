package SIGPROD2.Auxiliar;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 *
 * @author sbrunettajr 
 * 08/03/2K16
 *
 */

public class MyRenderer extends DefaultTableCellRenderer {
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (column == 0) {
            c.setBackground(new Color(238, 238, 238));
        } else {
            c.setBackground(Color.WHITE);
        }
        setForeground(Color.BLACK);
        setHorizontalAlignment(CENTER);
        return c;
    }  

}
