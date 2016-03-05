/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

import Facade.Facade;
import Hibernate.POJOs.User;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rolando
 */
public class ClientTableModel extends AbstractTableModel {

    Facade facade;
    
    private String[] columnNames = ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.USER.toString());
    private List<User> clientes;

    public ClientTableModel(Facade facade){
        this.facade=facade;
        clientes=facade.getUsers();
    }
    
    public void updateTableDatas(){
        clientes=facade.getUsers();
    }
    
//    public void agregarCliente(User cliente) {
////        clientes.add(cliente);
//        fireTableDataChanged();
//    }
//
//    public void eliminarCliente(int rowIndex) {
////        clientes.remove(rowIndex);
//        fireTableDataChanged();
//    }
//    
//    public void limpiarClientes() {
////        clientes.clear();
//        fireTableDataChanged();
//    }

    @Override
    public String getColumnName(int columnIndex) {
        return ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.USER.toString())[columnIndex];
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientes.get(rowIndex).getCod();
            case 1:
                return clientes.get(rowIndex).getNickname();
            case 2:
                return clientes.get(rowIndex).getName();
            case 3:
                return clientes.get(rowIndex).getSurname();
            case 4:
                return clientes.get(rowIndex).getEmail();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
//        System.out.println("ENTRAA");
//        Cliente cliente = clientes.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                cliente.setId((Integer) value);
//            case 1:
//                cliente.setNombre((String) value);
//            case 2:
//                cliente.setEdad((Integer) value);
//            case 3:
//                cliente.setDireccion((String) value);
//            case 4:
//                cliente.setNombreEmpresa((String) value);
//            case 5:
//                cliente.setNombreContacto((String) value);
//        }
//        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
