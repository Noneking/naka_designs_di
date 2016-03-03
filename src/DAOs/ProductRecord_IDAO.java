/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Product;
import Hibernate.POJOs.ProductRecord;
import Hibernate.POJOs.Record;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface ProductRecord_IDAO {
    
    public ProductRecord getProductRecordByCod(int cod);
    public ArrayList<ProductRecord> getProductsRecordsByQuery(int question);
    public ArrayList<ProductRecord> getProductsRecords();
    public void insertProductRecord(int amount, int record, int product);
    public void modifyProductRecord(int cod, int amount, Record record, Product product);
    public void deleteProductRecord(int cod);
    public void deleteProductRecord(ArrayList<ProductRecord> product_record);
    public void deleteProductsRecords();
    public DefaultTableModel getTableModelProductRecord();
    
}
