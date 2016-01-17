/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.Main;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;


/**
 *
 * @author nonek
 */
public class Controller_Main implements ActionListener {
    
    Main v;
    Model model;

    private String position="";
    
    public Controller_Main(Main v){
        this.v=v;
        model=new Model();
    }
    
    public enum Actions{
        btn_categorias,
        btn_materiales,
        btn_productos,
        btn_clientes,
        btn_empleados,
        btn_carritos,
        esconderRosa,
        esconderAzul,
        
        btn_insertar,
        btn_modificar,
        btn_eliminar,
        
        btn_categoria_insertar,
        btn_categoria_modificar,
        btn_categoria_eliminar,
        btn_material_insertar,
        btn_material_modificar,
        btn_material_eliminar,
        btn_producto_insertar,
        btn_producto_modificar,
        btn_producto_eliminar,
        btn_cliente_insertar,
        btn_cliente_modificar,
        btn_cliente_eliminar,
        btn_empleado_insertar,
        btn_empleado_modificar,
        btn_empleado_eliminar,
        btn_carrito_insertar,
        btn_carrito_modificar,
        btn_carrito_eliminar
    }
    
    public enum POSITION{
        CATEGORIA,
        MATERIAL,
        PRODUCTO,
        CLIENTE,
        EMPLEADO,
        CARRITO
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
        
        this.v.btn_tool_insertar.addActionListener(this);
        this.v.btn_tool_insertar.setActionCommand("btn_insertar");
        this.v.btn_tool_modificar.addActionListener(this);
        this.v.btn_tool_modificar.setActionCommand("btn_modificar");
        this.v.tgb_tool_eliminar.addActionListener(this);
        this.v.tgb_tool_eliminar.setActionCommand("btn_eliminar");
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(Actions.valueOf(e.getActionCommand())){
            
            case btn_categorias:
                position=POSITION.CATEGORIA.toString();
                refreshTable();
                
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
                position=POSITION.MATERIAL.toString();
                refreshTable();
                
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
                position=POSITION.PRODUCTO.toString();
                refreshTable();
//                refreshComboBox();
                
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
                position=POSITION.CLIENTE.toString();
                refreshTable();
                
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
                position=POSITION.EMPLEADO.toString();
                refreshTable();
                
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
                position=POSITION.CARRITO.toString();
                refreshTable();
                
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
            case btn_insertar:
                switch(position){
                    case "CATEGORIA":
                        model.insertCategory(this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                        refreshTable();
                        break;
                    case "MATERIAL":
                        model.insertMaterial(this.v.jTextFieldMaterialNombre.getText(), Integer.parseInt(this.v.jTextFieldMaterialCantidad.getText()));
                        refreshTable();
                        break;
                    case "PRODUCTO":
                        model.insertProduct(this.v.jTextFieldProductoNombre.getText(), Double.parseDouble(this.v.jTextFieldProductoPrecio.getText()), model.getCategoryByName(this.v.jComboBoxProductoCategoria.getSelectedItem().toString()).getName());
                        refreshTable();
                        break;
                    case "CLIENTE":
                        if(this.v.jTextFieldClientePassword.getText().equals(this.v.jTextFieldClienteRePassword.getText())){
                            model.insertUser(this.v.jTextFieldClienteNickname.getText(), this.v.jTextFieldClienteNombre.getText(), this.v.jTextFieldClienteApellidos.getText(), this.v.jTextFieldClienteEmail.getText(), this.v.jTextFieldClientePassword.getText());
                            refreshTable();
                        }else{
                            JOptionPane.showMessageDialog(null, "Contraseña no concuerda. Intentelo de nuevo.");
                        }
                        break;
                    case "EMPLEADO":
                        model.insertCrew(this.v.jTextFieldEmpleadoEmail.getText(), this.v.jTextFieldEmpleadoNickname.getText(), this.v.jTextFieldEmpleadoPassword.getText(), this.v.jTextFieldEmpleadoNombre.getText(), this.v.jTextFieldEmpleadoApellidos.getText(), this.v.jTextFieldEmpleadoTelefono.getText(), this.v.jComboBoxEmpleadoRol.getSelectedItem().toString());
                        refreshTable();
                        break;
                    case "CARRITO":
                        
                        break;
                }
                break;
            case btn_modificar:
                switch(position){
                    case "CATEGORIA":
                        
                        break;
                    case "MATERIAL":
                        
                        break;
                    case "PRODUCTO":
                        
                        break;
                    case "CLIENTE":
                        
                        break;
                    case "EMPLEADO":
                        
                        break;
                    case "CARRITO":
                        
                        break;
                }
                break;
            case btn_eliminar:
                switch(position){
                    case "CATEGORIA":
                        
                        break;
                    case "MATERIAL":
                        
                        break;
                    case "PRODUCTO":
                        
                        break;
                    case "CLIENTE":
                        
                        break;
                    case "EMPLEADO":
                        
                        break;
                    case "CARRITO":
                        
                        break;
                }
                break;
            case btn_categoria_insertar:
                
                break;
            case btn_categoria_modificar:
                
                break;
            case btn_categoria_eliminar:
                
                break;
            case btn_material_insertar:
                
                break;
            case btn_material_modificar:
                
                break;
            case btn_material_eliminar:
                
                break;
            case btn_producto_insertar:
                
                break;
            case btn_producto_modificar:
                
                break;
            case btn_producto_eliminar:
                
                break;
            case btn_cliente_insertar:
                
                break;
            case btn_cliente_modificar:
                
                break;
            case btn_cliente_eliminar:
                
                break;
            case btn_empleado_insertar:
                
                break;
            case btn_empleado_modificar:
                
                break;
            case btn_empleado_eliminar:
                
                break;
            case btn_carrito_insertar:
                
                break;
            case btn_carrito_modificar:
                
                break;
            case btn_carrito_eliminar:
                
                break;
        }
    }
    
    public void refreshTable(){
        switch(position){
            case "CATEGORIA":
                this.v.jTableMain.setModel(model.getTableModel("CATEGORY"));
                break;
            case "MATERIAL":
                this.v.jTableMain.setModel(model.getTableModel("MATERIAL"));
                break;
            case "PRODUCTO":
                this.v.jTableMain.setModel(model.getTableModel("PRODUCT"));
                break;
            case "CLIENTE":
                this.v.jTableMain.setModel(model.getTableModel("USER"));
                break;
            case "EMPLEADO":
                this.v.jTableMain.setModel(model.getTableModel("CREW"));
                break;
            case "CARRITO":
                this.v.jTableMain.setModel(model.getTableModel("BASKET"));
                break;
        }
    }
    
    public void refreshComboBox(){
        switch(position){
            case "CATEGORIA":
                
                break;
            case "MATERIAL":
                
                break;
            case "PRODUCTO":
                this.v.jComboBoxProductoCategoria.setModel(model.getComboBoxModel("CATEGORIA"));
                break;
            case "CLIENTE":
                
                break;
            case "EMPLEADO":
                
                break;
            case "CARRITO":
                
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
