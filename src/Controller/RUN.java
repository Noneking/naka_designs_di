/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import javax.swing.UIManager;

/**
 *
 * @author nonek
 */
public class RUN {

    public static void main(String args[]) {
        

        try {
             
            UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
            
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");
//            SwingUtilities.updateComponentTreeUI(v);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         new Controller_Login(new Main()).initViews();
    }
}
