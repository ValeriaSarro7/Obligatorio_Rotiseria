//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import dominio.Cliente;
import dominio.Sistema;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.ArchivoLectura;

public class Rotiseria {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        String[] opcion = new String[]{"Nuevo", "Anterior", "Cargar"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Cómo desea abrir el programa?", "Inicio", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcion, opcion[0]);
        if (respuesta == 0) {
            Sistema sistema = new Sistema();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
            ventanaPrincipal.setVisible(true);
        } else if (respuesta == 1) {
            FileInputStream archivo = new FileInputStream("salida");
            ObjectInputStream in = new ObjectInputStream(archivo);
            Sistema sistema = (Sistema) in.readObject();
            in.close();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
            ventanaPrincipal.setVisible(true);
        } else if (respuesta == 2) {
            /* ArchivoLectura archivoEntrada = new ArchivoLectura("entrada.csv");
            while (archivoEntrada.hayMasLineas()) {
                String[] line = archivoEntrada.linea().split(";");
                int numeroDeObjetosACrear;
                if(line.length == 1){
                
                };
                // caso numero de following lines
                numeroDeObjetosACrear = Integer.parseInt(line[0]);

            } */

        }
        
        /* 
        ArchivoLectura l = new ArchivoLectura();
    int tipoDeObjetoACrear = -1; // 0 es users, 1 es categorias, 2 es productos
    while (l.hayMasLineas()) {
      String[] line = l.line().split(";");
      if (line.length == 1) {
       //dentro caso numero de following lines 
        tipoDeObjetoACrear++;
      } else {
       switch (tipoDeObjetoACrear) {
         case 0:
           // caso user 
           Cliente cli = new Cliente(line[0], line[1], line[2]);
           //Haces lo que tengas que hacer con el cliente nuevo
           break;
         case 1:
           
       }
      }
      
    }
        */

    }

}
