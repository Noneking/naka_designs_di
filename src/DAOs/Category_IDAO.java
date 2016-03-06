/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Category;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface Category_IDAO {
    
    public Category getCategoryByCod(int cod);
    public Category getCategoryByName(String name);
    public ArrayList<Category> getCategoriesByQuery(String question);
    public ArrayList<Category> getCategories();
    public void insertCategory(String name, String description);
    public void modifyCategory(int cod, String name, String description);
    public void deleteCategory(int cod);
    public void deleteCategories(ArrayList<Category> categories);
    public void deleteCategories();
    public DefaultTableModel getTableModelCategory();
    public DefaultComboBoxModel getComboBoxModelCategory();
    
}
