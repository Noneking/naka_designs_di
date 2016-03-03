/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Product;
import Hibernate.POJOs.ProductRecord;
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
public class ProductRecord_DAO extends Connection implements ProductRecord_IDAO{

    @Override /**Obtiene un objeto de tipo ProductRecord según su campo cod(CLAVE PRIMARIA)*/
    public ProductRecord getProductRecordByCod(int cod) {
        return (ProductRecord) getSession().get(ProductRecord.class, cod);
    }

    @Override /**Obtiene una colección de objetos de tipo ProductRecord según una variable que referencia varios campos(int)*/
    public ArrayList<ProductRecord> getProductsRecordsByQuery(int question) {
        Query query=getSession().createQuery("from ProductRecord p where p.cod like :query OR p.amount like :query OR p.record like :query OR p.product like :query");
        ArrayList<ProductRecord> list=(ArrayList<ProductRecord>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo ProductRecord(todos los existentes)*/
    public ArrayList<ProductRecord> getProductsRecords() {
        return (ArrayList<ProductRecord>) getSession().createQuery("from ProductRecord").list();
    }

    @Override /**Inserta un objeto de tipo ProductRecord en la BD*/
    public void insertProductRecord(int amount, int record, int product) {
        ProductRecord pr=new ProductRecord(new Product_DAO().getProductByCod(product), new Record_DAO().getRecordByCod(record), amount);
        getSession().save(pr);
        getTransaction().commit();
        System.err.println("Products inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo ProductRecord en la BD*/
    public void modifyProductRecord(int cod, int amount, Record record, Product product) {
        ProductRecord pr=getProductRecordByCod(cod);
        pr.setAmount(amount);
        pr.setRecord(record);
        pr.setProduct(product);
        getSession().update(pr);
        getTransaction().commit();
        System.err.println("Products modified succesfully.");
    }

    @Override /**Borra un objeto de tipo ProductRecord de la BD según su cod(int)*/
    public void deleteProductRecord(int cod) {
        ProductRecord pr=getProductRecordByCod(cod);
        getSession().delete(pr);
        getTransaction().commit();
        System.err.println("Products deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo ProductRecord de la BD según una colección de tipos del mismo*/
    public void deleteProductRecord(ArrayList<ProductRecord> product_record) {
        Iterator it=product_record.iterator();
        while(it.hasNext()){
            ProductRecord pr=(ProductRecord) it.next();
            getSession().delete(pr);
        }
        getTransaction().commit();
        System.err.println("Productss deleted succesfully.");
    }

    @Override /**Borra todos los registros de ProductRecord*/
    public void deleteProductsRecords() {
        Iterator it=getProductsRecords().iterator();
        while(it.hasNext()){
            ProductRecord pr=(ProductRecord) it.next();
            getSession().delete(pr);
        }
        getTransaction().commit();
        System.err.println("Productss deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de ProductRecord*/
    public DefaultTableModel getTableModelProductRecord() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String product_record[]={"COD","AMOUNT","RECORD","PRODUCT"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product_record)));
        it=getProductsRecords().iterator();
        while(it.hasNext()){
            row=new Vector();
            ProductRecord pr=(ProductRecord) it.next();
            row.add(pr.getCod());
            row.add(pr.getAmount());
            row.add(pr.getRecord().getCod());
            row.add(pr.getProduct().getName());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
