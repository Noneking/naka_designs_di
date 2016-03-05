package Controller;

import Controller.Menu.ControllerMenu;
import Controller.Movimientos.ControllerMovimientos;
import Controller.Table.BasketTableModel;
import Controller.Table.BasketTableRenderer;
import Controller.Table.CategoryTableModel;
import Controller.Table.CategoryTableRenderer;
import Controller.Table.ClientTableModel;
import Controller.Table.ClientTableRenderer;
import Controller.Table.CrewTableModel;
import Controller.Table.CrewTableRenderer;
import Controller.Table.MaterialTableModel;
import Controller.Table.MaterialTableRenderer;
import Controller.Table.ProductTableModel;
import Controller.Table.ProductTableRenderer;
import DAOs.User_DAO;
import Facade.Facade;
import Model.HiloProgreso;
import Model.Model;
import View.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nonek,mrdrulix
 */
public class Controller_Main implements ActionListener, MouseListener {

    Main v;
    Model model;
    Facade facade;
    ControllerMovimientos cm = new ControllerMovimientos();
    ControllerMenu cmenu = new ControllerMenu();
    
    private ClientTableModel clientTableModel;
    private ClientTableRenderer clientTableRenderer;
    
    private CategoryTableModel categoryTableModel;
    private CategoryTableRenderer categoryTableRenderer;
    
    private MaterialTableModel materialTableModel;
    private MaterialTableRenderer materialTableRenderer;
    
    private ProductTableModel productTableModel;
    private ProductTableRenderer productTableRenderer;
    
    private CrewTableModel crewTableModel;
    private CrewTableRenderer crewTableRenderer;
    
    private BasketTableModel basketTableModel;
    private BasketTableRenderer basketTableRenderer;

    private String position = "";

    int rosa = 1;
    public Controller_Main(Main v) {
        this.v = v;
        model = new Model();
        facade = new Facade();
        
        clientTableModel = new ClientTableModel(facade);
        clientTableRenderer = new ClientTableRenderer();
        
        categoryTableModel=new CategoryTableModel(facade);
        categoryTableRenderer= new CategoryTableRenderer();
        
        materialTableModel=new MaterialTableModel(facade);
        materialTableRenderer=new MaterialTableRenderer();
        
        productTableModel=new ProductTableModel(facade);
        productTableRenderer=new ProductTableRenderer();
        
        crewTableModel=new CrewTableModel(facade);
        crewTableRenderer=new CrewTableRenderer();
        
        basketTableModel=new BasketTableModel(facade);
        basketTableRenderer=new BasketTableRenderer();
        
    }

    public enum Actions {

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
        btn_carrito_eliminar,
        btn_esconder_pnlPrincipal,
        btn_añadirCategorias;
    }

    public enum POSITION {

        CATEGORIA,
        MATERIAL,
        PRODUCTO,
        CLIENTE,
        EMPLEADO,
        CARRITO
    }

    public void initViews() {
        this.v.SplitPane2.setDividerLocation(0);
        this.v.SplitPane2.setDividerSize(0);
        this.v.pnl_split2_izquierda.setLayout(new BorderLayout());
        this.v.pnl_split3_derecha.setLayout(new BorderLayout());
        this.v.pnl_split3_inserts.setLayout(new BorderLayout());
        
        this.v.btn_esconder_pnlPrincipal.setVisible(false);

        this.v.SplitPane2.setOneTouchExpandable(false);
        this.v.SplitPane1.setOneTouchExpandable(false);
        
        this.v.SplitPane3.setDividerLocation(this.v.getWidth());
        //this.v.SplitPane3.setDividerSize(0);
        
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
        initListeners();
        this.v.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/IMG/naka_designs_sevilla_logo.png")));
        //JTableMain
        position = "CLIENTE";
//        position = "CATEGORIA";
        
        ponerEsaTablaToGuapaYReshulona();
        refreshTable();
        
        //Controllers
        cm.initMovimientosListeners(this.v);
        cmenu.initControllerMenuListeners(this.v);
        
    }

