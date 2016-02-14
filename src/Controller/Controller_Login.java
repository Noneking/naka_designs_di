/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author MrDrulix
 */
public class Controller_Login implements ActionListener, MouseListener {
    
    Main v;
    
    public Controller_Login(Main v)
    {
        this.v=v;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
         
        if(e.getComponent() == v.eti_olvidarContraseña){
            JOptionPane.showMessageDialog(null, "Hola :)");
        }
        
    
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {}

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {}
    public enum Actions{
        btn_Login,
        btn_X;
        
    }
    public void initViews()
    {
        
        this.v.jFrameLoggin.setSize(361, 356);
        this.v.jFrameLoggin.setLocationRelativeTo(null);
        this.v.jFrameLoggin.setVisible(true);
        
        
        this.v.btn_Login.setActionCommand("btn_Login");
        this.v.btn_Login.addActionListener(this);
        
        this.v.eti_olvidarContraseña.addMouseListener(this);
        
        
        this.v.jFrameLoggin.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/IMG/naka_designs_sevilla_logo.png")));
        
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(Actions.valueOf(e.getActionCommand())){
            case btn_Login:
                
//                    String user = ""+this.v.txt_login_user.getText();
//                    if(user.equals("admin")){
//                            this.v.jFrameLoggin.setVisible(false);
//                                new Controller_Main(new Main()).initViews();
//                    }
                Runtime aplicacion = Runtime.getRuntime();
                try {
                    aplicacion.exec("C:\\xampp\\xampp_start.exe");
                    System.out.println("Iniciado Xampp");
                } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "No ha sido posible la sesion con la base de datos, comprue que esta el servidor operativo");
                }
                
                this.v.jFrameLoggin.setVisible(false);
                new Controller_Main(new Main()).initViews();
                break;
    
        }
        
    }
} 

