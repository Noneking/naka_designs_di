/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author nonek
 */
public class Position {
    
    public static String position;
    
    public static enum POSITION {

        CATEGORIA,
        MATERIAL,
        PRODUCTO,
        CLIENTE,
        EMPLEADO,
        CARRITO
    }
    
    public static String getPosition(){
        return Position.position;
    }
    
    public static void setPosition(String position){
        Position.position=position;
    }
    
}
