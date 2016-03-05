/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

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
public class Crew_DAO extends Connection implements Crew_IDAO{

    @Override /**Obtiene un objeto de tipo Crew según su campo email(CLAVE PRIMARIA)*/
    public Crew getCrewByEmail(String email) {
        return (Crew) getSession().get(Crew.class, email);
    }

    @Override /**Obtiene un objeto de tipo Category según su campo nickname(CLAVE ÚNICA)*/
    public Crew getCrewByNickname(String nickname) {
        Criteria c=getSession().createCriteria(Crew.class);
        return (Crew) c.add(Restrictions.like("nickname", nickname)).uniqueResult();
    }

    @Override /**Obtiene una colección de objetos de tipo Crew según una variable que referencia varios campos(String)*/
    public ArrayList<Crew> getCrewsByQuery(String question) {
        Query query=getSession().createQuery("from Crew c where c.email like :query OR c.nickname like :query OR c.name like :query OR c.surname like :query OR c.phone_number like :query OR c.role like :query");
        ArrayList<Crew> list=(ArrayList<Crew>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo Crew(todos los existentes)*/
    public ArrayList<Crew> getCrews() {
        return (ArrayList<Crew>) getSession().createQuery("from Crew").list();
    }

    @Override /**Inserta un objeto de tipo Crew en la BD*/
    public void insertCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role) {
        Crew c=new Crew(email, nickname, password, name, surname, phone_number, role);
        getSession().save(c);
        getTransaction().commit();
        closeSession();
        System.err.println("Crew inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo Crew en la BD*/
    public void modifyCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role) {
        Crew c=getCrewByEmail(email);
        c.setNickname(nickname);
        c.setPassword(password);
        c.setName(name);
        c.setSurname(surname);
        c.setPhoneNumber(phone_number);
        c.setRole(role);
        getSession().update(c);
        getTransaction().commit();
        System.err.println("Crew modified succesfully.");
    }

    @Override /**Borra un objeto de tipo Crew de la BD según su cod(int)*/
    public void deleteCrew(String email) {
        Crew c=getCrewByEmail(email);
        getSession().delete(c);
        getTransaction().commit();
        System.err.println("Crew deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo Crew de la BD según una colección de tipos del mismo*/
    public void deleteCrews(ArrayList<Crew> crews) {
        Iterator it=crews.iterator();
        while(it.hasNext()){
            Crew c=(Crew) it.next();
            getSession().delete(c);
        }
        getTransaction().commit();
        System.err.println("Crews deleted succesfully.");
    }

    @Override /**Borra todos los registros de Crew*/
    public void deleteCrews() {
        Iterator it=getCrews().iterator();
        while(it.hasNext()){
            Crew c=(Crew) it.next();
            getSession().delete(c);
        }
        getTransaction().commit();
        System.err.println("Crews deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de Crew*/
    public DefaultTableModel getTableModelCrew() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String crew[]={"EMAIL","NICKNAME","NAME","SURNAME","PHONE","ROLE"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(crew)));
        it=getCrews().iterator();
        while(it.hasNext()){
            row=new Vector();
            Crew c=(Crew) it.next();
            row.add(c.getEmail());
            row.add(c.getNickname());
            row.add(c.getName());
            row.add(c.getSurname());
            row.add(c.getPhoneNumber());
            row.add(c.getRole());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
