package Hibernate.POJOs;
// Generated 17-ene-2016 11:10:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer cod;
     private String nickname;
     private String name;
     private String surname;
     private String email;
     private String password;
     private Set recordUsers = new HashSet(0);
     private Set baskets = new HashSet(0);

    public User() {
    }

	
    public User(String nickname, String name, String surname, String email, String password) {
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    public User(String nickname, String name, String surname, String email, String password, Set recordUsers, Set baskets) {
       this.nickname = nickname;
       this.name = name;
       this.surname = surname;
       this.email = email;
       this.password = password;
       this.recordUsers = recordUsers;
       this.baskets = baskets;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Set getRecordUsers() {
        return this.recordUsers;
    }
    
    public void setRecordUsers(Set recordUsers) {
        this.recordUsers = recordUsers;
    }
    public Set getBaskets() {
        return this.baskets;
    }
    
    public void setBaskets(Set baskets) {
        this.baskets = baskets;
    }




}


