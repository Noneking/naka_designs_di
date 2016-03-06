/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Facade.Facade;
import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Crew;
import Hibernate.POJOs.Product;
import Hibernate.POJOs.Record;
import Hibernate.POJOs.User;
import static Model.Connection.getSession;
import java.util.ArrayList;
import org.hibernate.Query;

/**
 *
 * @author MrDrulix
 */
public class Model_Movimientos extends Connection {
    
    public Model_Movimientos(){
            super();
    }
    
  //Inicio de Records---------------------------------------------------------------------------------------------------------  
    public int getRecordEnero() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/01/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordFebrero() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/02/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordMarzo() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/03/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordAbril() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/04/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordMayo() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/05/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordJunio() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/06/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordJulio() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/07/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordAgosto() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/08/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordSeptiembre() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/09/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordOctubre() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/10/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordNoviembre() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/11/%'");

        return ((Number) query.uniqueResult()).intValue();
    }

    public int getRecordDiciembre() {
        openSession();
        Query query = getSession().createQuery("select count(*) from Record where date like '%/12/%'");

        return ((Number) query.uniqueResult()).intValue();
    }
//FIN de Records---------------------------------------------------------------------------------------------------------    
//Inicio de Crew---------------------------------------------------------------------------------------------------------    

    public ArrayList<Crew> getCrews() {
        openSession();
        return (ArrayList<Crew>) getSession().createQuery("from Crew").list();
    }

    public int getConexionesCount(String question) {
        openSession();

        Query query = getSession().createQuery("select count(*) from Bookmark where crew like '" + question + "'");

        return ((Number) query.uniqueResult()).intValue();
    }
//FIN de Crew---------------------------------------------------------------------------------------------------------    
//Inicio de Products---------------------------------------------------------------------------------------------------------    
        
    public ArrayList<Product> getProducts() {
        openSession();
        return (ArrayList<Product>) getSession().createQuery("from Product").list();
    }

    public int getProductCount(String question) {
        openSession();

        Query query = getSession().createQuery("select count(*) from ProductRecord where cod =(select cod from Product where name ='"+question+"')");

        return ((Number) query.uniqueResult()).intValue();
    }
//FIN de Products---------------------------------------------------------------------------------------------------------            
    public ArrayList<User> getUserss() {
        openSession();
        return (ArrayList<User>) getSession().createQuery("from User").list();
    }
    public ArrayList<Bookmark> getBookmark() {
        openSession();
        return (ArrayList<Bookmark>) getSession().createQuery("from Bookmark").list();
    }
}
