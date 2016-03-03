/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Record;
import Hibernate.POJOs.RecordUser;
import Hibernate.POJOs.User;
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
public class RecordUser_DAO extends Connection implements RecordUser_IDAO{

    @Override /**Obtiene un objeto de tipo RecordUser según su campo cod(CLAVE PRIMARIA)*/
    public RecordUser getRecordUserByCod(int cod) {
        return (RecordUser) getSession().get(RecordUser.class, cod);
    }

    @Override /**Obtiene una colección de objetos de tipo RecordUser según un usuario(User)*/
    public ArrayList<RecordUser> getRecordUserByUser(int user) {
        Criteria c=getSession().createCriteria(RecordUser.class);
        return (ArrayList<RecordUser>) c.add(Restrictions.like("user", user)).list();
    }

    @Override /**Obtiene una colección de objetos de tipo RecordUser según un record(Record)*/
    public ArrayList<RecordUser> getRecordUserByRecord(int record) {
        Criteria c=getSession().createCriteria(RecordUser.class);
        return (ArrayList<RecordUser>) c.add(Restrictions.like("record", record)).list();
    }

    @Override /**Obtiene una colección de objetos de tipo RecordUser según una variable que referencia varios campos(int)*/
    public ArrayList<RecordUser> getRecordsUsersByQuery(int question) {
        Query query=getSession().createQuery("from RecordUser r where r.cod like :query OR r.user like :query OR r.record like :query");
        ArrayList<RecordUser> list=(ArrayList<RecordUser>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo RecordUser (todos los existentes)*/
    public ArrayList<RecordUser> getRecordsUsers() {
        return (ArrayList<RecordUser>) getSession().createQuery("from RecordUser").list();
    }

    @Override /**Inserta un objeto de tipo RecordUser en la BD*/
    public void insertRecordUser(int user, int record) {
        RecordUser ru=new RecordUser(new Record_DAO().getRecordByCod(record), new User_DAO().getUserByCod(user));
        getSession().save(ru);
        getTransaction().commit();
        System.err.println("Records inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo RecordUser en la BD*/
    public void modifyRecordUser(int cod, User user, Record record) {
        RecordUser ru=getRecordUserByCod(cod);
        ru.setUser(user);
        ru.setRecord(record);
        getSession().update(ru);
        getTransaction().commit();
        System.err.println("Records modified succesfully.");
    }

    @Override /**Borra un objeto de tipo RecordUser de la BD según su cod(int)*/
    public void deleteRecordUser(int cod) {
        RecordUser ru=getRecordUserByCod(cod);
        getSession().delete(ru);
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo RecordUser de la BD según una colección de tipos del mismo*/
    public void deleteRecordsUsers(ArrayList<RecordUser> records_users) {
        Iterator it=records_users.iterator();
        while(it.hasNext()){
            RecordUser ru=(RecordUser) it.next();
            getSession().delete(ru);
        }
        getTransaction().commit();
        System.err.println("Recordss deleted succesfully.");
    }

    @Override /**Borra todos los registros de RecordUser*/
    public void deleteRecordsUsers() {
        Iterator it=getRecordsUsers().iterator();
        while(it.hasNext()){
            RecordUser ru=(RecordUser) it.next();
            getSession().delete(ru);
        }
        getTransaction().commit();
        System.err.println("Recordss deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de RecordUser*/
    public DefaultTableModel getTableModelRecordUser() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String record_user[]={"COD","USER","RECORD"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(record_user)));
        it=getRecordsUsers().iterator();
        while(it.hasNext()){
            row=new Vector();
            RecordUser ru=(RecordUser) it.next();
            row.add(ru.getCod());
            row.add(ru.getUser().getNickname());
            row.add(ru.getRecord().getCod());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
