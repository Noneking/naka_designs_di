/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Record;
import Model.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;

/**
 *
 * @author nonek
 */
public class Record_DAO extends Connection implements Record_IDAO{

    @Override /**Obtiene un objeto de tipo Record según su campo cod(CLAVE PRIMARIA)*/
    public Record getRecordByCod(int cod) {
        return (Record) getSession().get(Record.class, cod);
    }

    @Override /**Obtiene una colección de objetos de tipo Record según una variable que referencia varios campos(String)*/
    public ArrayList<Record> getRecordsByQuery(String question) {
        Query query=getSession().createQuery("from Record r where r.date like :query");
        ArrayList<Record> list=(ArrayList<Record>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Record(todos los existentes)*/
    public ArrayList<Record> getRecords() {
        return (ArrayList<Record>) getSession().createQuery("from Record").list();
    }

    @Override /**Inserta un objeto de tipo Record en la BD*/
    public void insertRecord(String date) {
        Record r=new Record(date);
        getSession().save(r);
        getTransaction().commit();
        System.err.println("Record inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Record en la BD*/
    public void modifyRecord(int cod, String date) {
        Record r=getRecordByCod(cod);
        r.setDate(date);
        getSession().update(r);
        getTransaction().commit();
        System.err.println("Record modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Record de la BD según su cod(int)*/
    public void deleteRecord(int cod) {
        Record r=getRecordByCod(cod);
        getSession().delete(r);
        getTransaction().commit();
        System.err.println("Record deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Record de la BD según una colección de tipos del mismo*/
    public void deleteRecords(ArrayList<Record> records) {
        Iterator it=records.iterator();
        while(it.hasNext()){
            Record r=(Record) it.next();
            getSession().delete(r);
        }
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }

    @Override /**Borra todos los registros de Record*/
    public void deleteRecords() {
        Iterator it=getRecords().iterator();
        while(it.hasNext()){
            Record r=(Record) it.next();
            getSession().delete(r);
        }
        getTransaction().commit();
        System.err.println("Records deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Record*/
    public DefaultTableModel getTableModelRecord() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String record[]={"COD","DATE"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(record)));
        it=getRecords().iterator();
        while(it.hasNext()){
            row=new Vector();
            Record r=(Record) it.next();
            row.add(r.getCod());
            row.add(r.getDate());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
