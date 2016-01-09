package Hibernate.POJOs;
// Generated 09-ene-2016 21:01:18 by Hibernate Tools 4.3.1



/**
 * Bookmark generated by hbm2java
 */
public class Bookmark  implements java.io.Serializable {


     private Integer cod;
     private Crew crew;
     private String description;
     private String date;

    public Bookmark() {
    }

    public Bookmark(Crew crew, String description, String date) {
       this.crew = crew;
       this.description = description;
       this.date = date;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Crew getCrew() {
        return this.crew;
    }
    
    public void setCrew(Crew crew) {
        this.crew = crew;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }




}


