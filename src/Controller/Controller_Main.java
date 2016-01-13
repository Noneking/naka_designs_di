/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.BorderLayout;
import java.awt.Toolkit;

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
        esconderRosa,
        esconderAzul
        
    }
    
    public void initViews(){
        this.v.SplitPane2.setDividerLocation(0);
        this.v.SplitPane2.setDividerSize(0);
        this.v.pnl_split2_izquierda.setLayout(new BorderLayout());
        this.v.pnl_split2_derecha.setLayout(new BorderLayout());
        
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
        initListeners();
        this.v.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/IMG/naka_designs_sevilla_logo.png")));
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
        
        this.v.btn_esconderRosa.setActionCommand("esconderRosa");
        this.v.btn_esconderRosa.addActionListener(this);
        this.v.btn_esconderAzul.setActionCommand("esconderAzul");
        this.v.btn_esconderAzul.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(Actions.valueOf(e.getActionCommand())){
            
            case btn_categorias:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_split2_izquierda.add(this.v.pnl_Categorias,BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                this.v.btn_esconderAzul.setText(">");
                break;
                
            case btn_materiales:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_split2_izquierda.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);     
                
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                this.v.btn_esconderAzul.setText(">");
                
                break;
                
            case btn_productos:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Productos, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                this.v.btn_esconderAzul.setText(">");
                break;
                
            case btn_clientes:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);

                this.v.pnl_split2_izquierda.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                this.v.btn_esconderAzul.setText(">");
                break;
                
            case btn_empleados:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                this.v.btn_esconderAzul.setText(">");
                break;
                
            case btn_carritos:
                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.SplitPane2.setDividerLocation(300);
                this.v.SplitPane2.setDividerSize(5);
                
                this.v.pnl_split2_izquierda.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);
                this.v.btn_esconderAzul.setText(">");
                break;
                
            case esconderRosa:
                if(this.v.btn_esconderRosa.getText().equals(">")){
                   esconderSplit(this.v.SplitPane1);
                   this.v.btn_esconderRosa.setText("<");
                }else if(this.v.btn_esconderRosa.getText().equals("<")){
                    this.v.SplitPane1.setDividerLocation(150);
                    this.v.SplitPane1.setDividerSize(5);
                    this.v.btn_esconderRosa.setText(">");
                }
                break;
                
            case esconderAzul:
                
                esconderSplit(this.v.SplitPane2);
                this.v.btn_esconderAzul.setText("<");
                this.v.pnl_split2_izquierda.removeAll();
                break;
            
        }
        
        
        
    }
    public void ponerEsaTablaToGuapaYReshulona(){
        this.v.pnl_split2_derecha.add(this.v.pnl_TableMain,BorderLayout.CENTER);
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
