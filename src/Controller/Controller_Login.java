/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MrDrulix
 */
public class Controller_Login implements ActionListener {
    
    Main v;
    
    public Controller_Login(Main v)
    {
        this.v=v;
    }
    public enum Actions{
        btn_Login,
        btn_X;
        
    }
    public void initViews()
    {

        this.v.jFrameLoggin.setSize(361, 360);
        this.v.jFrameLoggin.setLocationRelativeTo(null);
        this.v.jFrameLoggin.setVisible(true);
        
        
        this.v.btn_Login.setActionCommand("btn_Login");
        this.v.btn_Login.addActionListener(this);
//        this.v.btn_X.setActionCommand("btn_X");
//        this.v.btn_X.addActionListener(this);
        
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
                this.v.jFrameLoggin.setVisible(false);
                new Controller_Main(new Main()).initViews();
                break;
            case btn_X:
                    System.exit(0);
                break;
                
        }
        
    }
} 

