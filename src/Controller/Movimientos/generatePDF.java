/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Crew;
import Hibernate.POJOs.User;
import Model.Model_Movimientos;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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
                JOptionPane.showMessageDialog(null, "Se ha creado agenda de Empleados.");
        
            
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
     
      public void generateInforme(){
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
            
                documento.add(new Paragraph("Informe",FontFactory.getFont("Calibri",30,Font.BOLD,BaseColor.BLACK)));//Le indicamos el tipo de letra, el tamanio, el estilo y el color de la letra
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Datos mensuales de Ventas:",FontFactory.getFont("Calibri",12,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                
              
                PdfPTable tabla = new PdfPTable(2);//Creamos una tabla de tres columnas

                        tabla.addCell("Mes");
                        tabla.addCell("NºVentas");
                        
                tabla.addCell("Enero");
                tabla.addCell("" + mm.getRecordEnero());
                tabla.addCell("Febrero");
                tabla.addCell("" + mm.getRecordFebrero());
                tabla.addCell("Marzo");
                tabla.addCell("" + mm.getRecordMarzo());
                tabla.addCell("Abril");
                tabla.addCell("" + mm.getRecordAbril());
                tabla.addCell("Mayo");
                tabla.addCell("" + mm.getRecordMayo());
                tabla.addCell("Junio");
                tabla.addCell("" + mm.getRecordJunio());
                tabla.addCell("Julio");
                tabla.addCell("" + mm.getRecordJulio());
                tabla.addCell("Agosto");
                tabla.addCell("" + mm.getRecordAgosto());
                tabla.addCell("Septiembre");
                tabla.addCell("" + mm.getRecordSeptiembre());
                tabla.addCell("Octubre");
                tabla.addCell("" + mm.getRecordOctubre());
                tabla.addCell("Noviembre");
                tabla.addCell("" + mm.getRecordNoviembre());
                tabla.addCell("Diciembre");
                tabla.addCell("" + mm.getRecordDiciembre());    
                    
                documento.add(tabla);
                
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Conexiones de Empleados:",FontFactory.getFont("Calibri",12,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                
                PdfPTable tabla2 = new PdfPTable(2);//Creamos una tabla de tres columnas

                        tabla.addCell("Usuario");
                        tabla.addCell("Nº Conexiones");
                Iterator it;
                it = mm.getCrews().iterator();
                while (it.hasNext()) {
                    Crew c = (Crew) it.next();
                    System.out.println("" + c.getEmail().toString());
                tabla2.addCell(""+c.getName()+" "+c.getSurname());
                tabla2.addCell("" +mm.getConexionesCount(c.getEmail().toString())); 
                
                }
                documento.add(new Paragraph(" "));
                documento.add(tabla2);
                
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Registro de movimientos Empleados: ",FontFactory.getFont("Calibri",12,Font.BOLD,BaseColor.BLACK)));
                documento.add(new Paragraph(" "));
                Iterator it2;
                it2 = mm.getBookmark().iterator();
                while (it2.hasNext()) {
                    Bookmark c = (Bookmark) it2.next();
                    System.out.println("" + c.getCrew().toString());
                    
                    documento.add(new Paragraph(c.getDate()+"       User: "+c.getCrew().getName()+" "+c.getCrew().getSurname()+" -->  "+c.getDescription(),FontFactory.getFont("Calibri",10,Font.NORMAL,BaseColor.BLACK)));
                }
                
                
                
                
                
                documento.close();//Cerramos el flujo con el documento
                JOptionPane.showMessageDialog(null, "Se ha creado el Informe General");
            
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
