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
import Hibernate.POJOs.Crew;
import Model.HiloProgreso;
import Model.Model;
import View.Main;
import com.itextpdf.text.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridLayout;
import java.awt.Label;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek,mrdrulix
 */
public class Controller_Main implements ActionListener, MouseListener, PopupMenuListener {

    Main v;
    Model model;
    Facade facade;
    ControllerMovimientos cm = new ControllerMovimientos();
    ControllerMenu cmenu;
    
    Crew crew_logged;

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

    int rosa = 1;

    public Controller_Main(Main v, Crew crew_logged, Facade facade) {
        this.v = v;
        this.v.setExtendedState(MAXIMIZED_BOTH);
        model = new Model();
        this.facade = facade;
        this.crew_logged=crew_logged;
        cmenu=new ControllerMenu(facade);

        clientTableModel = new ClientTableModel(this.facade);
        clientTableRenderer = new ClientTableRenderer();

        categoryTableModel = new CategoryTableModel(this.facade);
        categoryTableRenderer = new CategoryTableRenderer();

        materialTableModel = new MaterialTableModel(this.facade);
        materialTableRenderer = new MaterialTableRenderer();

        productTableModel = new ProductTableModel(this.facade);
        productTableRenderer = new ProductTableRenderer();

        crewTableModel = new CrewTableModel(this.facade);
        crewTableRenderer = new CrewTableRenderer();

        basketTableModel = new BasketTableModel(this.facade);
        basketTableRenderer = new BasketTableRenderer();

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
        btn_añadirCategorias,
        jButtonBuscarCliente,
        jButtonBuscarProducto,
        jButtonProductoAñadirMaterial;
    }

    public void initViews() {
        this.v.pnl_split3_derecha.setLayout(new BorderLayout());
        this.v.pnl_split3_inserts.setLayout(new BorderLayout());

        this.v.btn_esconder_pnlPrincipal.setVisible(false);

        this.v.SplitPane1.setOneTouchExpandable(false);
        this.v.SplitPane1.setDividerLocation(200);
        this.v.pnl_listaCategorias.setVisible(false);

        this.v.SplitPane3.setDividerLocation(this.v.getWidth());
        //this.v.SplitPane3.setDividerSize(0);

        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
        initListeners();
        this.v.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/IMG/naka_designs_sevilla_logo.png")));
        //JTableMain
        Position.setPosition(Position.POSITION.CATEGORIA.toString());

        ponerEsaTablaToGuapaYReshulona();
        refreshTable(Position.getPosition());

        //Controllers
        cm.initMovimientosListeners(this.v);

        cmenu.initControllerMenuListeners(this.v, this.crew_logged, this.facade);

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
        
        this.v.jButtonProductoAñadirMaterial.setActionCommand("jButtonProductoAñadirMaterial");
        this.v.jButtonProductoAñadirMaterial.addActionListener(this);
        
        this.v.jTable_materialesProducto.addMouseListener(this);

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

        this.v.jTableMain.addMouseListener(this);
        this.v.jPopupMenu.addPopupMenuListener(this);
        
        //Botones de carrito
        this.v.jButtonBuscarCliente.setActionCommand("jButtonBuscarCliente");
        this.v.jButtonBuscarCliente.addActionListener(this);
        this.v.jButtonBuscarProducto.setActionCommand("jButtonBuscarProducto");
        this.v.jButtonBuscarProducto.addActionListener(this);

        initOperations();
    }

