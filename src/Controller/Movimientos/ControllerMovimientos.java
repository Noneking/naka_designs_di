/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import Hibernate.POJOs.Crew;
import Hibernate.POJOs.Product;
import Model.Model_Movimientos;
import View.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author MrDrulix
 */
public class ControllerMovimientos extends EnumMovimientos implements ActionListener {
    
    Main v;
    Model_Movimientos mm;
    File arch;
    generatePDF pdf;
    LabelAccessor la;
    //JWebBrowser fileBrowser = new JWebBrowser();
    public void initMovimientosListeners(Main v){
        this.v = v;
        //boton home
        this.v.btn_home.setActionCommand("btn_home");
        this.v.btn_home.addActionListener(this);
        //boton ventas
        this.v.pnl_mostrarGrafica.setLayout(new BorderLayout());
        this.v.pnl_contenedorInferiorMovimientos.setLayout(new BorderLayout());
        
        this.v.btn_ventasMovi.setActionCommand("btn_ventasMovi");
        this.v.btn_ventasMovi.addActionListener(this);
        this.v.btn_empleMovi.setActionCommand("btn_empleMovi");
        this.v.btn_empleMovi.addActionListener(this);
        this.v.btn_productoMovi.setActionCommand("btn_productoMovi");
        this.v.btn_productoMovi.addActionListener(this);
        

        this.v.btn_abrirFilechooser.setActionCommand("btn_abrirFilechooser");
        this.v.btn_abrirFilechooser.addActionListener(this);
        
        this.v.btn_informe.setActionCommand("btn_informe");
        this.v.btn_informe.addActionListener(this);
        
        mm = new Model_Movimientos();
        pdf = new generatePDF();
        la = new LabelAccessor();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "png", "jpg", "gif");//filtramos solo los formatos que queramos de imagen
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Texto", "pdf", "txt");
        this.v.jFileChooser1.setFileFilter(filtro);//le enviamos el filtro
        this.v.jFileChooser1.setFileFilter(filtro1);
        this.v.jFileChooser1.setAccessory(new LabelAccessor(this.v.jFileChooser1));
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Actions.valueOf(e.getActionCommand())) {
             case btn_home:
                this.v.pnl_Main.removeAll();
                this.v.pnl_Main.add(this.v.SplitPane1,BorderLayout.CENTER);
                this.v.pnl_Main.setVisible(false);
                this.v.pnl_Main.setVisible(true);                
                break;
                 
             case btn_ventasMovi:
                this.v.pnl_contenedorDerechoMovimientos.removeAll();
                this.v.pnl_contenedorDerechoMovimientos.add(this.v.pnl_contenedorDerecho,BorderLayout.CENTER);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(false);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(true);
                DefaultCategoryDataset b = new DefaultCategoryDataset();
                b.setValue(mm.getRecordEnero(), "Ventas", "Ene");
                b.setValue(mm.getRecordFebrero(), "Ventas", "Feb");
                b.setValue(mm.getRecordMarzo(), "Ventas", "Mar");
                b.setValue(mm.getRecordAbril(), "Ventas", "Abr");
                b.setValue(mm.getRecordMayo(), "Ventas", "May");
                b.setValue(mm.getRecordJunio(), "Ventas", "Jun");
                b.setValue(mm.getRecordJulio(), "Ventas", "Jul");
                b.setValue(mm.getRecordAgosto(), "Ventas", "Ago");
                b.setValue(mm.getRecordSeptiembre(), "Ventas", "Sep");
                b.setValue(mm.getRecordOctubre(), "Ventas", "Oct");
                b.setValue(mm.getRecordNoviembre(), "Ventas", "Nov");
                b.setValue(mm.getRecordNoviembre(), "Ventas", "Dic");
                JFreeChart grafica = ChartFactory.createBarChart("Ventas", "Meses", "Numero de ventas", b, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot graficaPlot = grafica.getCategoryPlot();
                graficaPlot.setRangeGridlinePaint(Color.BLUE);
                ChartPanel barPanel = new ChartPanel(grafica);
                this.v.pnl_mostrarGrafica.removeAll();
                this.v.pnl_mostrarGrafica.add(barPanel, BorderLayout.CENTER);
                this.v.pnl_mostrarGrafica.setVisible(false);
                this.v.pnl_mostrarGrafica.setVisible(true);
                
                mostrarFilechooser();
                break;

            case btn_empleMovi:
                this.v.pnl_contenedorDerechoMovimientos.removeAll();
                this.v.pnl_contenedorDerechoMovimientos.add(this.v.pnl_contenedorDerecho, BorderLayout.CENTER);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(false);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(true);
                DefaultCategoryDataset bE = new DefaultCategoryDataset();

                Iterator it;
                it = mm.getCrews().iterator();
                while (it.hasNext()) {
                    Crew c = (Crew) it.next();
                    System.out.println("" + c.getEmail().toString());
                    bE.setValue(mm.getConexionesCount(c.getEmail().toString()), c.getEmail().toString(), c.getEmail().toString());
                }
                JFreeChart graficaEmpleado = ChartFactory.createBarChart("Conexiones", "Meses", "Numero de ventas", bE, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot graficaPlotEmpleado = graficaEmpleado.getCategoryPlot();
                graficaPlotEmpleado.setRangeGridlinePaint(Color.BLUE);
                ChartPanel barPanelEmpleado = new ChartPanel(graficaEmpleado);
                this.v.pnl_mostrarGrafica.removeAll();
                this.v.pnl_mostrarGrafica.add(barPanelEmpleado, BorderLayout.CENTER);
                this.v.pnl_mostrarGrafica.setVisible(false);
                this.v.pnl_mostrarGrafica.setVisible(true);
                mostrarFilechooser();
                break;

            case btn_productoMovi:
                this.v.pnl_contenedorDerechoMovimientos.removeAll();
                this.v.pnl_contenedorDerechoMovimientos.add(this.v.pnl_contenedorDerecho, BorderLayout.CENTER);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(false);
                this.v.pnl_contenedorDerechoMovimientos.setVisible(true);
                DefaultCategoryDataset bP = new DefaultCategoryDataset();

                Iterator itP;
                itP = mm.getProducts().iterator();
                while (itP.hasNext()) {
                    Product p = (Product) itP.next();
                    System.out.println("" + p.getName());
                    bP.setValue(mm.getProductCount(p.getName().toString()), p.getName().toString(), p.getName().toString());
                }
                JFreeChart graficaProducto = ChartFactory.createBarChart("Productos Vendidos", "Productos", "Ventas", bP, PlotOrientation.HORIZONTAL, false, true, false);
                CategoryPlot graficaPlotProducto = graficaProducto.getCategoryPlot();
                graficaPlotProducto.setRangeGridlinePaint(Color.BLUE);
                ChartPanel barPanelProducto = new ChartPanel(graficaProducto);
                this.v.pnl_mostrarGrafica.removeAll();
                this.v.pnl_mostrarGrafica.add(barPanelProducto, BorderLayout.CENTER);
                this.v.pnl_mostrarGrafica.setVisible(false);
                this.v.pnl_mostrarGrafica.setVisible(true);
                mostrarFilechooser();
                break;
                
            case btn_configMovimientos:
                
                break;
            case btn_abrirFilechooser:
        
                break;
            case btn_informe:
                this.pdf.generateInforme();
                break;
        }
    }

    public void mostrarFilechooser() {
        this.v.pnl_contenedorInferiorMovimientos.add(this.v.pnl_filechooser, BorderLayout.CENTER);
        this.v.pnl_contenedorInferiorMovimientos.setVisible(false);
        this.v.pnl_contenedorInferiorMovimientos.setVisible(true);
        
    }

}

