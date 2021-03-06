package Hibernate.POJOs;
// Generated 17-ene-2016 11:10:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Crew generated by hbm2java
 */
public class Crew  implements java.io.Serializable {


     private String email;
     private String nickname;
     private String password;
     private String name;
     private String surname;
     private String phoneNumber;
     private String role;
     private Set bookmarks = new HashSet(0);

    public Crew() {
    }

	
    public Crew(String email, String nickname, String password, String name, String surname, String phoneNumber, String role) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }
    public Crew(String email, String nickname, String password, String name, String surname, String phoneNumber, String role, Set bookmarks) {
       this.email = email;
       this.nickname = nickname;
       this.password = password;
       this.name = name;
       this.surname = surname;
       this.phoneNumber = phoneNumber;
       this.role = role;
       this.bookmarks = bookmarks;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public Set getBookmarks() {
        return this.bookmarks;
    }
    
    public void setBookmarks(Set bookmarks) {
        this.bookmarks = bookmarks;
    }




}


