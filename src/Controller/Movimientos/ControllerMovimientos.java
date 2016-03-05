/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import Controller.Controller_Main;
import Facade.Facade;
import Hibernate.POJOs.Bookmark;
import Hibernate.POJOs.Crew;
import Model.Model_Movimientos;
import View.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.text.View;
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
    
    public void initMovimientosListeners(Main v){
        this.v = v;
        //boton home
        this.v.btn_home.setActionCommand("btn_home");
        this.v.btn_home.addActionListener(this);
        //boton ventas
        this.v.btn_ventasMovi.setActionCommand("btn_ventasMovi");
        this.v.btn_ventasMovi.addActionListener(this);
        this.v.pnl_mostrarGrafica.setLayout(new BorderLayout());
        this.v.btn_empleMovi.setActionCommand("btn_empleMovi");
        this.v.btn_empleMovi.addActionListener(this);
        
        mm = new Model_Movimientos();
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
                 break;
        }
    }
    
}
