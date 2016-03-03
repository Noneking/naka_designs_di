/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Product;
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
public class Product_DAO extends Connection implements Product_IDAO{

    @Override /**Obtiene un objeto de tipo Product según su campo cod(CLAVE PRIMARIA)*/
    public Product getProductByCod(int cod) {
        return (Product) getSession().get(Product.class, cod);
    }

    @Override /**Obtiene un objeto de tipo Product según su campo name(CLAVE ÚNICA)*/
    public Product getProductByName(String name) {
        Criteria c=getSession().createCriteria(Product.class);
        return (Product) c.add(Restrictions.like("name", name)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Product según una variable que referencia varios campos(String)*/
    public ArrayList<Product> getProductsByQuery(String question) {
        Query query=getSession().createQuery("from Product p where p.name like :query OR p.price like :query OR p.category like :query");
        ArrayList<Product> list=(ArrayList<Product>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Product(todos los existentes)*/
    public ArrayList<Product> getProducts() {
        return (ArrayList<Product>) getSession().createQuery("from Product").list();
    }

    @Override /**Inserta un objeto de tipo Product en la BD*/
    public void insertProduct(String name, double price, String category) {
        Product p=new Product(new Category_DAO().getCategoryByName(category), name, price);
        getSession().save(p);
        getTransaction().commit();
        System.err.println("Product inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Product en la BD*/
    public void modifyProduct(int cod, String name, double price, String category) {
        Product p=getProductByCod(cod);
        p.setName(name);
        p.setPrice(price);
        p.setCategory(new Category_DAO().getCategoryByName(category));
        getSession().update(p);
        getTransaction().commit();
        System.err.println("Product modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Product de la BD según su cod(int)*/
    public void deleteProduct(int cod) {
        Product p=getProductByCod(cod);
        getSession().delete(p);
        getTransaction().commit();
        System.err.println("Product deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Product de la BD según una colección de tipos del mismo*/
    public void deleteProducts(ArrayList<Product> products) {
        Iterator it=products.iterator();
        while(it.hasNext()){
            Product p=(Product) it.next();
            getSession().delete(p);
        }
        getTransaction().commit();
        System.err.println("Products deleted succesfully.");
    }

    @Override /**Borra todos los registros de Product*/
    public void deleteProducts() {
        Iterator it=getProducts().iterator();
        while(it.hasNext()){
            Product p=(Product) it.next();
            getSession().delete(p);
        }
        getTransaction().commit();
        System.err.println("Products delete succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Product*/
    public DefaultTableModel getTableModelProduct() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String product[]={"COD","NAME","PRICE","CATEGORY"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product)));
        it=getProducts().iterator();
        while(it.hasNext()){
            row=new Vector();
            Product p=(Product) it.next();
            row.add(p.getCod());
            row.add(p.getName());
            row.add(p.getPrice());
            row.add(p.getCategory().getName());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
