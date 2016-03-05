/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

import Facade.Facade;
import Hibernate.POJOs.Category;
import Hibernate.POJOs.User;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nonek
 */
public class CategoryTableModel extends AbstractTableModel {

    Facade facade;
    
    private String[] columnNames = ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.CATEGORY.toString());
    private List<Category> categories;
    
    public CategoryTableModel(Facade facade){
        this.facade=facade;
        categories=facade.getCategories();
    }
    
    public void updateTableDatas(){
        System.out.println("UPDATE_TABLE_DATAS");
        categories=facade.getCategories();
    }
    
    public void updateTableDatas(List<Category> categories){
        System.out.println("UPDATE_TABLE_DATAS_CON_LISTA");
        this.categories=categories;
        Iterator it=this.categories.iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            System.out.println("Cod: "+c.getCod()+", Nombre: "+c.getName()+", Descripcion: "+c.getDescription());
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.CATEGORY.toString())[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return categories.get(rowIndex).getCod();
            case 1:
                return categories.get(rowIndex).getName();
            case 2:
                return categories.get(rowIndex).getDescription();
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
