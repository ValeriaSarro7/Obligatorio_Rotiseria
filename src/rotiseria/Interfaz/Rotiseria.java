//Agustina Chaparro 194551 Valeria Sarro 229531
package rotiseria.Interfaz;

import dominio.Categoria;
import dominio.Cliente;
import dominio.Producto;
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
            ArchivoLectura archivoEntrada = new ArchivoLectura("entrada.csv");
            Sistema sistema = new Sistema();
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
            int tipoDeObjetoACrear = -1; // 0 es clientes, 1 es categorias, 2 es productos
            while (archivoEntrada.hayMasLineas()) {
                String[] line = archivoEntrada.linea().split(";");
                if (line.length == 1) {
                    tipoDeObjetoACrear++;
                } else {
                    switch (tipoDeObjetoACrear) {
                        case 0:
                            Cliente cli = new Cliente(line[0], line[1], line[2]);
                            sistema.agregarClientesALista(cli);
                            break;
                        case 1:
                            Categoria cat = new Categoria(line[0], Integer.parseInt(line[2]), line[1]);
                            sistema.agregarCategoriaALista(cat);
                            break;
                        case 2:
                            Producto prod = new Producto(line[0], Integer.parseInt(line[1]));
                            ArrayList<Categoria> categorias = new ArrayList<Categoria>();
                            categorias.add(sistema.darCategoria(line[2]));
                            sistema.agregarProductoaLista(prod, categorias);
                            break;
                    }
                }
            }
            ventanaPrincipal.setVisible(true);
        }
    }

}
