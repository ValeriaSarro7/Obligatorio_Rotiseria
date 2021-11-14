package dominio;

import java.io.*;
;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;
import java.util.*;



public class Sistema implements Serializable {

    // por que lista cliente tiene que ser un hashmap? 
    private HashMap<String, Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Producto> listaProductos;

    public Sistema() {
        listaClientes = new HashMap<String, Cliente>();
        listaCategorias = new ArrayList<Categoria>();
        listaPedidos = new ArrayList<Pedido>();
        listaProductos = new ArrayList<Producto>();
    }

    public HashMap<String, Cliente> getListaClientes() {
        return listaClientes;
    }

    // no es redundante pasar el nombre como string y como atributo de cliente? 
    public void setListaClientes(String nombre, Cliente cliente) {
        this.getListaClientes().put(nombre, cliente);
    }

    public Cliente darCliente(String nombre) {
        return this.getListaClientes().get(nombre);
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean existeCliente(String nombre, String direccion, String numero) {
        boolean existe = false;
        String clave = "";
        Iterator<String> it = this.getListaClientes().keySet().iterator();
        while (it.hasNext() && !existe) {
            clave = (String) it.next();
            if (this.darCliente(clave).getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                existe = true;
            }
        }
        /* if (!existe) {
            new Cliente(nombre, direccion, numero);
        }*/
        return existe;
    }

    public String[] obtenerClaveClientes() {
        return (this.getListaClientes().keySet().toArray(new String[this.getListaClientes().size()]));
    }

    public Cliente[] obtenerClientes() {
        return (this.getListaClientes().values().toArray(new Cliente[this.getListaClientes().size()]));
    }

    public Cliente encontrarCliente(String unNombre) {
        return this.getListaClientes().get(unNombre);
    }

    public String[] filtrarLista(String filtro) {
        String lis = "";
        for (int i = 0; i < obtenerClaveClientes().length; i++) {
            if (obtenerClaveClientes()[i].toUpperCase().contains(filtro.toLowerCase())) {
                lis += obtenerClaveClientes()[i] + ";";
            }
        }
        return lis.split(";");
    }

    public void guardarCliente(String clave) throws FileNotFoundException, IOException {
        Cliente unCliente = encontrarCliente(clave);
        FileOutputStream cliente = new FileOutputStream("Cliente elegido");
        ObjectOutputStream out = new ObjectOutputStream(cliente);
        out.writeObject(unCliente);
        out.close();
    }

}
