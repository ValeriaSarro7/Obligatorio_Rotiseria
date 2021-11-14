
package dominio;

import java.util.*;

public class Pedido {
    
    private ArrayList<Producto> listaProdcutos;
    private int numero;
    private Cliente unCliente;
    private int precioTotal;
    private String observaciones;

    public Pedido(ArrayList<Producto> listaProdcutos, int numero, Cliente unCliente, int precioTotal, String observaciones) {
        this.listaProdcutos = listaProdcutos;
        this.numero = numero;
        this.unCliente = unCliente;
        this.precioTotal = precioTotal;
        this.observaciones = observaciones;
    }
    
    public ArrayList<Producto> getListaProdcutos() {
        return listaProdcutos;
    }

    public void setListaProdcutos(ArrayList<Producto> listaProdcutos) {
        this.listaProdcutos = listaProdcutos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Override
    public String toString(){
        return this.getNumero()+"\n"+getUnCliente();
    }
    
}
