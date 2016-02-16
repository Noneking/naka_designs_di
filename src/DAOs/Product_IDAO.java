/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Product;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public interface Product_IDAO {
    
    public Product getProductByCod(int cod);
    public Product getProductByName(String name);
    public ArrayList<Product> getProductsByQuery(String question);
    public ArrayList<Product> getProducts();
    public void insertProduct(String name, double price, String category);
    public void modifyProduct(int cod, String name, double price, String category);
    public void deleteProduct(int cod);
    public void deleteProducts(ArrayList<Product> products);
    public void deleteProducts();
    
}
