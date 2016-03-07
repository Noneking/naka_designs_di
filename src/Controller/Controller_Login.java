/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Facade.Facade;
import Hibernate.POJOs.Crew;
import View.Main;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author MrDrulix
 */
public class Controller_Login implements ActionListener, MouseListener {

    Main v;
    Facade facade;

    String position;
    String text;
    
    String rol;

    public Controller_Login(Main v) {
        this.v = v;
        this.facade = new Facade();
        //conectarXampp();
        
    }

    public enum POSITION {

        USER,
        PASSWORD
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {

        if (e.getComponent() == v.eti_olvidarContraseña) {
            JOptionPane.showMessageDialog(null, "Hola :)");
        }
        if (e.getComponent() == v.txt_login_user) {
            position = POSITION.USER.toString();
        }
        if (e.getComponent() == v.Ptxt_login_password) {
            position = POSITION.PASSWORD.toString();
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
    }

    public enum Actions {

        btn_Login,
        btn_X,
        btn_enter;

    }

    public void initViews() {

        this.v.jFrameLoggin.setSize(361, 356);
        this.v.jFrameLoggin.setLocationRelativeTo(null);
        this.v.jFrameLoggin.setVisible(true);

        this.v.btn_Login.setActionCommand("btn_Login");
        this.v.btn_Login.addActionListener(this);

        this.v.txt_login_user.setActionCommand("btn_enter");
        this.v.txt_login_user.addActionListener(this);
        this.v.Ptxt_login_password.setActionCommand("btn_enter");
        this.v.Ptxt_login_password.addActionListener(this);

        this.v.eti_olvidarContraseña.addMouseListener(this);
        this.v.txt_login_user.addMouseListener(this);
        this.v.Ptxt_login_password.addMouseListener(this);

        this.v.jFrameLoggin.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/IMG/naka_designs_sevilla_logo.png")));

        this.v.jFrameLoggin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.v.jLabelLogginErrorMessage.setForeground(Color.BLUE);
        this.v.jLabelLogginErrorMessage.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (Actions.valueOf(e.getActionCommand())) {
            case btn_Login:
                tryLoggin();
                break;
            case btn_enter:
                tryLoggin();
                break;
        }

    }

    public void tryLoggin() {
        this.v.jLabelLogginErrorMessage.setForeground(Color.BLUE);
        
        Crew crewByNickname = facade.getCrewByNickname(this.v.txt_login_user.getText());
        Crew crewByEmail = facade.getCrewByEmail(this.v.txt_login_user.getText());

//                (facade.getCrewByNickname(this.v.txt_login_user.getText())!=null || facade.getCrewByEmail(this.v.txt_login_user.getText())!=null)
        if (crewByNickname != null || crewByEmail != null) {
            if (crewByEmail == null) {
                String passString = new String(this.v.Ptxt_login_password.getPassword());
                if (crewByNickname.getPassword().equals(passString)) {
                    text = "Loggin";
                    this.v.jLabelLogginErrorMessage.setForeground(Color.GREEN);
                    this.v.jLabelLogginErrorMessage.setText(text);

                    rol = ""+crewByNickname.getRole().toString();

                    logginOperations(crewByNickname);
                } else {
                    this.v.jLabelLogginErrorMessage.setForeground(Color.RED);
                    this.v.jLabelLogginErrorMessage.setText("Usuario o contraseña incorrectos");
                }
            } else if (crewByNickname == null) {
                String passString = new String(this.v.Ptxt_login_password.getPassword());
                if (crewByEmail.getPassword().equals(passString)) {
                    logginOperations(crewByEmail);
                } else {
                    this.v.jLabelLogginErrorMessage.setForeground(Color.RED);
                    this.v.jLabelLogginErrorMessage.setText("Usuario o contraseña incorrectos");
                }
            }
        } else {
            this.v.jLabelLogginErrorMessage.setForeground(Color.RED);
            this.v.jLabelLogginErrorMessage.setText("Usuario o contraseña incorrectos");
        }

//                    String user = ""+this.v.txt_login_user.getText();
//                    if(user.equals("admin")){
//                            this.v.jFrameLoggin.setVisible(false);
//                                new Controller_Main(new Main()).initViews();
//                    }
    }

    public void logginOperations(Crew crew_logged) {

        this.v.jFrameLoggin.setVisible(false);
        this.v.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Model.Connection.closeSession();
            }
        });

        new Controller_Main(new Main(), crew_logged, this.facade,rol).initViews();
    }

    public void simulate(String text) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                v.jLabelLogginErrorMessage.setText(text);
//                v.repaint();
                v.invalidate();
            }
        });
    }

    public void conectarXampp() {
        Runtime aplicacion = Runtime.getRuntime();
        try {
            aplicacion.exec("C:\\xampp\\xampp_start.exe");
            System.out.println("Iniciado Xampp");
        } catch (Exception ex) {
            conectarXampp();
            JOptionPane.showMessageDialog(null, "No ha sido posible la sesion con la base de datos, comprue que esta el servidor operativo");
            
        }
    }
}
