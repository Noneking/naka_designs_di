/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.User;
import Model.Connection;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public interface User_IDAO {
    
    public User getUserByCod(int cod);
    public User getUserByNickname(String nickname);
    public ArrayList<User> getUsersByQuery(String question);
    public ArrayList<User> getUsers();
    public void insertUser(String nickname, String name, String surname, String email, String password);
    public void modifyUser(int cod, String nickname, String name, String surname, String email, String password);
    public void deleteUser(int cod);
    public void deleteUsers(ArrayList<User> users);
    public void deleteUsers();
    
}
