/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Hibernate.Configuration.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

/**
 * @author Alejandro Noriega Vega
 */

/**
 * Esta clase realiza todas las operaciones relacionadas con la conexión con la base de datos (MySQL + Hibernate)
 */

public class Connection {
    
    static Session s;
    static Transaction tx;
    
    
    /**
     * Abre una nueva conexión.
     * En caso de dar error conecta usando la conexión ya existente.
     */
    public Connection() {
        try {
            this.s=NewHibernateUtil.getSessionFactory().openSession();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la sesion con la base de datos, comprue que esta el servidor operativo");
            
            System.out.println("Error opening session..");
            this.s=NewHibernateUtil.getSessionFactory().getCurrentSession();
            System.out.println("Obtained current session.");
        }
    }
    
    /**
     * Optiene una sesión.
     * Si hay una abierta devuelve esa misma, sino crea una nueva y la devuelve.
     */
//    int contSessionError=0;
    public static Session getSession() {
        if(!Connection.s.isOpen()){
            Connection.s=NewHibernateUtil.getSessionFactory().openSession();
        }
//        try {
//            this.s=NewHibernateUtil.getSessionFactory().openSession();
////            this.s=NewHibernateUtil.getSessionFactory().getCurrentSession();
//            System.err.println("Obtained current session.");
//        } catch(SessionException e) {
//            System.err.println("Error obtaining current session..");
//            while(contSessionError<3){
//                contSessionError++;
//                openSession();
//                getSession();
//            }
//        }
        return Connection.s;
    }
    
    /**
     * Abre una nueva sesión.
     * En caso de error obtiene la sesión ya existente.
     */
    public static void openSession(){
        try {
            Connection.s=NewHibernateUtil.getSessionFactory().openSession();
            System.err.println("Session opened.");
        } catch(SessionException e) {
            System.err.println("Error opening session..");
            Connection.s=NewHibernateUtil.getSessionFactory().getCurrentSession();
            System.err.println("Obtained current session.");
        }
    }
    
    /**
     * Limpia la sesión
     */
    public void clearAndFlushSession()
    {
        try {
            this.s.flush();
            System.err.println("Session flushed.");
            this.s.clear();
            System.err.println("Session cleared.");
        } catch(SessionException e) {
            System.err.println("Error flushing or clearing session..");
        }
    }
    
    /**
     * Cierra la sesión
     */
    public static void closeSession(){
        try {
            Connection.s.close();
            System.err.println("Session closed.");
        } catch(SessionException e) {
            System.err.println("Error closing session..");
        }
    }
    
    /**
     * Inicializa el objeto Transaction y lo devuelve
     */
    public static Transaction getTransaction(){
//        if(!this.tx.isActive()){this.tx=getSession().beginTransaction();}
//        return this.tx;
//        return this.tx=getSession().beginTransaction();
//        if(!this.tx.isActive()){
//            this.tx=this.s.beginTransaction();
//        }
//        if(this.tx==null){
//            this.tx=this.s.beginTransaction();
//        }
        Connection.tx=getSession().beginTransaction();
        return Connection.tx;
    }
    
}
