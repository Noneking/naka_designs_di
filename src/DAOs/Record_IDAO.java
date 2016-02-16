/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Record;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public interface Record_IDAO {
    
    public Record getRecordByCod(int cod);
    public ArrayList<Record> getRecordsByQuery(String question);
    public ArrayList<Record> getRecords();
    public void insertRecord(String date);
    public void modifyRecord(int cod, String date);
    public void deleteRecord(int cod);
    public void deleteRecords(ArrayList<Record> records);
    public void deleteRecords();
    
}
