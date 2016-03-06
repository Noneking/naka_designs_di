/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LectorTema;
import View.Main;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author nonek
 */
public class RUN {

    public static void main(String args[]) {
        Main v = null;
        try {
            UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
            
            UIManager.setLookAndFeel(LectorTema.getPropiedad("NOMBRE"));
            SwingUtilities.updateComponentTreeUI(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Runtime aplicacion = Runtime.getRuntime();
        try {
            aplicacion.exec("C:\\xampp\\xampp_start.exe");
            System.out.println("Iniciado Xampp");
        } catch (Exception ex) {
            
            
        }
        
         new Controller_Login(new Main()).initViews();
    }
}
