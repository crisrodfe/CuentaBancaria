
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CrisRodFe
 */
public class Serializar {    
	private ObjectOutputStream oos;	
	private ObjectInputStream ois;

/**
 * Lee los objetos guardados.
 * @param archivo
 * @return 
 */
    public Object leerObjeto(String archivo) {
        Object lectura = null;
            try {
                ois = new ObjectInputStream(new FileInputStream(archivo));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lectura = ois.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        return lectura;
}
 /**
  * Graba un objeto tipo array introducido por parámetro.
  * @param array
  * @param archivo 
  */   
    public void grabarObjeto(ArrayList array, String archivo){
        File file = new File(archivo);
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.writeObject(array);
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
