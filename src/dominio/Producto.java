
package dominio;

import java.util.*;

public class Producto {
    private ArrayList<Categoria> listaCategorias;
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.listaCategorias = new ArrayList<Categoria>();
        this.nombre = nombre;
        this.precio = precio;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listCate){
        this.listaCategorias=listCate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    
}
