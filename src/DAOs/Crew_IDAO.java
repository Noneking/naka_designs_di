/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Hibernate.POJOs.Crew;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public interface Crew_IDAO {
    
    public Crew getCrewByEmail(String email);
    public Crew getCrewByNickname(String nickname);
    public ArrayList<Crew> getCrewsByQuery(String question);
    public ArrayList<Crew> getCrews();
    public void insertCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role);
    public void modifyCrew(String email, String nickname, String password, String name, String surname, String phone_number, String role);
    public void deleteCrew(String email);
    public void deleteCrews(ArrayList<Crew> crews);
    public void deleteCrews();
    public DefaultTableModel getTableModelCrew();
    
}
