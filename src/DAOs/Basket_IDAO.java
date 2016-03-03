/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Basket;
import Hibernate.POJOs.Product;
import Hibernate.POJOs.User;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface Basket_IDAO {
    
    public Basket getBasketByCod(int cod);
    public Basket getBasketByUser(int user);
    public ArrayList<Basket> getBasketByQuery(int question);
    public ArrayList<Basket> getBaskets();
    public void insertBasket(int user, int product, int amount);
    public void modifyBasket(int cod, User user, Product product);
    public void deleteBasket(int cod);
    public void deleteBaskets(ArrayList<Basket> baskets);
    public void deleteBaskets();
    public DefaultTableModel getTableModelBasket();
    
}
