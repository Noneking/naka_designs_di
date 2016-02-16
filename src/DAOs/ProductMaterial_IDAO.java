/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Material;
import Hibernate.POJOs.Product;
import Hibernate.POJOs.ProductMaterial;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public interface ProductMaterial_IDAO {
    
    public ProductMaterial getProductMaterialByCod(int cod);
    public ArrayList<ProductMaterial> getProductsMaterialsByQuery(int question);
    public ArrayList<ProductMaterial> getProductsMaterials();
    public void insertProductMaterial(int amount, int product, int material);
    public void modifyProductMaterial(int cod, int amount, Product product, Material material);
    public void deleteProductMaterial(int cod);
    public void deleteProductsMaterials(ArrayList<ProductMaterial> products_materials);
    public void deleteProductsMaterials();
    
}
