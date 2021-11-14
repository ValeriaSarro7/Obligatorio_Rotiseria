
package rotiseria.Interfaz;

import dominio.Sistema;
import java.io.*;

public class Rotiseria  {

    public static void main(String[] args) {
        Sistema sistema= new Sistema();
        VentanaPrincipal ventanaPrincipal= new VentanaPrincipal(sistema);
        ventanaPrincipal.setVisible(true);
        
    }
    
}
