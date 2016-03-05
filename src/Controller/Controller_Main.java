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
import java.awt.Point;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nonek,mrdrulix
 */
public class Controller_Main implements ActionListener, MouseListener, PopupMenuListener {

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
        btn_clicModificar,
        btn_eliminar,
        action_query,
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
        position = POSITION.CATEGORIA.toString();
//        position = "CATEGORIA";
        
        ponerEsaTablaToGuapaYReshulona();
        refreshTable(position);
        
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
        
        //QUERY
        this.v.jTextFieldTableQuery.setActionCommand("action_query");
        this.v.jTextFieldTableQuery.addActionListener(this);
        this.v.jButtonQuerySearch.setActionCommand("action_query");
        this.v.jButtonQuerySearch.addActionListener(this);
        
        //CATEGORIES
        this.v.btn_categorias_insertar.setActionCommand("btn_categoria_insertar");
        this.v.btn_categorias_insertar.addActionListener(this);
        
        this.v.btn_categorias_modificar.setActionCommand("btn_categoria_modificar");
        this.v.btn_categorias_modificar.addActionListener(this);

        //MATERIAL
        this.v.btn_insertarMaterial.setActionCommand("btn_material_insertar");
        this.v.btn_insertarMaterial.addActionListener(this);
        
        this.v.btn_modificarMaterial.setActionCommand("btn_material_modificar");
        this.v.btn_modificarMaterial.addActionListener(this);
        
        //PRODUCT
        this.v.btn_insertarProducto.setActionCommand("btn_producto_insertar");
        this.v.btn_insertarProducto.addActionListener(this);
        
        this.v.btn_modificarProducto.setActionCommand("btn_producto_modificar");
        this.v.btn_modificarProducto.addActionListener(this);
        
        //USER
        this.v.btn_insertarCliente.setActionCommand("btn_cliente_insertar");
        this.v.btn_insertarCliente.addActionListener(this);
        
        this.v.btn_modificarCliente.setActionCommand("btn_cliente_modificar");
        this.v.btn_modificarCliente.addActionListener(this);
        
        //CREW
        this.v.btn_insertarEmpleado.setActionCommand("btn_empleado_insertar");
        this.v.btn_insertarEmpleado.addActionListener(this);
        
        this.v.btn_modificarEmpleado.setActionCommand("btn_empleado_modificar");
        this.v.btn_modificarEmpleado.addActionListener(this);
        
        //BASKET
        this.v.btn_insertarCarrito.setActionCommand("btn_carrito_insertar");
        this.v.btn_insertarCarrito.addActionListener(this);
        
        ////////////////////////////////////////////////////////////////

        this.v.btn_esconderRosa.setActionCommand("esconderRosa");
        this.v.btn_esconderRosa.addActionListener(this);
        this.v.btn_esconder_pnlPrincipal.setActionCommand("btn_esconder_pnlPrincipal");
        this.v.btn_esconder_pnlPrincipal.addActionListener(this);
        
       
        //DELETE
        this.v.jMenuItemModificar.setActionCommand("btn_clicModificar");
        this.v.jMenuItemModificar.addActionListener(this);
        
        this.v.jMenuItemEliminar.setActionCommand("btn_eliminar");
        this.v.jMenuItemEliminar.addActionListener(this);
        
        
//        this.v.btn_tool_insertar.addActionListener(this);
//        this.v.btn_tool_insertar.setActionCommand("btn_insertar");
//        this.v.btn_tool_modificar.addActionListener(this);
//        this.v.btn_tool_modificar.setActionCommand("btn_modificar");
//        this.v.tgb_tool_eliminar.addActionListener(this);
//        this.v.tgb_tool_eliminar.setActionCommand("btn_eliminar");

        this.v.jTableMain.addMouseListener(this);
        this.v.jPopupMenu.addPopupMenuListener(this);
        
