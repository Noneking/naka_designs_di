/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Hibernate.Configuration.NewHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

/**
 *
 * @author nonek
 */
public class Connection {
    
    Session s;
    Transaction tx;
    
    public Connection() {
        try {
            this.s=NewHibernateUtil.getSessionFactory().openSession();
            System.err.println("Session opened.");
        } catch(SessionException e) {
            System.err.println("Error opening session..");
            this.s=NewHibernateUtil.getSessionFactory().getCurrentSession();
            System.err.println("Obtained current session.");
        }
    }
    
    int contSessionError=0;
    public Session getSession() {
        if(!this.s.isOpen()){
            this.s=NewHibernateUtil.getSessionFactory().openSession();
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
        return this.s;
    }
    
    public void openSession(){
        try {
            this.s=NewHibernateUtil.getSessionFactory().openSession();
            System.err.println("Session opened.");
        } catch(SessionException e) {
            System.err.println("Error opening session..");
            this.s=NewHibernateUtil.getSessionFactory().getCurrentSession();
            System.err.println("Obtained current session.");
        }
    }
    
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
    
    public void closeSession(){
        try {
            this.s.close();
            System.err.println("Session closed.");
        } catch(SessionException e) {
            System.err.println("Error closing session..");
        }
    }
    
    public Transaction getTransaction(){
//        if(!this.tx.isActive()){this.tx=getSession().beginTransaction();}
//        return this.tx;
//        return this.tx=getSession().beginTransaction();
//        if(!this.tx.isActive()){
//            this.tx=this.s.beginTransaction();
//        }
//        if(this.tx==null){
//            this.tx=this.s.beginTransaction();
//        }
        this.tx=getSession().beginTransaction();
        return this.tx;
    }
    
}
