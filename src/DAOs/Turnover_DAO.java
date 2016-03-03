/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.ProductRecord;
import Hibernate.POJOs.Turnover;
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
public class Turnover_DAO extends Connection implements Turnover_IDAO{

    @Override /**Obtiene un objeto de tipo Turnover según su campo cod(CLAVE PRIMARIA)*/
    public Turnover getTurnoverByCod(int cod) {
        return (Turnover) getSession().get(Turnover.class, cod);
    }

    @Override /**Obtiene un objeto de tipo Category según su campo nickname(CLAVE ÚNICA)*/
    public Turnover getTurnoverByNickname(int product_record) {
        Criteria c=getSession().createCriteria(Turnover.class);
        return (Turnover) c.add(Restrictions.like("product_record", product_record)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Turnover según una variable que referencia varios campos(int)*/
    public ArrayList<Turnover> getTurnoversByQuery(int question) {
        Query query=getSession().createQuery("from Turnover t where t.cod like :query OR t.amount like :query OR t.product_record like :query");
        ArrayList<Turnover> list=(ArrayList<Turnover>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Turnover(todos los existentes)*/
    public ArrayList<Turnover> getTurnovers() {
        return (ArrayList<Turnover>) getSession().createQuery("from Turnover").list();
    }

    @Override /**Inserta un objeto de tipo Turnover en la BD*/
    public void insertTurnover(int amount, double price, int product_record) {
        Turnover t=new Turnover(new ProductRecord_DAO().getProductRecordByCod(product_record), amount, price);
        getSession().save(t);
        getTransaction().commit();
        System.err.println("Turnover inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Turnover en la BD*/
    public void modifyTurnover(int cod, int amount, double price, ProductRecord product_record) {
        Turnover t=getTurnoverByCod(cod);
        t.setAmount(amount);
        t.setPrice(price);
        t.setProductRecord(product_record);
        getSession().update(t);
        getTransaction().commit();
        System.err.println("Turnover modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Turnover de la BD según su cod(int)*/
    public void deleteTurnover(int cod) {
        Turnover t=getTurnoverByCod(cod);
        getSession().delete(t);
        getTransaction().commit();
        System.err.println("Turnover deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Turnover de la BD según una colección de tipos del mismo*/
    public void deleteTurnovers(ArrayList<Turnover> turnover) {
        Iterator it=turnover.iterator();
        while(it.hasNext()){
            Turnover t=(Turnover) it.next();
            getSession().delete(t);
        }
        getTransaction().commit();
        System.err.println("Turnovers delete succesfully.");
    }

    @Override /**Borra todos los registros de Turnover*/
    public void deleteTurnovers() {
        Iterator it=getTurnovers().iterator();
        while(it.hasNext()){
            Turnover t=(Turnover) it.next();
            getSession().delete(t);
        }
        getTransaction().commit();
        System.err.println("Turnovers deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Turnover*/
    public DefaultTableModel getTableModelTurnover() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String turnover[]={"COD","AMOUNT","PRICE","PRODUCT_RECORD"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(turnover)));
        it=getTurnovers().iterator();
        while(it.hasNext()){
            row=new Vector();
            Turnover t=(Turnover) it.next();
            row.add(t.getCod());
            row.add(t.getAmount());
            row.add(t.getPrice());
            row.add(t.getProductRecord().getCod());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
