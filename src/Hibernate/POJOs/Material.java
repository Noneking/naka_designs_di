package Hibernate.POJOs;
// Generated 17-ene-2016 11:10:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Material generated by hbm2java
 */
public class Material  implements java.io.Serializable {


     private Integer cod;
     private String name;
     private int amount;
     private Set productMaterials = new HashSet(0);

    public Material() {
    }

	
    public Material(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public Material(String name, int amount, Set productMaterials) {
       this.name = name;
       this.amount = amount;
       this.productMaterials = productMaterials;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Set getProductMaterials() {
        return this.productMaterials;
    }
    
    public void setProductMaterials(Set productMaterials) {
        this.productMaterials = productMaterials;
    }




}


