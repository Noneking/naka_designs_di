package Hibernate.POJOs;
// Generated 17-ene-2016 11:10:52 by Hibernate Tools 4.3.1



/**
 * ProductMaterial generated by hbm2java
 */
public class ProductMaterial  implements java.io.Serializable {


     private Integer cod;
     private Material material;
     private Product product;
     private int amount;

    public ProductMaterial() {
    }

    public ProductMaterial(Material material, Product product, int amount) {
       this.material = material;
       this.product = product;
       this.amount = amount;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Material getMaterial() {
        return this.material;
    }
    
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }




}


