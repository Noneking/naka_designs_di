/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Menu;

import Controller.Controller_Main;
import Model.HiloProgreso;
import Model.LectorTema;
import Model.Model;
import View.Main;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    //cadenas estaticas de las rutas de los lookandfeels
  static String ALUOXIDE ="de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel";
  static String BLACKEYE ="de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel";
  static String BLACKSTART="de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel";
  static String CLASSY="de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel";
  private String position = "";

    public void initControllerMenuListeners(Main v) {
        this.v = v;
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
        //guardado en SQlite
        this.v.mitem_guardarBD.setActionCommand("mitem_guardarBD");
        this.v.mitem_guardarBD.addActionListener(this);
            this.v.btn_comenzarGuardarBD.setActionCommand("btn_comenzarGuardadarBD");
            this.v.btn_comenzarGuardarBD.addActionListener(this);
            
        //Crear Nuevo...
            this.v.mitem_nuevoMaterial.setActionCommand("mitem_nuevoMaterial");
            this.v.mitem_nuevoMaterial.addActionListener(this);
            this.v.mitem_nuevoCliente.setActionCommand("mitem_nuevoCliente");
            this.v.mitem_nuevoCliente.addActionListener(this);
            this.v.mitem_nuevoEmpleado.setActionCommand("mitem_nuevoEmpleado");
            this.v.mitem_nuevoEmpleado.addActionListener(this);
            this.v.mitem_nuevoCarrito.setActionCommand("mitem_nuevoCarrito");
            this.v.mitem_nuevoCarrito.addActionListener(this);
            cm = new Controller_Main(this.v);
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
                break;
            //mas infromacion sobre la empresa, la pagina web, por ahora en mantenimiento
            case mitem_masInfo: {
                try {
                    model.enlace("http://www.nakadesignsevilla.com/");
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Controller_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            // guardado en SQLite de las tablas de SQL
            case mitem_guardarBD:
                if (JOptionPane.showConfirmDialog(null, "Desea volcar la base de datos en un archivo '.sql'??") == 0) {
                    this.v.Frame_guardandoBD.setVisible(true);
                    this.v.Frame_guardandoBD.setLocationRelativeTo(null);
                    this.v.Frame_guardandoBD.setSize(300, 300);

                }
                break;
            //boton de guardado
            case btn_comenzarGuardadarBD:
                HiloProgreso hilo = new HiloProgreso(this.v.pbar_guardandoBD);
                hilo.run();
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
            case mitem_nuevoMaterial:
                
                position = Controller_Main.POSITION.MATERIAL.toString();
                cm.refreshTable(position);

                cm.ponerEsaTablaToGuapaYReshulona();
                
                this.v.pnl_split3_inserts.removeAll();
                this.v.pnl_split3_inserts.add(this.v.pnl_Materiales, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);

                this.v.SplitPane3.setDividerLocation(350);
                this.v.SplitPane3.setDividerSize(5);
                
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                
                break;
            case mitem_nuevoCliente:
                position = Controller_Main.POSITION.CLIENTE.toString();
                cm.refreshTable(position);

                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(200);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Clientes, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                
                break;
            case mitem_nuevoEmpleado:
                position = Controller_Main.POSITION.EMPLEADO.toString();
                cm.refreshTable(position);

                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(200);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Empleado, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                
                break;
            case mitem_nuevoCarrito:
                position = Controller_Main.POSITION.CARRITO.toString();
                cm.refreshTable(position);

                cm.ponerEsaTablaToGuapaYReshulona();
                this.v.pnl_split3_inserts.removeAll();
                this.v.SplitPane3.setDividerLocation(300);
                this.v.SplitPane3.setDividerSize(5);

                this.v.pnl_split3_inserts.add(this.v.pnl_Carrito, BorderLayout.CENTER);
                this.v.pnl_split3_inserts.setVisible(false);
                this.v.pnl_split3_inserts.setVisible(true);
                this.v.SplitPane2.setDividerLocation(0);
                this.v.SplitPane2.setDividerSize(0);
                
                break;
                
            //FIN de Nuevo ...-----------------------------------------------------------------------------------------------
        }
    }
 
}