    public void initOperations() {
        this.v.jTableMain.setComponentPopupMenu(this.v.jPopupMenu);
        
        this.v.eti_nickCrew.setText(crew_logged.getNickname());
        this.v.eti_emailCrew.setText(crew_logged.getEmail());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String passString;
        
        switch (Actions.valueOf(e.getActionCommand())) {
            case action_query:
                switch (Position.getPosition()) {
                    case "CATEGORIA":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            categoryTableModel.updateTableDatas();
                        } else {
                            categoryTableModel.updateTableDatas(facade.getCategoriesByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        Position.setPosition(Position.POSITION.CATEGORIA.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                    case "MATERIAL":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            materialTableModel.updateTableDatas();
                        } else {
                            materialTableModel.updateTableDatas(facade.getMaterialsByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        Position.setPosition(Position.POSITION.MATERIAL.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                    case "PRODUCTO":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            productTableModel.updateTableDatas();
                        } else {
                            productTableModel.updateTableDatas(facade.getProductsByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        Position.setPosition(Position.POSITION.PRODUCTO.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                    case "CLIENTE":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            clientTableModel.updateTableDatas();
                        } else {
                            clientTableModel.updateTableDatas(facade.getUsersByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        Position.setPosition(Position.POSITION.CLIENTE.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                    case "EMPLEADO":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            crewTableModel.updateTableDatas();
                        } else {
                            crewTableModel.updateTableDatas(facade.getCrewsByQuery(this.v.jTextFieldTableQuery.getText()));
                        }
                        Position.setPosition(Position.POSITION.EMPLEADO.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                    case "CARRITO":
                        if (this.v.jTextFieldTableQuery.getText().toString().equals("")) {
                            basketTableModel.updateTableDatas();
                        } else {
                            try {
                                basketTableModel.updateTableDatas(facade.getBasketByQuery(this.v.jTextFieldTableQuery.getText()));
                            } catch (Exception ex) {
                                System.err.println(ex);
                            }
                        }
                        Position.setPosition(Position.POSITION.CARRITO.toString());
                        refreshTable(Position.getPosition());
                        ponerEsaTablaToGuapaYReshulona();
                        break;
                }
                this.v.jTextFieldTableQuery.requestFocusInWindow();
                this.v.jTextFieldTableQuery.setCaretPosition(this.v.jTextFieldTableQuery.getDocument().getLength());
                break;
            case btn_categorias:
                Position.setPosition(Position.POSITION.CATEGORIA.toString());
                refreshTable(Position.getPosition());

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_listaCategorias.setVisible(true);

                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(500);
                this.v.pnl_listaCategorias.setVisible(true);
                break;

            case btn_materiales:
                Position.setPosition(Position.POSITION.MATERIAL.toString());
                refreshTable(Position.getPosition());

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;

            case btn_clientes:
                Position.setPosition(Position.POSITION.CLIENTE.toString());
                refreshTable(Position.getPosition());

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;

            case btn_empleados:
                Position.setPosition(Position.POSITION.EMPLEADO.toString());
                refreshTable(Position.getPosition());
                refreshComboBox();

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);

                break;

            case btn_carritos:
                Position.setPosition(Position.POSITION.CARRITO.toString());
                refreshTable(Position.getPosition());

                ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(10000);
                this.v.SplitPane3.setDividerSize(0);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;

            case btn_añadirCategorias:
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Categorias, BorderLayout.CENTER);

                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case btn_categoria_insertar:
                facade.insertCategory(this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                categoryTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.CATEGORIA.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_categoria_modificar:
                facade.modifyCategory(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldCategoriaNombre.getText(), this.v.jTextAreaCategoriaDescripcion.getText());
                categoryTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.CATEGORIA.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_material_insertar:
                facade.insertMaterial(this.v.jTextFieldMaterialNombre.getText(), Integer.parseInt(this.v.jTextFieldMaterialCantidad.getText()));
                materialTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.MATERIAL.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_material_modificar:
                facade.modifyMaterial(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldMaterialNombre.getText(), Integer.parseInt(this.v.jTextFieldMaterialCantidad.getText()));
                materialTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.MATERIAL.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_producto_insertar:
                facade.insertProduct(this.v.jTextFieldProductoNombre.getText(), Double.parseDouble(this.v.jTextFieldProductoPrecio.getText()), this.v.jComboBoxProductoCategoria.getSelectedItem().toString());
                productTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.PRODUCTO.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                
                try{
                    Component[] components=this.v.jPanelMaterialesAñadidos.getComponents();
                    if(components.length>0){
                        int i=0;
                        while(i<components.length){
                            Label nombre=(Label) components[i];
                            Label cantidad=(Label) components[i+1];
                            i=i+2;
                            facade.insertProductMaterial(Integer.parseInt(cantidad.getText()), facade.getProductByName(this.v.jTextFieldProductoNombre.getText()).getCod(), facade.getMaterialByName(nombre.getText()).getCod());
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar los materiales del producto");
                    }
                }catch(Exception ex){
                    facade.deleteProduct(facade.getProductByName(this.v.jTextFieldProductoNombre.getText()).getCod());
                    productTableModel.updateTableDatas();
                    Position.setPosition(Position.POSITION.PRODUCTO.toString());
                    refreshTable(Position.getPosition());
                    ponerEsaTablaToGuapaYReshulona();
                }
                
                break;
            case btn_producto_modificar:
                facade.modifyProduct(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldProductoNombre.getText(), Double.parseDouble(this.v.jTextFieldProductoPrecio.getText()), this.v.jComboBoxProductoCategoria.getSelectedItem().toString());
                productTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.PRODUCTO.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_cliente_insertar:
                facade.insertUser(this.v.jTextFieldClienteNickname.getText(), this.v.jTextFieldClienteNombre.getText(), this.v.jTextFieldClienteApellidos.getText(), this.v.jTextFieldClienteEmail.getText(), this.v.jPasswordFieldClientePassword.getPassword().toString());
                clientTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.CLIENTE.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_cliente_modificar:
                facade.modifyUser(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()), this.v.jTextFieldClienteNickname.getText(), this.v.jTextFieldClienteNombre.getText(), this.v.jTextFieldClienteApellidos.getText(), this.v.jTextFieldClienteEmail.getText(), this.v.jPasswordFieldClientePassword.getPassword().toString());
                clientTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.CLIENTE.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_empleado_insertar:
                passString = new String(this.v.jPasswordFieldEmpleadoPassword.getPassword());
                facade.insertCrew(this.v.jTextFieldEmpleadoEmail.getText(), this.v.jTextFieldEmpleadoNickname.getText(), passString, this.v.jTextFieldEmpleadoNombre.getText(), this.v.jTextFieldEmpleadoApellidos.getText(), this.v.jTextFieldEmpleadoTelefono.getText(), this.v.jComboBoxEmpleadoRol.getSelectedItem().toString());
                crewTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.EMPLEADO.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_empleado_modificar:
                passString = new String(this.v.jPasswordFieldEmpleadoPassword.getPassword());
                facade.modifyCrew(this.v.jTextFieldEmpleadoEmail.getText(), this.v.jTextFieldEmpleadoNickname.getText(), passString, this.v.jTextFieldEmpleadoNombre.getText(), this.v.jTextFieldEmpleadoApellidos.getText(), this.v.jTextFieldEmpleadoTelefono.getText(), this.v.jComboBoxEmpleadoRol.getSelectedItem().toString());
                crewTableModel.updateTableDatas();
                Position.setPosition(Position.POSITION.EMPLEADO.toString());
                refreshTable(Position.getPosition());
                ponerEsaTablaToGuapaYReshulona();
                break;
            case btn_carrito_insertar:
                String user_cod = this.v.jTextFieldBasket.getText().split("-")[0];
                String product_name = this.v.eti_productoCarrito.getText().split("-")[0];
                String product_amount = this.v.eti_productoCarrito.getText().split("-")[1];
                facade.insertBasket(Integer.parseInt(user_cod), facade.getProductByName(product_name).getCod(), Integer.parseInt(product_amount));
                basketTableModel.updateTableDatas();
                break;
            case btn_clicModificar:
                switch (Position.getPosition()) {
                    case "CATEGORIA":
                        Position.setPosition(Position.POSITION.CATEGORIA.toString());
                        refreshTable(Position.getPosition());

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(300);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Categorias, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        break;
                    case "MATERIAL":
                        Position.setPosition(Position.POSITION.MATERIAL.toString());
                        refreshTable(Position.getPosition());

                        ponerEsaTablaToGuapaYReshulona();

                        this.v.pnl_split3_inserts.removeAll();
                        this.v.pnl_split3_inserts.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);

                        this.v.SplitPane3.setDividerLocation(350);
                        this.v.SplitPane3.setDividerSize(5);

                        break;
                    case "PRODUCTO":
                        Position.setPosition(Position.POSITION.PRODUCTO.toString());
                        refreshTable(Position.getPosition());

                        System.out.println("ESTA EN PRODUCTO");
                        
                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(300);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Productos, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        break;
                    case "CLIENTE":
                        Position.setPosition(Position.POSITION.CLIENTE.toString());
                        refreshTable(Position.getPosition());

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(200);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        break;
                    case "EMPLEADO":
                        Position.setPosition(Position.POSITION.EMPLEADO.toString());
                        refreshTable(Position.getPosition());

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(200);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        break;
                    case "CARRITO":
                        Position.setPosition(Position.POSITION.CARRITO.toString());
                        refreshTable(Position.getPosition());

                        ponerEsaTablaToGuapaYReshulona();
                        this.v.pnl_split3_inserts.removeAll();
                        this.v.SplitPane3.setDividerLocation(300);
                        this.v.SplitPane3.setDividerSize(5);

                        this.v.pnl_split3_inserts.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                        this.v.pnl_split3_inserts.setVisible(false);
                        this.v.pnl_split3_inserts.setVisible(true);
                        break;
                }
                break;
            case btn_eliminar:
                switch (Position.getPosition()) {
                    case "CATEGORIA":
                        facade.deleteCategory(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        Position.setPosition(Position.POSITION.CATEGORIA.toString());
                        refreshTable(Position.getPosition());
                        break;
                    case "MATERIAL":
                        facade.deleteMaterial(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        Position.setPosition(Position.POSITION.MATERIAL.toString());
                        refreshTable(Position.getPosition());
                        break;
                    case "PRODUCTO":
                        facade.deleteProduct(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        Position.setPosition(Position.POSITION.PRODUCTO.toString());
                        refreshTable(Position.getPosition());
                        break;
                    case "CLIENTE":
                        facade.deleteUser(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        Position.setPosition(Position.POSITION.CLIENTE.toString());
                        refreshTable(Position.getPosition());
                        break;
                    case "EMPLEADO":
                        facade.deleteCrew(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString());
                        Position.setPosition(Position.POSITION.EMPLEADO.toString());
                        refreshTable(Position.getPosition());
                        break;
                    case "CARRITO":
                        facade.deleteBasket(Integer.parseInt(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString()));
                        Position.setPosition(Position.POSITION.CARRITO.toString());
                        refreshTable(Position.getPosition());
                        break;
                }
                break;
            case esconderRosa:
                this.v.SplitPane1.setDividerLocation(0);
                this.v.SplitPane1.setDividerSize(0);
                this.v.btn_esconder_pnlPrincipal.setVisible(true);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case btn_esconder_pnlPrincipal:
                this.v.SplitPane1.setDividerLocation(200);
                this.v.btn_esconder_pnlPrincipal.setVisible(false);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case jButtonBuscarCliente:
                this.v.jFrame_clienteCarrito.setVisible(true);
                this.v.jFrame_clienteCarrito.setSize(567, 320);
                this.v.jFrame_clienteCarrito.setLocationRelativeTo(null);
                break;
            case jButtonBuscarProducto:
                this.v.jFrame_productoCarrito.setVisible(true);
                this.v.jFrame_productoCarrito.setSize(567, 335);
                this.v.jFrame_productoCarrito.setLocationRelativeTo(null);
                break;
            case jButtonProductoAñadirMaterial:
                this.v.jFrame_materialesProducto.setVisible(true);
                this.v.jFrame_materialesProducto.setSize(567, 320);
                this.v.jFrame_materialesProducto.setLocationRelativeTo(null);
                
//                this.v.jTable_materialesProducto.setModel(facade.getTableModelMaterial());
//                Position.setPosition(Position.POSITION.PRODUCT_MATERIAL.toString());
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (Position.getPosition()) {
            case "CATEGORIA":
                this.v.jTextFieldCategoriaNombre.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 1).toString());
                this.v.jTextAreaCategoriaDescripcion.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 2).toString());
                break;
            case "MATERIAL":
                
                break;
            case "PRODUCTO":
                if(e.getComponent()!=this.v.jTable_materialesProducto){
                    this.v.jTextFieldProductoNombre.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 0).toString());
                    this.v.jTextFieldProductoPrecio.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 1).toString());
                    this.v.jTextFieldProductoCantidad.setText(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 2).toString());
                    this.v.jComboBoxProductoCategoria.setModel(facade.getComboBoxModelCategory());
                    for(int i=0;i<this.v.jComboBoxProductoCategoria.getItemCount();i++){
                        if(this.v.jComboBoxProductoCategoria.getItemAt(i).toString().equals(this.v.jTableMain.getValueAt(this.v.jTableMain.getSelectedRow(), 3).toString())){
                            this.v.jComboBoxProductoCategoria.setSelectedIndex(i);
                        }
                    }
                }else{
                    if(Integer.parseInt(this.v.jSpinner_materialesProducto.getValue().toString())>0){
                        //este boton se encarga de ejecutar un grid layout 
                        GridLayout g = new GridLayout(0, 2);// por defecto creamos el objeto GridLayout y le damos los parametros de 0 filas y 2 columnas
                        this.v.jPanelMaterialesAñadidos.setLayout(g);//le pasamos al panel en el que vamos a meter los elementos de pruebas un layout con el objeto GridLayout
                        this.v.jTable_materialesProducto.setFocusable(false);
                        this.v.jTable_materialesProducto.setRowSelectionAllowed(true);
                        Label nombre=new Label();
                        nombre.setText(this.v.jTable_materialesProducto.getValueAt(this.v.jTable_materialesProducto.getSelectedRow(), 1).toString());
                        nombre.setFont(new java.awt.Font("Calibri", Font.BOLD, 30));
                        this.v.jPanelMaterialesAñadidos.add(nombre);
                        Label cantidad=new Label();
                        cantidad.setText(this.v.jSpinner_materialesProducto.getValue().toString());
                        cantidad.setFont(new java.awt.Font("Calibri", Font.BOLD, 30));
                        this.v.jPanelMaterialesAñadidos.add(cantidad);
                        this.v.jSpinner_materialesProducto.setValue(0);

                        String horGap = "10";
                        String verGap = "10";

                        try{//creamos un try para controlar que se metan los campos requeridos, sino saltara un error
                            g.setHgap(Integer.parseInt(horGap));
                            g.setVgap(Integer.parseInt(verGap));
                            g.layoutContainer(this.v.jPanelMaterialesAñadidos);
                        } catch (Exception ex) {
                            System.err.println(ex);
                        }



                        for(int i=0;i<this.v.jTable_materialesProducto.getRowCount();i++){
                            if(this.v.jTable_materialesProducto.getValueAt(i, 1).toString().equals(nombre.getText())){
                                DefaultTableModel dtm=(DefaultTableModel) this.v.jTable_materialesProducto.getModel();
                                dtm.removeRow(i);
                                this.v.jTable_materialesProducto.setModel(dtm);
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una cantidad superior a cero");
                    }
                    
                }
                
                break;
            case "CLIENTE":

                break;
            case "EMPLEADO":

                break;
            case "CARRITO":

                break;
            case "PRODUCT_MATERIAL":
                
                break;
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

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
//        Position.setPosition(position);
        switch (Position.getPosition()) {
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
        switch (Position.getPosition()) {
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
