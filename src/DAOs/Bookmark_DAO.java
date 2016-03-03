/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Crew;
import Model.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nonek
 */
public class Bookmark_DAO extends Connection implements Bookmark_IDAO{

    @Override /**Obtiene un objeto de tipo Bookmark según su campo cod(CLAVE PRIMARIA)*/
    public Bookmark getBookmarkByCod(int cod) {
        return (Bookmark) getSession().get(Bookmark.class, cod);
    }

    @Override /**Obtiene un objeto de tipo Bookmark según su campo description*/
    public Bookmark getBookmarkByDescription(String description) {
        Criteria c=getSession().createCriteria(Bookmark.class);
        return (Bookmark) c.add(Restrictions.like("description", description)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Bookmark según una variable que referencia varios campos(String)*/
    public ArrayList<Bookmark> getBookmarksByQuery(String question) {
        Query query=getSession().createQuery("from Bookmark b where b.description like :query OR b.date like :query OR b.crew like :query");
        ArrayList<Bookmark> list=(ArrayList<Bookmark>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Bookmark(todos los existentes)*/
    public ArrayList<Bookmark> getBookmarks() {
        return (ArrayList<Bookmark>) getSession().createQuery("from Bookmark").list();
    }

    @Override /**Inserta un objeto de tipo Bookmark en la BD*/
    public void insertBookmark(String description, String date, String crew) {
        Bookmark b=new Bookmark(new Crew_DAO().getCrewByEmail(crew), description, date);
        getSession().save(b);
        getTransaction().commit();
        System.err.println("Bookmark inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Bookmark en la BD*/
    public void modifyBookmark(int cod, String description, String date, Crew crew) {
        Bookmark b=getBookmarkByCod(cod);
        b.setDescription(description);
        b.setDate(date);
        b.setCrew(crew);
        getSession().update(b);
        getTransaction().commit();
        System.err.println("Bookmark modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Bookmark de la BD según su cod(int)*/
    public void deleteBookmark(int cod) {
        Bookmark b=getBookmarkByCod(cod);
        getSession().delete(b);
        getTransaction().commit();
        System.err.println("Bookmark deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Bookmark de la BD según una colección de tipos del mismo*/
    public void deleteBookmarks(ArrayList<Bookmark> bookmarks) {
        Iterator it=bookmarks.iterator();
        while(it.hasNext()){
            Bookmark b=(Bookmark) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Bookmarks deleted succesfully.");
    }

    @Override /**Borra todos los registros de Bookmark*/
    public void deleteBookmarks() {
        Iterator it=getBookmarks().iterator();
        while(it.hasNext()){
            Bookmark b=(Bookmark) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Bookmarks deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Bookmark*/
    public DefaultTableModel getTableModelBookmark() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String bookmark[]={"COD","DESCRIPTION","DATE","CREW"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(bookmark)));
        it=getBookmarks().iterator();
        while(it.hasNext()){
            row=new Vector();
            Bookmark b=(Bookmark) it.next();
            row.add(b.getCod());
            row.add(b.getDescription());
            row.add(b.getDate());
            row.add(b.getCrew().getNickname());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
