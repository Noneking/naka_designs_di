/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Menu;

/**
 *
 * @author MrDrulix
 */
public class EnumMenu {
    
    public enum Actions {

        mn_historial_ventas,
        mitem_masInfo,
        mitem_guardarBD,
        mn_apariencia,
            mitem_aluoxide,
            mitem_blackeye,
            mitem_blackstart,
            mitem_classy,
        btn_comenzarGuardadarBD,
        mn_nuevo,
            mitem_nuevoMaterial,
            mitem_nuevoCliente,
            mitem_nuevoEmpleado,
            mitem_nuevoCarrito;
    }
    
    public enum POSITION {

        CATEGORIA,
        MATERIAL,
        PRODUCTO,
        CLIENTE,
        EMPLEADO,
        CARRITO
    }
}
