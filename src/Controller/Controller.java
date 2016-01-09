/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
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
public class Controller extends JPanel {
    
    Main v;
    
    public Controller(Main v)
    {
        this.v=v;
        initViews();
    }
    
    public void initViews()
    {
        this.v.jFrameLoggin.setVisible(true);
    }
    
   
    
    public void initOperations()
    {
        
    }
    
    
    
    public void last()
    {
        JLabel label=new JLabel();
        label.setSize(this.v.jPanelMain.getHeight(), this.v.jPanelMain.getWidth());
        ImageIcon fot = new ImageIcon("src/IMG/naka_art_background.png");
        Icon icon=new ImageIcon(fot.getImage().getScaledInstance(this.v.jPanelMain.getWidth(), this.v.jPanelMain.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.setVisible(true);
        
        this.v.jPanelMain.add(label);
    }
    
    
    
    public void panelSetSizeBy(JPanel panelPadre, JPanel panelHijo)
    {
        Dimension d=panelPadre.getSize();
        panelHijo.setSize(d);
    }
    
     public void setImageBackground(JPanel panel, String filePath)
    {
        super.paintComponent(panel.getGraphics());
        Image background = Toolkit.getDefaultToolkit().createImage(filePath);
        panel.getGraphics().drawImage(background, 0, 0, null);
    }
}
