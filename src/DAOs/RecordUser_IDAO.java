/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Record;
import Hibernate.POJOs.RecordUser;
import Hibernate.POJOs.User;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface RecordUser_IDAO {
    
    public RecordUser getRecordUserByCod(int cod);
    public ArrayList<RecordUser> getRecordUserByUser(int user);
    public ArrayList<RecordUser> getRecordUserByRecord(int record);
    public ArrayList<RecordUser> getRecordsUsersByQuery(int question);
    public ArrayList<RecordUser> getRecordsUsers();
    public void insertRecordUser(int user, int record);
    public void modifyRecordUser(int cod, User user, Record record);
    public void deleteRecordUser(int cod);
    public void deleteRecordsUsers(ArrayList<RecordUser> records_users);
    public void deleteRecordsUsers();
    public DefaultTableModel getTableModelRecordUser();
    
}
