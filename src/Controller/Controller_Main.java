package Controller;

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

/**
 *
 * @author nonek,mrdrulix
 */
public class Controller_Main implements ActionListener, MouseListener {

    Main v;
    Model model;

    private String position = "";

    int rosa = 1;
    public Controller_Main(Main v) {
        this.v = v;
        model = new Model();
        System.out.println("");
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
        mn_historial_ventas,
        btn_home,
        mitem_masInfo,
        mitem_guardarBD,
        mitem_apariencia,
        btn_comenzarGuardadarBD,
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
        position = "CATEGORIA";
        refreshTable();
        ponerEsaTablaToGuapaYReshulona();
        

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

        this.v.btn_esconderRosa.setActionCommand("esconderRosa");
        this.v.btn_esconderRosa.addActionListener(this);
        this.v.btn_esconder_pnlPrincipal.setActionCommand("btn_esconder_pnlPrincipal");
        this.v.btn_esconder_pnlPrincipal.addActionListener(this);
        
        this.v.mn_historial_ventas.setActionCommand("mn_historial_ventas");
        this.v.mn_historial_ventas.addActionListener(this);
        this.v.btn_home.setActionCommand("btn_home");
        this.v.btn_home.addActionListener(this);
        
        
        this.v.mitem_masInfo.setActionCommand("mitem_masInfo");
        this.v.mitem_masInfo.addActionListener(this);
        this.v.mitem_apariencia.setActionCommand("mitem_apariencia");
        this.v.mitem_apariencia.addActionListener(this);
        
        this.v.mitem_guardarBD.setActionCommand("mitem_guardarBD");
        this.v.mitem_guardarBD.addActionListener(this);
        this.v.btn_comenzarGuardarBD.setActionCommand("btn_comenzarGuardadarBD");
        this.v.btn_comenzarGuardarBD.addActionListener(this);
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
                this.v.pnl_split2_izquierda.add(this.v.scrll_listaCategorias, BorderLayout.CENTER);
                
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
                this.v.pnl_split3_inserts.add(this.v.scrll_materiales, BorderLayout.CENTER);
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

                this.v.pnl_split3_inserts.add(this.v.scrll_clientes, BorderLayout.CENTER);
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

                this.v.pnl_split3_inserts.add(this.v.scrll_empleados, BorderLayout.CENTER);
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

                this.v.pnl_split3_inserts.add(this.v.scrll_carrito, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                break;
                        
            case btn_añadirCategorias:
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.scrll_categorias, BorderLayout.CENTER);
                
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);
                esconderSplit(this.v.SplitPane2);
                break;
                
            case esconderRosa:
                    esconderSplit(this.v.SplitPane1);
                    this.v.btn_esconder_pnlPrincipal.setVisible(true);
                break;
            case btn_esconder_pnlPrincipal:
                this.v.SplitPane1.setDividerLocation(200);
                    this.v.btn_esconder_pnlPrincipal.setVisible(false);
                break;

                
            case mn_historial_ventas:
                this.v.pnl_Main.removeAll();
                this.v.pnl_Main.setLayout(new BorderLayout());
                this.v.pnl_Main.add(this.v.pnl_Movimientos,BorderLayout.CENTER);
                this.v.pnl_Main.setVisible(false);
                this.v.pnl_Main.setVisible(true);
                break;
                
            case btn_home:
                this.v.pnl_Main.removeAll();
                this.v.pnl_Main.add(this.v.SplitPane1,BorderLayout.CENTER);
                this.v.pnl_Main.setVisible(false);
                this.v.pnl_Main.setVisible(true);                
                break;
                
            case mitem_masInfo: {
                try {
                    model.enlace("http://www.nakadesignsevilla.com/");
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case mitem_guardarBD:
                if(JOptionPane.showConfirmDialog(null, "Desea volcar la base de datos en un archivo '.sql'??") == 0){
                    this.v.Frame_guardandoBD.setVisible(true);
                    this.v.Frame_guardandoBD.setLocationRelativeTo(null);
                    this.v.Frame_guardandoBD.setSize(300,300);

                }
                break;
            case btn_comenzarGuardadarBD:
                HiloProgreso hilo = new HiloProgreso(this.v.pbar_guardandoBD);
                hilo.run();
                break;
                
            case mitem_apariencia:
                
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
    public void refreshTable() {
        switch (position) {
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

    public void esconderSplit(JSplitPane sp) {
        sp.setDividerLocation(0);
        sp.setDividerSize(0);
    }
}
