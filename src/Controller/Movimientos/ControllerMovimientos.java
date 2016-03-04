/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import Controller.Controller_Main;
import View.Main;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.View;

/**
 *
 * @author MrDrulix
 */
public class ControllerMovimientos extends EnumMovimientos implements ActionListener {
    
    Main v;
    
    public void initMovimientosListeners(Main v){
        this.v = v;
        this.v.btn_home.setActionCommand("btn_home");
        this.v.btn_home.addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Actions.valueOf(e.getActionCommand())) {
             case btn_home:
                this.v.pnl_Main.removeAll();
                this.v.pnl_Main.add(this.v.SplitPane1,BorderLayout.CENTER);
                this.v.pnl_Main.setVisible(false);
                this.v.pnl_Main.setVisible(true);                
                break;
        }
    }
    
}
