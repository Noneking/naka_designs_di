/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Category;
import Model.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nonek
 */
public class Category_DAO extends Connection implements Category_IDAO {

    @Override /**Obtiene un objeto de tipo Category según su campo cod(CLAVE PRIMARIA)*/
    public Category getCategoryByCod(int cod) {
        Category c=(Category) getSession().get(Category.class, cod);
        closeSession();
        return c;
    }

    @Override /**Obtiene un objeto de tipo Category según su campo name(CLAVE ÚNICA)*/
    public Category getCategoryByName(String name) {
        Criteria cr=getSession().createCriteria(Category.class);
        Category c=(Category) cr.add(Restrictions.like("name", name)).uniqueResult();
        closeSession();
        return c;
    }

    @Override /**Obtiene una colección de objetos de tipo Category según una variable que referencia varios campos(String)*/
    public ArrayList<Category> getCategoriesByQuery(String question) {
        Query query=getSession().createQuery("from Category c where c.name like :query OR c.description like :query");
        ArrayList<Category> list=(ArrayList<Category>) query.setParameter("query", "%"+question+"%").list();
        closeSession();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Catogory(todos los existentes)*/
    public ArrayList<Category> getCategories() {
        ArrayList<Category> arrayList=(ArrayList<Category>) getSession().createQuery("from Category").list();
        closeSession();
        return arrayList;
    }

    @Override /**Inserta un objeto de tipo Category en la BD*/
    public void insertCategory(String name, String description) {
        Category c=new Category(name);
        c.setDescription(description);
        getSession().save(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Category en la BD*/
    public void modifyCategory(int cod, String name, String description) {
        Category c=getCategoryByCod(cod);
        c.setName(name);
        c.setDescription(description);
        getSession().update(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category modified succesfully.");
    }

    @Override /**Borra un objeto de tipo ProductRecord de la BD según su cod(int)*/
    public void deleteCategory(int cod) {
        Category c=getCategoryByCod(cod);
        getSession().delete(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Category deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Category de la BD según una colección de tipos del mismo*/
    public void deleteCategories(ArrayList<Category> categories) {
        Iterator it=categories.iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            getSession().delete(c);
            closeSession();
        }
        getTransaction().commit();
        closeSession();
        System.err.println("Categories deleted succesfully.");
    }

    @Override /**Borra todos los registros de Catogory*/
    public void deleteCategories() {
        Iterator it=getCategories().iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            getSession().delete(c);
            closeSession();
        }
        getTransaction().commit();
        closeSession();
        System.err.println("Categories deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Category*/
    public DefaultTableModel getTableModelCategory() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String category[]={"COD","NAME","DESCRIPTION"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(category)));
        it=getCategories().iterator();
        while(it.hasNext()){
            row=new Vector();
            Category c=(Category) it.next();
            row.add(c.getCod());
            row.add(c.getName());
            row.add(c.getDescription());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
    @Override /**Obtiene el modelo del ComboBox de Category*/
    public DefaultComboBoxModel getComboBoxModelCategory(){
        DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
        Iterator it=getCategories().iterator();
        while(it.hasNext()){
            Category c=(Category) it.next();
            dcbm.addElement(c.getName());
        }
        return dcbm;
    }
    
}
