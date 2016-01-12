/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 *
 * @author nonek
 */
public class Controller_Main implements ActionListener {
    
    Main v;
    
    public Controller_Main(Main v){
        this.v=v;
    }
    
    public enum Actions{
        btn_categorias;
    }
    
    public void initViews(){
        this.v.jSplitPane2.setDividerLocation(0);
        this.v.jSplitPane2.setDividerSize(0);
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
        
        //JTableMain
        
    }
    
    public void initListeners(){
        this.v.jButtonCategorias.setActionCommand("btn_categorias");
        this.v.jButtonCategorias.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(Actions.valueOf(e.getActionCommand())){
            case btn_categorias:
                this.v.jSplitPane2.setDividerLocation(300);
                this.v.jSplitPane2.setDividerSize(5);

                this.v.jPanelOptions.setLayout(new BorderLayout());
                this.v.jPanelOptions.add(this.v.jPanelCategorias, BorderLayout.CENTER);
                this.v.jPanelOptions.setVisible(false);
                this.v.jPanelOptions.setVisible(true);
                break;
            
        }
        
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
    public void panelSetSizeBy(JPanel panelPadre, JPanel panelHijo)
    {
        Dimension d=panelPadre.getSize();
        panelHijo.setSize(d);
    }

    
}
