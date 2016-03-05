/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

import Facade.Facade;
import Hibernate.POJOs.Crew;
import Hibernate.POJOs.Material;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nonek
 */
public class CrewTableModel extends AbstractTableModel {
    
    Facade facade;
    
    private String[] columnNames = ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.CREW.toString());
    private List<Crew> crew;

    public CrewTableModel(Facade facade){
        this.facade=facade;
        crew=facade.getCrews();
    }
    
    public void updateTableDatas(){
        crew=facade.getCrews();
    }
    
    public void updateTableDatas(List<Crew> crew){
        this.crew=crew;
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
        return ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.CREW.toString())[columnIndex];
    }

    @Override
    public int getRowCount() {
        return crew.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return crew.get(rowIndex).getEmail();
            case 1:
                return crew.get(rowIndex).getNickname();
            case 2:
                return crew.get(rowIndex).getName();
            case 3:
                return crew.get(rowIndex).getSurname();
            case 4:
                return crew.get(rowIndex).getPhoneNumber();
            case 5:
                return crew.get(rowIndex).getRole();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
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
