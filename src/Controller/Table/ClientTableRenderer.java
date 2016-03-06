/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.basic.DefaultMenuLayout;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Rolando
 */
public class ClientTableRenderer extends JLabel implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel etiqueta = new JLabel();
        etiqueta.setOpaque(true);
        
        etiqueta.setText(value.toString());
        
        JTableHeader jth=table.getTableHeader();
        jth.setFont(new Font("Calibri", Font.BOLD, 20));
        jth.setOpaque(false);
        jth.setForeground(new Color(0, 0, 0));//AZUL
        jth.setBackground(new Color(194, 194, 194));//AZUL
        jth.setBorder(BorderFactory.createEtchedBorder());
        jth.setReorderingAllowed(false);
        
        Border border=UIManager.getBorder("TableHeader.cellBorder");
        
        TableColumn tc;
        TableColumnModel tcm=table.getColumnModel();
        for(int i=0;i<tcm.getColumnCount();i++){
            tc=tcm.getColumn(i);
            
            JLabel label=new DefaultTableCellRenderer();
            label.setText(ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.USER.toString())[i]);
            tc.setHeaderValue(ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.USER.toString())[i]);
        }
        
        table.setColumnModel(tcm);
        table.setTableHeader(jth);
        
        if(row!=-1){
            etiqueta.setFont(new Font("Calibri", Font.BOLD, 20));
            table.getColumnModel().setColumnMargin(10);
            if(value instanceof Integer || value instanceof Double) {
                if (column == 1) {
                    etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table/user.png")));
                    ((JLabel)etiqueta).setHorizontalAlignment(SwingConstants.RIGHT );
                    ((JLabel)etiqueta).setSize( 60, etiqueta.getWidth() );
                    ((JLabel)etiqueta).setPreferredSize( new Dimension(etiqueta.getWidth(), 6) );
                }
                int nombre = (int) value;
                etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);
                etiqueta.setText(Integer.toString(nombre));
            }
            else if(value instanceof String){
                if (column == 1) {
                    etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/table/user.png")));
                    ((JLabel)etiqueta).setHorizontalAlignment(SwingConstants.LEFT );
                    ((JLabel)etiqueta).setSize( 60, etiqueta.getWidth() );
                    ((JLabel)etiqueta).setPreferredSize( new Dimension(etiqueta.getWidth(), 6) );
                }
                String nombre = (String) value;
                etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
            }
            
            if (row % 2 == 0) {
                etiqueta.setEnabled(true);        
                etiqueta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
                etiqueta.setOpaque(true);
                etiqueta.setBackground( new Color(150, 166, 168) );
            } else {

                etiqueta.setEnabled(true);        
                etiqueta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
                etiqueta.setOpaque(true);
                etiqueta.setBackground( new Color(255, 255, 255) );
            }
            
            if (isSelected) {
                etiqueta.setBackground(Color.GREEN);
            }
            
            etiqueta.setToolTipText("Columna "+ColumnModel.getColumnModel(ColumnModel.COLUMN_MODEL_POSITION.USER.toString())[column]);
        }
        
        return etiqueta;
    }
}
