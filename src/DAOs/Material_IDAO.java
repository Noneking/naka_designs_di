/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Material;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface Material_IDAO {
    
    public Material getMaterialByCod(int cod);
    public Material getMaterialByName(String name);
    public ArrayList<Material> getMaterialsByQuery(String question);
    public ArrayList<Material> getMaterials();
    public void insertMaterial(String name, int amount);
    public void modifyMaterial(int cod, String name);
    public void deleteMaterial(int cod);
    public void deleteMaterials(ArrayList<Material> materials);
    public void deleteMaterials();
    public DefaultTableModel getTableModelMaterial();
    
}
