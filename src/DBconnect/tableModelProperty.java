/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBconnect;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Minos
 */
public class tableModelProperty extends AbstractTableModel{
    private DBconnect connect;
    @Override
    public int getRowCount() {
        if (connect==null)
        {
            connect = new DBconnect();
        }
        int ans = connect.countRowsTable("property");
        //System.out.println("Hay "+ans+" filas");
        return ans;
    }

    @Override
    public int getColumnCount() {
        if (connect==null)
        {
            connect = new DBconnect();
        }
        int ans = connect.countColumnsTable("property");
        //System.out.println("Hay "+ans+" columnas");
        return ans;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (connect==null)
        {
            connect = new DBconnect();
        }
        return connect.getValueByIndex(rowIndex, columnIndex, "property");
    }
    @Override
    public String getColumnName(int col) {
        if (connect==null)
        {
            connect = new DBconnect();
        }
        return connect.getColumnName(col, "property");
    }
}
