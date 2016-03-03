/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Material;
import Hibernate.POJOs.Product;
import Hibernate.POJOs.ProductMaterial;
import Model.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;

/**
 *
 * @author nonek
 */
public class ProductMaterial_DAO extends Connection implements ProductMaterial_IDAO{

    @Override /**Obtiene un objeto de tipo ProductMaterial según su campo cod(CLAVE PRIMARIA)*/
    public ProductMaterial getProductMaterialByCod(int cod) {
        return (ProductMaterial) getSession().get(ProductMaterial.class, cod);
    }

    @Override /**Obtiene una colección de objetos de tipo ProductMaterial según una variable que referencia varios campos(int)*/
    public ArrayList<ProductMaterial> getProductsMaterialsByQuery(int question) {
        Query query=getSession().createQuery("from ProductMaterial pm where pm.cod like :query OR pm.amount like :query OR pm.product like :query OR pm.material like :query");
        ArrayList<ProductMaterial> list=(ArrayList<ProductMaterial>) query.setParameter("query", "%"+question+"%").list();
        return list;
    }

    @Override /**Obtiene una colección de objetos de tipo ProductMaterial(todos los existentes)*/
    public ArrayList<ProductMaterial> getProductsMaterials() {
        return (ArrayList<ProductMaterial>) getSession().createQuery("from ProductMaterial").list();
    }

    @Override /**Inserta un objeto de tipo ProductMaterial en la BD*/
    public void insertProductMaterial(int amount, int product, int material) {
        ProductMaterial pm=new ProductMaterial(new Material_DAO().getMaterialByCod(material), new Product_DAO().getProductByCod(product), amount);
        getSession().save(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial inserted succesfully.");
    }

    @Override /**Modifica un objeto de tipo ProductMaterial en la BD*/
    public void modifyProductMaterial(int cod, int amount, Product product, Material material) {
        ProductMaterial pm=getProductMaterialByCod(cod);
        pm.setAmount(amount);
        pm.setProduct(product);
        pm.setMaterial(material);
        getSession().update(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial modified succesfully.");
    }

    @Override /**Borra un objeto de tipo ProductMaterial de la BD según su cod(int)*/
    public void deleteProductMaterial(int cod) {
        ProductMaterial pm=getProductMaterialByCod(cod);
        getSession().delete(pm);
        getTransaction().commit();
        System.err.println("ProductMaterial deleted succesfully.");
    }

    @Override /**Borra una colección de registros de tipo ProductMaterial de la BD según una colección de tipos del mismo*/
    public void deleteProductsMaterials(ArrayList<ProductMaterial> products_materials) {
        Iterator it=products_materials.iterator();
        while(it.hasNext()){
            ProductMaterial pm=(ProductMaterial) it.next();
            getSession().delete(pm);
        }
        getTransaction().commit();
        System.err.println("ProductsMaterials delete succesfully.");
    }

    @Override /**Borra todos los registros de ProductMaterial*/
    public void deleteProductsMaterials() {
        Iterator it=getProductsMaterials().iterator();
        while(it.hasNext()){
            ProductMaterial pm=(ProductMaterial) it.next();
            getSession().delete(pm);
        }
        getTransaction().commit();
        System.err.println("ProductsMaterials deleted succesfully.");
    }

    @Override /**Obtiene el modelo de la tabla de ProductMaterial*/
    public DefaultTableModel getTableModelProductMaterial() {
        DefaultTableModel dtm=new DefaultTableModel();
        Iterator it;
        Vector columns,row;
        
        String product_material[]={"COD","AMOUNT","PRODUCT","MATERIAL"};
        
        dtm.setColumnIdentifiers(columns=new Vector(Arrays.asList(product_material)));
        it=getProductsMaterials().iterator();
        while(it.hasNext()){
            row=new Vector();
            ProductMaterial pm=(ProductMaterial) it.next();
            row.add(pm.getCod());
            row.add(pm.getAmount());
            row.add(pm.getProduct().getName());
            row.add(pm.getMaterial().getName());
            dtm.addRow(row);
        }
        
        return dtm;
    }
    
}
