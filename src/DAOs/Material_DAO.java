/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Material;
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
public class Material_DAO extends Connection implements Material_IDAO{

    @Override /**Obtiene un objeto de tipo Material según su campo cod(CLAVE PRIMARIA)*/
    public Material getMaterialByCod(int cod) {
        return (Material) getSession().get(Material.class, cod);
    }

    @Override /**Obtiene un objeto de tipo Material según su campo name(CLAVE ÚNICA)*/
    public Material getMaterialByName(String name) {
        Criteria c=getSession().createCriteria(Material.class);
        return (Material) c.add(Restrictions.like("name", name)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Material según una variable que referencia varios campos(String)*/
    public ArrayList<Material> getMaterialsByQuery(String question) {
        Query query=getSession().createQuery("from Material m where m.name like :consulta");
        ArrayList<Material> list=(ArrayList<Material>) query.setParameter("consulta", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Material(todos los existentes)*/
    public ArrayList<Material> getMaterials() {
        return (ArrayList<Material>) getSession().createQuery("from Material").list();
    }

    @Override /**Inserta un objeto de tipo Material en la BD*/
    public void insertMaterial(String name, int amount) {
        Material m=new Material(name, amount);
        getSession().save(m);
        getTransaction().commit();
        System.err.println("Material inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Material en la BD*/
    public void modifyMaterial(int cod, String name) {
        Material m=getMaterialByCod(cod);
        m.setName(name);
        getSession().update(m);
        getTransaction().commit();
        System.err.println("Material modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Material de la BD según su cod(int)*/
    public void deleteMaterial(int cod) {
        Material m=getMaterialByCod(cod);
        getSession().delete(m);
        getTransaction().commit();
        System.err.println("Material deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Material de la BD según una colección de tipos del mismo*/
    public void deleteMaterials(ArrayList<Material> materials) {
        Iterator it=materials.iterator();
        while(it.hasNext()){
            Material m=(Material) it.next();
            getSession().delete(m);
        }
        getTransaction().commit();
        System.err.println("Materials delete succesfully.");
    }

    @Override /**Borra todos los registros de Material*/
    public void deleteMaterials() {
        Iterator it=getMaterials().iterator();
        while(it.hasNext()){
            Material m=(Material) it.next();
            getSession().delete(m);
        }
        getTransaction().commit();
        System.err.println("Materials deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Material*/
    public DefaultTableModel getTableModelMaterial() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String material[]={"COD","NAME"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(material)));
        it=getMaterials().iterator();
        while(it.hasNext()){
            row=new Vector();
            Material m=(Material) it.next();
            row.add(m.getCod());
            row.add(m.getName());
            row.add(m.getAmount());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