        initOperations();
    }
    
    public void initOperations(){
        this.v.jTableMain.setComponentPopupMenu(this.v.jPopupMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (Actions.valueOf(e.getActionCommand())) {
            case action_query:
                switch (position) {
                    case "CATEGORIA":
                        if(this.v.jTextFieldTableQuery.getText().toString().equals("")){
                            System.out.println("EntraAAA");
                            categoryTableModel.updateTableDatas();
                        }else{
                            System.out.println("ENTRA 2222");
                            categoryTableModel.updateTableDatas(facade.getCategoriesByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        position = POSITION.CATEGORIA.toString();
                        refreshTable(position);
                        ponerEsaTablaToGuapaYReshulona();
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
            case btn_categorias:
                position = POSITION.CATEGORIA.toString();
                refreshTable(position);

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split2_izquierda.removeAll();
                this.v.pnl_listaCategorias.setVisible(true);
                this.v.pnl_split2_izquierda.add(this.v.pnl_listaCategorias, BorderLayout.CENTER);
                
                this.v.pnl_split2_izquierda.setVisible(false);
                this.v.pnl_split2_izquierda.setVisible(true);

                this.v.SplitPane2.setDividerLocation(320);
                this.v.SplitPane2.setDividerSize(5);
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                break;

            case btn_materiales:
                position = POSITION.MATERIAL.toString();
                refreshTable(position);

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                break;

            case btn_clientes:
                position = POSITION.CLIENTE.toString();
                refreshTable(position);

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                break;

            case btn_empleados:
                position = POSITION.EMPLEADO.toString();
                refreshTable(position);
                refreshComboBox();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                break;

            case btn_carritos:
                position = POSITION.CARRITO.toString();
                refreshTable(position);

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
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
                categoryTableModel.updateTableDatas();
                position = POSITION.CATEGORIA.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_categoria_modificar:
                facade.modifyCategory(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()),this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                categoryTableModel.updateTableDatas();
                position = POSITION.CATEGORIA.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_material_insertar:
                facade.insertMaterial(this.v.jTextFieldMaterialNombre.getText(), Integer.parseInt(this.v.jTextFieldMaterialCantidad.getText()));
                materialTableModel.updateTableDatas();
                position = POSITION.MATERIAL.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_material_modificar:
                facade.modifyMaterial(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldMaterialNombre.getText(), Integer.parseInt(this.v.jTextFieldMaterialCantidad.getText()));
                materialTableModel.updateTableDatas();
                position = POSITION.MATERIAL.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_producto_insertar:
                facade.insertProduct(this.v.jTextFieldProductoNombre.getText(), Double.parseDouble(this.v.jTextFieldProductoPrecio.getText()), this.v.jComboBoxProductoCategoria.getSelectedItem().toString());
                productTableModel.updateTableDatas();
                position = POSITION.PRODUCTO.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_producto_modificar:
                facade.modifyProduct(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldProductoNombre.getText(), Double.parseDouble(this.v.jTextFieldProductoPrecio.getText()), this.v.jComboBoxProductoCategoria.getSelectedItem().toString());
                productTableModel.updateTableDatas();
                position = POSITION.PRODUCTO.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_cliente_insertar:
                facade.insertUser(this.v.jTextFieldClienteNickname.getText(), this.v.jTextFieldClienteNombre.getText(), this.v.jTextFieldClienteApellidos.getText(), this.v.jTextFieldClienteEmail.getText(), this.v.jPasswordFieldClientePassword.getPassword().toString());
                clientTableModel.updateTableDatas();
                position = POSITION.CLIENTE.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_cliente_modificar:
                facade.modifyUser(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldClienteNickname.getText(), this.v.jTextFieldClienteNombre.getText(), this.v.jTextFieldClienteApellidos.getText(), this.v.jTextFieldClienteEmail.getText(), this.v.jPasswordFieldClientePassword.getPassword().toString());
                clientTableModel.updateTableDatas();
                position = POSITION.CLIENTE.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_empleado_insertar:
                crewTableModel.updateTableDatas();
                facade.insertCrew(this.v.jTextFieldEmpleadoEmail.getText(), this.v.jTextFieldEmpleadoNickname.getText(), this.v.jPasswordFieldEmpleadoPassword.getPassword().toString(), this.v.jTextFieldEmpleadoNombre.getText(), this.v.jTextFieldEmpleadoApellidos.getText(), this.v.jTextFieldEmpleadoTelefono.getText(), this.v.jComboBoxEmpleadoRol.getSelectedItem().toString());
                position = POSITION.EMPLEADO.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_empleado_modificar:
                crewTableModel.updateTableDatas();
                facade.modifyCrew(this.v.jTextFieldEmpleadoEmail.getText(), this.v.jTextFieldEmpleadoNickname.getText(), this.v.jPasswordFieldEmpleadoPassword.getPassword().toString(), this.v.jTextFieldEmpleadoNombre.getText(), this.v.jTextFieldEmpleadoApellidos.getText(), this.v.jTextFieldEmpleadoTelefono.getText(), this.v.jComboBoxEmpleadoRol.getSelectedItem().toString());
                position = POSITION.EMPLEADO.toString();
                refreshTable(position);
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_carrito_insertar:
                basketTableModel.updateTableDatas();
                String user_cod=this.v.jTextFieldBasket.getText().split("-")[0];
                String product_name=this.v.eti_productoCarrito.getText().split("-")[0];
                String product_amount=this.v.eti_productoCarrito.getText().split("-")[1];
                facade.insertBasket(Integer.parseInt(user_cod), facade.getProductByName(product_name).getCod(), Integer.parseInt(product_amount));
                break;
            case btn_clicModificar:
                switch (position) {
                    case "CATEGORIA":
                        position = Controller_Main.POSITION.CATEGORIA.toString();
                        refreshTable(position);

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(300);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Categorias, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        this.v.SplitPane2.setDividerLocation(0);
                        this.v.SplitPane2.setDividerSize(0);
                        break;
                    case "MATERIAL":
                        position = Controller_Main.POSITION.MATERIAL.toString();
                        refreshTable(position);

                        ponerEsaTablaToGuapaYReshulona();

                        this.v.pnl_split3_inserts.removeAll();
                        this.v.pnl_split3_inserts.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);

                        this.v.SplitPane3.setDividerLocation(350);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.SplitPane2.setDividerLocation(0);
                        this.v.SplitPane2.setDividerSize(0);
                        break;
                    case "PRODUCTO":
                        position = Controller_Main.POSITION.PRODUCTO.toString();
                        refreshTable(position);

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(300);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Productos, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        this.v.SplitPane2.setDividerLocation(0);
                        this.v.SplitPane2.setDividerSize(0);
                        break;
                    case "CLIENTE":
                        position = Controller_Main.POSITION.CLIENTE.toString();
                        refreshTable(position);

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(200);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        this.v.SplitPane2.setDividerLocation(0);
                        this.v.SplitPane2.setDividerSize(0);
                        break;
                    case "EMPLEADO":
                        position = Controller_Main.POSITION.EMPLEADO.toString();
                        refreshTable(position);

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(200);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        this.v.SplitPane2.setDividerLocation(0);
                        this.v.SplitPane2.setDividerSize(0);
                        break;
                    case "CARRITO":
                        position = Controller_Main.POSITION.CARRITO.toString();
                        refreshTable(position);

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
                }
                break;
            case btn_eliminar:
                switch (position) {
                    case "CATEGORIA":
                        facade.deleteCategory(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        position=POSITION.CATEGORIA.toString();
                        refreshTable(position);
                        break;
                    case "MATERIAL":
                        facade.deleteMaterial(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        position=POSITION.MATERIAL.toString();
                        refreshTable(position);
                        break;
                    case "PRODUCTO":
                        facade.deleteProduct(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        position=POSITION.PRODUCTO.toString();
                        refreshTable(position);
                        break;
                    case "CLIENTE":
                        facade.deleteUser(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        position=POSITION.CLIENTE.toString();
                        refreshTable(position);
                        break;
                    case "EMPLEADO":
                        facade.deleteCrew(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString());
                        position=POSITION.EMPLEADO.toString();
                        refreshTable(position);
                        break;
                    case "CARRITO":
                        facade.deleteBasket(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        position=POSITION.CARRITO.toString();
                        refreshTable(position);
                        break;
                }
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
    
    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                int rowAtPoint = v.jTableMain.rowAtPoint(SwingUtilities.convertPoint(v.jPopupMenu, new Point(0, 0), v.jTableMain));
                if (rowAtPoint > -1) {
                    v.jTableMain.setRowSelectionInterval(rowAtPoint, rowAtPoint);
                }
            }
        });
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent e) {
        
    }
    
    public void refreshTable(String position) {
        this.position = position;
        switch (this.position) {
            case "CATEGORIA":
//                categoryTableModel.updateTableDatas();
                this.v.jTableMain.setModel(categoryTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, categoryTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "MATERIAL":
//                materialTableModel.updateTableDatas();
                this.v.jTableMain.setModel(materialTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, materialTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "PRODUCTO":
//                productTableModel.updateTableDatas();
                this.v.jTableMain.setModel(productTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, productTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "CLIENTE":
//                clientTableModel.updateTableDatas();
                this.v.jTableMain.setModel(clientTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, clientTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "EMPLEADO":
//                crewTableModel.updateTableDatas();
                this.v.jTableMain.setModel(crewTableModel);
                this.v.jTableMain.setDefaultRenderer(String.class, crewTableRenderer);
                this.v.jTableMain.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                break;
            case "CARRITO":
//                basketTableModel.updateTableDatas();
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