    public void initListeners() {
        this.v.btn_Categorias.setActionCommand("btn_categorias");
        this.v.btn_Categorias.addActionListener(this);

        this.v.btn_Materiales.setActionCommand("btn_materiales");
        this.v.btn_Materiales.addActionListener(this);
        this.v.btn_Clientes.setActionCommand("btn_clientes");
        this.v.btn_Clientes.addActionListener(this);
        this.v.btn_Empleados.setActionCommand("btn_empleados");
        this.v.btn_Empleados.addActionListener(this);
        this.v.btn_Carritos.setActionCommand("btn_carritos");
        this.v.btn_Carritos.addActionListener(this);
        
        this.v.btn_añadirCategoria.setActionCommand("btn_añadirCategorias");
        this.v.btn_añadirCategoria.addActionListener(this);
        
        this.v.btn_categorias_insertar.setActionCommand("btn_categoria_insertar");
        this.v.btn_categorias_insertar.addActionListener(this);
        
        this.v.btn_categorias_modificar.setActionCommand("btn_categoria_modificar");
        this.v.btn_categorias_modificar.addActionListener(this);

        this.v.btn_esconderRosa.setActionCommand("esconderRosa");
        this.v.btn_esconderRosa.addActionListener(this);
        this.v.btn_esconder_pnlPrincipal.setActionCommand("btn_esconder_pnlPrincipal");
        this.v.btn_esconder_pnlPrincipal.addActionListener(this);
        
       
//        this.v.btn_tool_insertar.addActionListener(this);
//        this.v.btn_tool_insertar.setActionCommand("btn_insertar");
//        this.v.btn_tool_modificar.addActionListener(this);
//        this.v.btn_tool_modificar.setActionCommand("btn_modificar");
//        this.v.tgb_tool_eliminar.addActionListener(this);
//        this.v.tgb_tool_eliminar.setActionCommand("btn_eliminar");

        this.v.jTableMain.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (Actions.valueOf(e.getActionCommand())) {

            case btn_categorias:
                position = POSITION.CATEGORIA.toString();
                refreshTable();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_listaCategorias.setVisible(true);
                this.v.pnl_split2_izquierda.add(this.v.pnl_listaCategorias, BorderLayout.CENTER);
                
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);

                this.v.SplitPane2.setDividerLocation(320);
                this.v.SplitPane2.setDividerSize(5);
                break;

            case btn_materiales:
                position = POSITION.MATERIAL.toString();
                refreshTable();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);
                
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;

            case btn_clientes:
                position = POSITION.CLIENTE.toString();
                refreshTable();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;

            case btn_empleados:
                position = POSITION.EMPLEADO.toString();
                refreshTable();
                refreshComboBox();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;

            case btn_carritos:
                position = POSITION.CARRITO.toString();
                refreshTable();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;
                        
            case btn_añadirCategorias:
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Categorias, BorderLayout.CENTER);
                
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;
            case btn_categoria_insertar:
                facade.insertCategory(this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                position = POSITION.CATEGORIA.toString();
                refreshTable();
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_categoria_modificar:
                facade.modifyCategory(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()),this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                position = POSITION.CATEGORIA.toString();
                refreshTable();
                ponerEsaTablaToGuapaYReshulona();
                break;
            case esconderRosa:
                this.v.SplitPane1.setDividerLocation(0);
                this.v.SplitPane1.setDividerSize(0);
                this.v.btn_esconder_pnlPrincipal.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;
            case btn_esconder_pnlPrincipal:
                this.v.SplitPane1.setDividerLocation(200);
                this.v.btn_esconder_pnlPrincipal.setVisible(false);
                
                this.v.pnl_listaCategorias.setVisible(false);
                
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (position) {
            case "CATEGORIA":
                this.v.jTextFieldCategoriaNombre.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 1).toString());
                this.v.jTextAreaCategoriaDescripcion.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 2).toString());
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
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public void refreshTable() {
        switch (position) {
            case "CATEGORIA":
                categoryTableModel.updateTableDatas();
                this.v.jTableMain.setModel(categoryTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, categoryTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "MATERIAL":
                this.v.jTableMain.setModel(materialTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, materialTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "PRODUCTO":
                this.v.jTableMain.setModel(productTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, productTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "CLIENTE":
                this.v.jTableMain.setModel(clientTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, clientTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "EMPLEADO":
                this.v.jTableMain.setModel(crewTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, crewTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "CARRITO":
                this.v.jTableMain.setModel(basketTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, basketTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
        }
    }

    public void refreshComboBox() {
        switch (position) {
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
                this.v.jComboBoxEmpleadoRol.setModel(model.getComboBoxModel("EMPLEADO"));
                break;
            case "CARRITO":

                break;
        }
    }

    public void ponerEsaTablaToGuapaYReshulona() {
        this.v.pnl_split3_derecha.add(this.v.pnl_TableMain, BorderLayout.CENTER);
    }

}
