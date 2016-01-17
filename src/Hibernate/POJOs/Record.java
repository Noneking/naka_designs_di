package Hibernate.POJOs;
// Generated 17-ene-2016 11:10:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Record generated by hbm2java
 */
public class Record  implements java.io.Serializable {


     private Integer cod;
     private String date;
     private Set productRecords = new HashSet(0);
     private Set recordUsers = new HashSet(0);

    public Record() {
    }

	
    public Record(String date) {
        this.date = date;
    }
    public Record(String date, Set productRecords, Set recordUsers) {
       this.date = date;
       this.productRecords = productRecords;
       this.recordUsers = recordUsers;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public Set getProductRecords() {
        return this.productRecords;
    }
    
    public void setProductRecords(Set productRecords) {
        this.productRecords = productRecords;
    }
    public Set getRecordUsers() {
        return this.recordUsers;
    }
    
    public void setRecordUsers(Set recordUsers) {
        this.recordUsers = recordUsers;
    }




}


