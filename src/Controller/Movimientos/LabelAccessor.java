/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Movimientos;

import java.awt.Dimension;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author MrDrulix
 */
public class LabelAccessor extends JLabel implements PropertyChangeListener {

    //le establezco los parametros por decto que quiero que son 250x250
    private static final int PREFERRED_WIDTH = 300;//ancho
    private static final int PREFERRED_HEIGHT = 100;//alto
    File arch;
    public LabelAccessor(JFileChooser chooser) {//constructor del label al que ira en funcion de la imagen que se seleccione en el file chooser

        setVerticalAlignment(JLabel.CENTER);//aqui le digo donde se debe de ajustar la imagen dentro del label
        setHorizontalAlignment(JLabel.CENTER);//aqui le digo donde se debe de ajustar la imagen dentro del label
        chooser.addPropertyChangeListener(this);//lanzo un listener para poder "pedir permiso" para cambiar el file chooser
        setPreferredSize(new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT));//enviar ancho y algo por defecto 250x250
    }

    public void propertyChange(PropertyChangeEvent changeEvent) {//metodos implementorios de la clase LabelAccessory

        String changeName = changeEvent.getPropertyName();//coje el nombre del archivo seleccionado
        if (changeName.equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)) {//comprueba que es el archivo seleccionado en el filechooser
                
            File file = (File) changeEvent.getNewValue();//crea un objeto File y no entiendo muy bien que es lo que hace, lo preguntare en clase
            //creo q lo q hace es crear un archivo con el archivo seleccinado y lo almacena en "file"
            if (file != null) {//si se ha seleccionado un archivo
                this.arch = file;
                ImageIcon icon = new ImageIcon(file.getPath());//crea un objeto image icon al que se le pasa el archivo seleccioando

                if (icon.getIconWidth() > PREFERRED_WIDTH) {//si el ancho del archivo seleccionado es mas grande que el por defecto 250

                    icon = new ImageIcon(icon.getImage().getScaledInstance(PREFERRED_WIDTH, -1, Image.SCALE_DEFAULT));//le da el ancho por defecto

                    if (icon.getIconHeight() > PREFERRED_HEIGHT) {//si el alto es mas grande que 250

                        icon = new ImageIcon(icon.getImage().getScaledInstance(-1, PREFERRED_HEIGHT, Image.SCALE_DEFAULT));//se le onfigura el alto del archvo
                    }
                }
                setIcon(icon);//se lanza el icono al label
            }
        }
    }
    public File getArch(){
        return this.arch;
    }
}