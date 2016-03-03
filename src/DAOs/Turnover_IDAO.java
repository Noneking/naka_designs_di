/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.ProductRecord;
import Hibernate.POJOs.Turnover;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface Turnover_IDAO {
    
    public Turnover getTurnoverByCod(int cod);
    public Turnover getTurnoverByNickname(int product_record);
    public ArrayList<Turnover> getTurnoversByQuery(int question);
    public ArrayList<Turnover> getTurnovers();
    public void insertTurnover(int amount, double price, int product_record);
    public void modifyTurnover(int cod, int amount, double price, ProductRecord product_record);
    public void deleteTurnover(int cod);
    public void deleteTurnovers(ArrayList<Turnover> turnover);
    public void deleteTurnovers();
    public DefaultTableModel getTableModelTurnover();
    
}
