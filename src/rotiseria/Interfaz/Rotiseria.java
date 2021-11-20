//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import dominio.Sistema;
import java.io.*;
import javax.swing.JOptionPane;

public class Rotiseria  {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String[] opcion= new String[]{"Nuevo", "Anterior", "Cargar"};
        int respuesta=JOptionPane.showOptionDialog(null, "¿Cómo desea abrir el programa?","Inicio",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, opcion, opcion[0]);
        if(respuesta==0){
            Sistema sistema= new Sistema();
            VentanaPrincipal ventanaPrincipal= new VentanaPrincipal(sistema);
            ventanaPrincipal.setVisible(true);
        }else if(respuesta==1){
            FileInputStream archivo= new FileInputStream("salida");
            ObjectInputStream in=new ObjectInputStream(archivo);
            Sistema sistema=(Sistema)in.readObject();
            in.close();
            VentanaPrincipal ventanaPrincipal= new VentanaPrincipal(sistema);
            ventanaPrincipal.setVisible(true);
        }else if(respuesta==2){
            //leer de archivo
            
        }
        
        
    }
    
}
