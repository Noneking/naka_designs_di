/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Basket;
import Hibernate.POJOs.Product;
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
public class Basket_DAO extends Connection implements Basket_IDAO{

    @Override /**Obtiene un objeto de tipo Basket según su campo cod(CLAVE PRIMARIA)*/
    public Basket getBasketByCod(int cod) {
        return (Basket) getSession().get(Basket.class, cod);
    }

    @Override /**Obtiene un objeto de tipo Basket según su campo user*/
    public Basket getBasketByUser(int user) {
        Criteria c=getSession().createCriteria(Basket.class);
        return (Basket) c.add(Restrictions.like("user", user)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Basket según una variable que referencia varios campos(int)*/
    public ArrayList<Basket> getBasketByQuery(int question) {
        Query query=getSession().createQuery("from Basket b where b.cod like :query OR b.user like :query OR b.product like :query");
        ArrayList<Basket> list=(ArrayList<Basket>) query.setParameter("query", question).list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Basket(todos los existentes)*/
    public ArrayList<Basket> getBaskets() {
        return (ArrayList<Basket>) getSession().createQuery("from Basket").list();
    }

    @Override /**Inserta un objeto de tipo Basket en la BD*/
    public void insertBasket(int user, int product, int amount) {
        Basket b=new Basket(new Product_DAO().getProductByCod(product), new User_DAO().getUserByCod(user), amount);
        getSession().save(b);
        getTransaction().commit();
        System.err.println("Basket inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Basket en la BD*/
    public void modifyBasket(int cod, User user, Product product) {
        Basket b=getBasketByCod(cod);
        b.setUser(user);
        b.setProduct(product);
        getSession().update(b);
        getTransaction().commit();
        System.err.println("Basket modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Basket de la BD según su cod(int)*/
    public void deleteBasket(int cod) {
        Basket b=getBasketByCod(cod);
        getSession().delete(b);
        getTransaction().commit();
        System.err.println("Basket deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Basket de la BD según una colección de tipos del mismo*/
    public void deleteBaskets(ArrayList<Basket> baskets) {
        Iterator it=baskets.iterator();
        while(it.hasNext()){
            Basket b=(Basket) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Baskets deleted succesfully.");
    }

    @Override /**Borra todos los registros de Basket*/
    public void deleteBaskets() {
        Iterator it=getBaskets().iterator();
        while(it.hasNext()){
            Basket b=(Basket) it.next();
            getSession().delete(b);
        }
        getTransaction().commit();
        System.err.println("Baskets deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Basket*/
    public DefaultTableModel getTableModelBasket() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String basket[]={"COD","AMOUNT","USER","PRODUCT"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(basket)));
        it=getBaskets().iterator();
        while(it.hasNext()){
            row=new Vector();
            Basket b=(Basket) it.next();
            row.add(b.getCod());
            row.add(b.getAmount());
            row.add(b.getUser().getNickname());
            row.add(b.getProduct().getName());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
