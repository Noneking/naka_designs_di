/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Menu;

import Controller.Controller_Login;
import Controller.Controller_Main;
import Controller.Position;
import Controller.RUN;
import Facade.Facade;
import Hibernate.POJOs.Crew;
import Model.HiloProgreso;
import Model.LectorTema;
import Model.Model;
import View.Main;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MrDrulix
 */
public class ControllerMenu extends EnumMenu implements ActionListener{

    Main v;
    Model model = new Model();
    Controller_Main cm;
    Facade facade;
    //cadenas estaticas de las rutas de los lookandfeels
    static String ALUOXIDE ="de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel";
    static String BLACKEYE ="de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel";
    static String BLACKSTART="de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel";
    static String CLASSY="de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel";

    public ControllerMenu(Facade facade){
        this.facade=facade;
    }
  
    public void initControllerMenuListeners(Main v, Crew crew_logged, Facade facade) {
        this.v = v;
        this.facade=facade;
        this.v.mn_historial_ventas.setActionCommand("mn_historial_ventas");
        this.v.mn_historial_ventas.addActionListener(this);
        
        
        //mas informacion
        this.v.mitem_masInfo.setActionCommand("mitem_masInfo");
        this.v.mitem_masInfo.addActionListener(this);
        //apariencia
        this.v.mn_apariencia.setActionCommand("mn_apariencia");
        this.v.mn_apariencia.addActionListener(this);
        
            //mitem apariencia
            this.v.mitem_aluoxide.setActionCommand("mitem_aluoxide");
            this.v.mitem_aluoxide.addActionListener(this);
            this.v.mitem_blackeye.setActionCommand("mitem_blackeye");
            this.v.mitem_blackeye.addActionListener(this);
            this.v.mitem_blackstart.setActionCommand("mitem_blackstart");
            this.v.mitem_blackstart.addActionListener(this);
            this.v.mitem_classy.setActionCommand("mitem_classy");
            this.v.mitem_classy.addActionListener(this);
            
        //Crear Nuevo...
            this.v.mitem_nuevoProducto.setActionCommand("mitem_nuevoProducto");
            this.v.mitem_nuevoProducto.addActionListener(this);
            this.v.mitem_nuevoMaterial.setActionCommand("mitem_nuevoMaterial");
            this.v.mitem_nuevoMaterial.addActionListener(this);
            this.v.mitem_nuevoCliente.setActionCommand("mitem_nuevoCliente");
            this.v.mitem_nuevoCliente.addActionListener(this);
            this.v.mitem_nuevoEmpleado.setActionCommand("mitem_nuevoEmpleado");
            this.v.mitem_nuevoEmpleado.addActionListener(this);
            this.v.mitem_nuevoCarrito.setActionCommand("mitem_nuevoCarrito");
            this.v.mitem_nuevoCarrito.addActionListener(this);
        this.v.mitem_logout.setActionCommand("mitem_logout");
        this.v.mitem_logout.addActionListener(this);
        this.v.mitem_configCrew.setActionCommand("mitem_configCrew");
        this.v.mitem_configCrew.addActionListener(this);
            this.v.btn_cancelarConfiCrew.setActionCommand("btn_cancelarConfiCrew");
            this.v.btn_cancelarConfiCrew.addActionListener(this);
            this.v.btn_modificarConfiCrew.setActionCommand("btn_modificarConfiCrew");
            this.v.btn_modificarConfiCrew.addActionListener(this);
            cm = new Controller_Main(this.v, crew_logged, facade);
            
            this.v.pnl_contenedorDerechoMovimientos.setLayout(new BorderLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Actions.valueOf(e.getActionCommand())){
            //cambio a menu Historial Ventas,  cambio de panel y de ControllerMovimientos
            case mn_historial_ventas:
                this.v.pnl_Main.removeAll();
                this.v.pnl_Main.setLayout(new BorderLayout());
                this.v.pnl_Main.add(this.v.pnl_Movimientos, BorderLayout.CENTER);
                this.v.pnl_Main.setVisible(false);
                this.v.pnl_Main.setVisible(true);
                this.v.pnl_contenedorDerechoMovimientos.removeAll();
                this.v.pnl_contenedorDerechoMovimientos.add(this.v.pnl_mensageMovimientos,BorderLayout.CENTER);
                break;
            //mas infromacion sobre la empresa, la pagina web, por ahora en mantenimiento
            case mitem_masInfo: {
                try {
                    enlace("http://www.nakadesignsevilla.com/");
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
          

            //Comienzo de las apariencias "LookAndFeel" de Synthetical-------------------------------------------------------
            case mitem_aluoxide:
                try {
                    UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());

                    UIManager.setLookAndFeel(ALUOXIDE);
                    SwingUtilities.updateComponentTreeUI(this.v);

                    LectorTema.setPropiedad(ALUOXIDE);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;

            case mitem_blackeye:
                try {
                    UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());

                    UIManager.setLookAndFeel(BLACKEYE);
                    SwingUtilities.updateComponentTreeUI(this.v);
                    LectorTema.setPropiedad(BLACKEYE);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;

            case mitem_blackstart:
                try {
                    UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());

                    UIManager.setLookAndFeel(BLACKSTART);
                    SwingUtilities.updateComponentTreeUI(this.v);
                    LectorTema.setPropiedad(BLACKSTART);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;

            case mitem_classy:
                try {
                    UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());

                    UIManager.setLookAndFeel(CLASSY);
                    SwingUtilities.updateComponentTreeUI(this.v);
                    LectorTema.setPropiedad(CLASSY);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
                    
            //FIN de las apariencias "LookAndFeel" de Synthetical------------------------------------------------------------
                
            //Comienzo de Nuevo ...------------------------------------------------------------------------------------------ 
            case mitem_nuevoProducto:
                
                Position.setPosition(Position.POSITION.PRODUCTO.toString());
                cm.refreshTable(Position.getPosition());

                cm.ponerEsaTablaToGuapaYReshulona();
                
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Productos, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(350);
                this.v.SplitPane3.setDividerSize(5);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                
                this.v.jComboBoxProductoCategoria.setModel(this.facade.getComboBoxModelCategory());
                
                break;
            case mitem_nuevoMaterial:
                
                Position.setPosition(Position.POSITION.MATERIAL.toString());
                cm.refreshTable(Position.getPosition());
                
                cm.ponerEsaTablaToGuapaYReshulona();
                
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(350);
                this.v.SplitPane3.setDividerSize(5);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case mitem_nuevoCliente:
                Position.setPosition(Position.POSITION.CLIENTE.toString());
                cm.refreshTable(Position.getPosition());
                
                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(200);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case mitem_nuevoEmpleado:
                Position.setPosition(Position.POSITION.EMPLEADO.toString());
                cm.refreshTable(Position.getPosition());
                
                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(200);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);
                break;
            case mitem_nuevoCarrito:
                Position.setPosition(Position.POSITION.CARRITO.toString());
                cm.refreshTable(Position.getPosition());
                
                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane1.setDividerLocation(200);
                this.v.pnl_listaCategorias.setVisible(false);

                break;

            //FIN de Nuevo ...-----------------------------------------------------------------------------------------------
            //Inicio de Logout-----------------------------------------------------------------------------------------------
            case mitem_logout:
                    new Controller_Login(new Main()).initViews();
                    this.v.setVisible(false);
                break;
            //FIN de Logout-----------------------------------------------------------------------------------------------
            case mitem_configCrew:
                this.v.jFrame_confiCrew.setVisible(true);
                this.v.jFrame_confiCrew.setSize(528, 390);
                this.v.jFrame_confiCrew.setLocationRelativeTo(null);
                break;
            case btn_cancelarConfiCrew:
                this.v.jFrame_confiCrew.setVisible(false);
                break;
            case btn_modificarConfiCrew:
                
                break;
        }
    }
  public void enlace (String enlaceAAceder) throws URISyntaxException{
        Desktop enlace=Desktop.getDesktop();
        try {
                enlace.browse(new URI(enlaceAAceder));
        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }
}
