/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Controller.Table.ColumnModel;
import Hibernate.POJOs.User;
import Model.Connection;
import static Model.Connection.getSession;
import static Model.Connection.getTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author nonek
 */
public class User_DAO extends Connection implements User_IDAO {

    @Override /**Obtiene un objeto de tipo User según su campo cod(CLAVE PRIMARIA)*/
    public User getUserByCod(int cod) {
        return (User) Connection.getSession().get(User.class, cod);
    }

    @Override /**Obtiene un objeto de tipo User según su campo name(CLAVE ÚNICA)*/
    public User getUserByNickname(String nickname) {
        Criteria c=Connection.getSession().createCriteria(User.class);
        return (User) c.add(Restrictions.like("nickname", nickname)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo User según una variable que referencia varios campos(String)*/
    public ArrayList<User> getUsersByQuery(String question) {
        Query query=getSession().createQuery("from User u where u.nickname like :query OR u.name like :query OR u.surname like :query OR u.email like :query");
        ArrayList<User> list=(ArrayList<User>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo User(todos los existentes)*/
    public ArrayList<User> getUsers() {
        return (ArrayList<User>) Connection.getSession().createQuery("from User").list();
    }

    @Override /**Inserta un objeto de tipo User en la BD*/
    public void insertUser(String nickname, String name, String surname, String email, String password) {
        User u=new User(nickname, name, surname, email, password);
        getSession().save(u);
        getTransaction().commit();
        System.err.println("User inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo User en la BD*/
    public void modifyUser(int cod, String nickname, String name, String surname, String email, String password) {
        User u=getUserByCod(cod);
        u.setNickname(nickname);
        u.setName(name);
        u.setSurname(surname);
        u.setEmail(email);
        u.setPassword(password);
        Connection.getSession().update(u);
        Connection.getTransaction().commit();
        System.err.println("User modified succesfully.");
    }

    @Override /**Borra un objeto de tipo User de la BD según su cod(int)*/
    public void deleteUser(int cod) {
        User u=getUserByCod(cod);
        Connection.getSession().delete(u);
        Connection.getTransaction().commit();
        System.err.println("User deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo User de la BD según una colección de tipos del mismo*/
    public void deleteUsers(ArrayList<User> users) {
        Iterator it=users.iterator();
        while(it.hasNext()){
            User u=(User) it.next();
            Connection.getSession().delete(u);
        }
        Connection.getTransaction().commit();
        System.err.println("Users delete succesfully.");
    }

    @Override /**Borra todos los registros User*/
    public void deleteUsers() {
        Iterator it=getUsers().iterator();
        while(it.hasNext()){
            User u=(User) it.next();
            Connection.getSession().delete(u);
        }
        Connection.getTransaction().commit();
        System.err.println("Users deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de User*/
    public DefaultTableModel getTableModelUser() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String user[]={"COD","NICKNAME","NAME","SURNAME","EMAIL"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(user)));
        it=getUsers().iterator();
        while(it.hasNext()){
            row=new Vector();
            User u=(User) it.next();
            row.add(u.getCod());
            row.add(u.getNickname());
            row.add(u.getName());
            row.add(u.getSurname());
            row.add(u.getEmail());
            dtm.addRow(row);
        }
        
        return dtm;
    }
}
