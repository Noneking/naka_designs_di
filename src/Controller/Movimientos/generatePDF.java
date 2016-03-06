/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import Hibernate.POJOs.Crew;
import Hibernate.POJOs.User;
import Model.Model_Movimientos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Noneking, Inno, MrDrulix
 */
        
public class generatePDF {
    Model_Movimientos mm;
    //Método que genera el PDF correspondiente a la factura del Cliente
    public void generateAgendaEmpleados(){
        mm = new Model_Movimientos();
        try 
        {

            Calendar calendar =  Calendar.getInstance();
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            int monthOfYear =calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int min = calendar.get(Calendar.MINUTE);
            int sec = calendar.get(Calendar.SECOND);
            
            Document documento = new Document();//Creamos el documento
            FileOutputStream ficheroPdf = new FileOutputStream("agendaEmpleados"+dayOfMonth+"--"+monthOfYear+"--"+year+" "+hour+";"+min+";"+sec+".pdf");//Abrimos el flujo y le asignamos nombre al pdf y su direccion
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);//Instanciamos el documento con el fichero
            
            documento.open();//Abrimos el documento
            
                documento.add(new Paragraph("Lista Empleados",FontFactory.getFont("Calibri",30,Font.BOLD,BaseColor.BLACK)));//Le indicamos el tipo de letra, el tamanio, el estilo y el color de la letra
                documento.add(new Paragraph("___________________________"));//Realiza un salto de linea
               Iterator it;
                it = mm.getCrews().iterator();
                while (it.hasNext()) {
                    Crew c = (Crew) it.next();
                    System.out.println("" + c.getEmail().toString());
                    documento.add(new Paragraph(""));
                //Le decimos que nos imprima el Dni, Nombre y Apellidos del cliente, contenidos en el objeto Cliente y le indicamos el tipo de letra, tamanio, estilo y color de la letra
                documento.add(new Paragraph("Nombre: "+c.getName(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Apellidos: "+c.getSurname(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Email: "+c.getEmail(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Teléfono: "+c.getPhoneNumber(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Nickname: "+c.getNickname(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Contraseña: "+c.getPassword(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph("Puesto: "+c.getRole(),FontFactory.getFont("Calibri",20,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("______________________________________________________________________________"));
                }
              
                documento.close();//Cerramos el flujo con el documento
                JOptionPane.showMessageDialog(null, "Se ha insertado documento:");
        
            
        }
        catch (DocumentException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void generateAgendaClientes(){
        mm = new Model_Movimientos();
        try 
        {

            Calendar calendar =  Calendar.getInstance();
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            int monthOfYear =calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int min = calendar.get(Calendar.MINUTE);
            int sec = calendar.get(Calendar.SECOND);
            
            Document documento = new Document();//Creamos el documento
            FileOutputStream ficheroPdf = new FileOutputStream("agendaClientes"+dayOfMonth+"--"+monthOfYear+"--"+year+" "+hour+";"+min+";"+sec+".pdf");//Abrimos el flujo y le asignamos nombre al pdf y su direccion
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);//Instanciamos el documento con el fichero
            
            documento.open();//Abrimos el documento
            
                documento.add(new Paragraph("Agenda Clientes",FontFactory.getFont("Calibri",30,Font.BOLD,BaseColor.BLACK)));//Le indicamos el tipo de letra, el tamanio, el estilo y el color de la letra
                documento.add(new Paragraph("___________________________"));//Realiza un salto de linea
               Iterator it;
                it = mm.getUserss().iterator();
                while (it.hasNext()) {
                    User u = (User) it.next();
                    System.out.println("" + u.getEmail().toString());
                    documento.add(new Paragraph(""));
                    try {
                        Image foto = Image.getInstance("src/IMG/userBig.png");
                        foto.scaleToFit(48, 48);
                        foto.setAlignment(Chunk.ALIGN_LEFT);
                        documento.add(foto);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //Le decimos que nos imprima el Dni, Nombre y Apellidos del cliente, contenidos en el objeto Cliente y le indicamos el tipo de letra, tamanio, estilo y color de la letra
                    documento.add(new Paragraph("Nombre: " + u.getName()+
                                            "  Apellidos: "+u.getSurname()+
                                            "  Email: "+u.getEmail()+
                                            "  Nickname: "+u.getNickname()+
                                            "  Contraseña: "+u.getPassword(),FontFactory.getFont("Calibri",8,Font.BOLD,BaseColor.BLACK)));
         
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("______________________________________________________________________________"));
                }
                
                
                documento.close();//Cerramos el flujo con el documento
                JOptionPane.showMessageDialog(null, "Se ha creado la agenda Clientes.");
            
        }
        catch (DocumentException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
