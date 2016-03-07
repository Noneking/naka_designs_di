/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

/**
 *
 * @author nonek
 */
public class ColumnModel {
    
//    String user[]={"Código","Nick","Nombre","Apellidos","Email"};
//    String crew[]={"Email","Nick","Nombre","Apellidos","Teléfono","Rol"};
//    String product[]={"Código","Nombre","Precio","Categoría"};
//    String category[]={"Código","Nombre","Descripción"};
//    String record[]={"Código","Fecha"};
//    String material[]={"Código","Nombre"};
//    String basket[]={"Código","Cantidad","Cliente","Producto"};
//    String bookmark[]={"Código","Descripción","Fecha","Empleado"};
//    String turnover[]={"Código","Cantidad","Precio","Registro_producto"};
//    String record_user[]={"Código","Usuario","Registro"};
//    String product_record[]={"Código","Cantidad","Registro","Producto"};
//    String product_material[]={"Código","Cantidad","Producto","Material"};
    
//    String[] user={"Código","Nick","Nombre","Apellidos","Email"};
//    String[] crew={"Email","Nick","Nombre","Apellidos","Teléfono","Rol"};
//    String[] product={"Código","Nombre","Precio","Categoría"};
//    String[] category={"Código","Nombre","Descripción"};
//    String[] record={"Código","Fecha"};
//    String[] material={"Código","Nombre"};
//    String[] basket={"Código","Cantidad","Cliente","Producto"};
//    String[] bookmark={"Código","Descripción","Fecha","Empleado"};
//    String[] turnover={"Código","Cantidad","Precio","Registro_producto"};
//    String[] record_user={"Código","Usuario","Registro"};
//    String[] product_record={"Código","Cantidad","Registro","Producto"};
//    String[] product_material={"Código","Cantidad","Producto","Material"};
    
    public static enum COLUMN_MODEL_POSITION {
        USER,
        CREW,
        PRODUCT,
        CATEGORY,
        RECORD,
        MATERIAL,
        BASKET,
        BOOKMARK,
        TURNOVER,
        RECORD_USER,
        PRODUCT_RECORD,
        PRODUCT_MATERIAL
    }
    
    public static String[] getColumnModel(String name){
        
        String general[] = null;
        
        String user[]={"Código","Nick","Nombre","Apellidos","Email"};
        String crew[]={"Email","Nick","Nombre","Apellidos","Teléfono","Rol"};
        String product[]={"Código","Nombre","Precio","Categoría"};
        String category[]={"Código","Nombre","Descripción"};
        String record[]={"Código","Fecha"};
        String material[]={"Código","Nombre","Cantidad"};
        String basket[]={"Código","Cliente","Compra"};
//        String basket[]={"Código","Cantidad","Cliente","Producto"};
        String bookmark[]={"Código","Descripción","Fecha","Empleado"};
        String turnover[]={"Código","Cantidad","Precio","Registro_producto"};
        String record_user[]={"Código","Usuario","Registro"};
        String product_record[]={"Código","Cantidad","Registro","Producto"};
        String product_material[]={"Código","Cantidad","Producto","Material"};
        
        switch(name){
            case "USER":
                general=user;
                break;
            case "CREW":
                general=crew;
                break;
            case "PRODUCT":
                general=product;
                break;
            case "CATEGORY":
                general=category;
                break;
            case "RECORD":
                general=record;
                break;
            case "MATERIAL":
                general=material;
                break;
            case "BASKET":
                general=basket;
                break;
            case "BOOKMARK":
                general=bookmark;
                break;
            case "TURNOVER":
                general=turnover;
                break;
            case "RECORD_USER":
                general=record_user;
                break;
            case "PRODUCT_RECORD":
                general=product_record;
                break;
            case "PRODUCT_MATERIAL":
                general=product_material;
                break;
        }
        return general;
    }
    
}
