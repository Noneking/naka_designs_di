/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSplitPane;


/**
 *
 * @author nonek
 */
public class Controller_Main implements ActionListener {
    
    Main v;
    View.Model.Methods mv;
    
    public Controller_Main(Main v){
        this.v=v;
    }
    
    public enum Actions{
        btn_categorias,
        btn_materiales,
        btn_productos,
        btn_clientes,
        btn_empleados,
        btn_carritos,
        esconder
        
    }
    
    public void initViews(){
        this.v.SplitPane2.setDividerLocation(0);
        this.v.SplitPane2.setDividerSize(0);
        this.v.pnl_split2_izquierda.setLayout(new BorderLayout());
        
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
        initListeners();
        
        //JTableMain
        
    }
    
    public void initListeners(){
        this.v.btn_Categorias.setActionCommand("btn_categorias");
        this.v.btn_Categorias.addActionListener(this);
        
        this.v.btn_Materiales.setActionCommand("btn_materiales");
        this.v.btn_Materiales.addActionListener(this);
        this.v.btn_Productos.setActionCommand("btn_productos");
        this.v.btn_Productos.addActionListener(this);
        this.v.btn_Clientes.setActionCommand("btn_clientes");
        this.v.btn_Clientes.addActionListener(this);
        this.v.btn_Empleados.setActionCommand("btn_empleados");
        this.v.btn_Empleados.addActionListener(this);
        this.v.btn_Carritos.setActionCommand("btn_carritos");
        this.v.btn_Carritos.addActionListener(this);
        
        this.v.btn_esconder.setActionCommand("esconder");
        this.v.btn_esconder.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(Actions.valueOf(e.getActionCommand())){
            
            case btn_categorias:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_split2_izquierda.add(this.v.pnl_Categorias,BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                break;
                
            case btn_materiales:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_split2_izquierda.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);     
                
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                break;
                
            case btn_productos:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Productos, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                break;
                
            case btn_clientes:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);

                this.v.pnl_split2_izquierda.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                break;
                
            case btn_empleados:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                break;
                
            case btn_carritos:
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                break;
                
            case esconder:
                esconderSplit(this.v.SplitPane2);
                break;
            
        }
        
        
        
    }
    
    public void esconderSplit(JSplitPane sp){
        
        sp.setDividerLocation(0);
        sp.setDividerSize(0);
    }
    
//    public void last()
//    {
//        JLabel label=new JLabel();
//        label.setSize(this.v.jPanelMain.getHeight(), this.v.jPanelMain.getWidth());
//        ImageIcon fot = new ImageIcon("src/IMG/naka_art_background.png");
//        Icon icon=new ImageIcon(fot.getImage().getScaledInstance(this.v.jPanelMain.getWidth(), this.v.jPanelMain.getHeight(), Image.SCALE_DEFAULT));
//        label.setIcon(icon);
//        label.setVisible(true);
//        
//        this.v.jPanelMain.add(label);
//    }
//    
//    public void panelSetSizeBy(JPanel panelPadre, JPanel panelHijo)
//    {
//        Dimension d=panelPadre.getSize();
//        panelHijo.setSize(d);
//    }

    
}
