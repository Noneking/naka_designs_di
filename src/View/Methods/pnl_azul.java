/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Methods;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author MrDrulix
 */
public class pnl_azul extends JPanel {
	// Atributo que guardara la imagen de Background que le pasemos.
	private Image background;
 
	// Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
	public void paintComponent(Graphics g) {
                setBackground();
		/* Obtenemos el tamaño del panel para hacer que se ajuste a este
		cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
		int width = this.getSize().width;
		int height = this.getSize().height;
                
		// Mandamos que pinte la imagen en el panel
		if (this.background != null) {
			g.drawImage(this.background, 0, 0, width, height, null);
		}
 
		super.paintComponent(g);
                System.out.println("Lo pinta");
	}
 
	// Metodo donde le pasaremos la dirección de la imagen a cargar.
	public void setBackground() {
		
		// Construimos la imagen y se la asignamos al atributo background.
		this.setOpaque(false);
		this.background = new ImageIcon(getClass().getResource("/IMG/azulRuidoso.png")).getImage();
                System.out.println("Se mete imagen --*--*--");
	}
}
