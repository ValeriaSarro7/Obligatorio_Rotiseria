//Agustina Chaparro 194551 Valeria Sarro 229531
package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
import java.util.*;

public class Sistema implements Serializable {

    // por que lista cliente tiene que ser un hashmap? 
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Producto> listaProductos;
    private Cliente clienteSeleccionado;
    private ArrayList<Producto> listaProdcutosSeleccionados;
    private PropertyChangeSupport pCS1;


    public Sistema() {
        listaClientes = new ArrayList<Cliente>();
        listaCategorias = new ArrayList<Categoria>();
        listaPedidos = new ArrayList<Pedido>();
        listaProductos = new ArrayList<Producto>();
        listaProdcutosSeleccionados = new ArrayList<Producto>();
        clienteSeleccionado = new Cliente("","","");
        this.pCS1=new PropertyChangeSupport(this);
    }
    public Cliente getClienteSeleccionado(){
        return this.clienteSeleccionado;
    }
    
    public void setClienteSeleccionado(Cliente unCliente){
        this.clienteSeleccionado=unCliente;
        pCS1.firePropertyChange("nombre", "previo", "nuevo" );
    }
    
    public void setListaCategorias(ArrayList<Categoria> lista){
        this.listaCategorias=lista;
    }
    public void setListaClientes(ArrayList<Cliente> lista){
        this.listaClientes=lista;
    }
    public void setListaPedidos(ArrayList<Pedido> lista){
        this.listaPedidos=lista;
    }
    public void setListaProductos(ArrayList<Producto> lista){
        this.listaProductos=lista;
    }

    public ArrayList<Producto> getListaProdcutosSeleccionados() {
        return listaProdcutosSeleccionados;
    }

    public void setListaProdcutosSeleccionados(ArrayList<Producto> listaProdcutosSeleccionados) {
        this.listaProdcutosSeleccionados = listaProdcutosSeleccionados;
    }
    
    public void agregarListenerpCS1(PropertyChangeListener listener){
       pCS1.addPropertyChangeListener(listener);
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void agregarClientesALista(Cliente cliente) {
        this.getListaClientes().add(cliente);
    }
    
    public void agregarPedidoALista(Pedido unP){
        this.getListaPedidos().add(unP);
    }

    public Cliente darCliente(String nombre) {
        Cliente cliente=null;
        for(Cliente unCliente:this.getListaClientes()){
            if(unCliente.getNombre().equalsIgnoreCase(nombre)){
                cliente=unCliente;
            }
        }
        return cliente;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void agregarCategoriaALista(Categoria categoria) {
        this.getListaCategorias().add(categoria);   
        pCS1.firePropertyChange("valor", "previo", "nuevo");
    }
    public Categoria darCategoria(String nombreCategoria){
        Categoria categoria=null;
        for(Categoria unaCategoria: this.getListaCategorias()){
            if(unaCategoria.getNombre().equalsIgnoreCase(nombreCategoria)){
                categoria=unaCategoria;
            }
        }
        return categoria;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarProductoaLista(Producto unProducto, ArrayList <Categoria> categoriasProducto) {
        this.getListaProductos().add(unProducto);
        unProducto.setListaCategorias(categoriasProducto);
        pCS1.firePropertyChange("valor", "previo", "nuevo");
    }

    public boolean existeCliente(String nombre) {
        boolean existe=false;
        for(Cliente unCliente:this.getListaClientes()){
            if(unCliente.getNombre().equalsIgnoreCase(nombre)){
                existe=true;
            }
        }
        return existe;
    }
    public boolean existeCategoria(String nombreCategoria){
        boolean existe=false;
        Iterator<Categoria>it=this.getListaCategorias().iterator();
        while(it.hasNext()){
            Categoria cat=it.next();
            if(cat.getNombre().equalsIgnoreCase(nombreCategoria)){
                existe=true;
            }
        }
        return existe;
    }
    public boolean existeProducto(String nombreProd){
        boolean existe=false;
        Iterator<Producto>it=this.getListaProductos().iterator();
        while(it.hasNext()){
            Producto prod=it.next();
            if(prod.getNombre().equalsIgnoreCase(nombreProd)){
                existe=true;
            }
        }
        return existe;
    }

    public ArrayList<Cliente> filtrarLista(String filtro) {
        ArrayList<Cliente> lis = new ArrayList<Cliente>();
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            if (this.getListaClientes().get(i).getNombre().toUpperCase().contains(filtro.toUpperCase())) {
                lis.add(this.getListaClientes().get(i));
            }
        }
        return lis;
    }
    
    public Pedido encontrarPedido(int numero){
        Iterator<Pedido> it=getListaPedidos().iterator();
        Pedido unP = null;
        boolean encontre=false;
        while(it.hasNext()&&!encontre){
            unP=it.next();
            if(unP.getNumero()==numero){
                encontre=true;
            }
        }
        return unP;
    }
    
    public ArrayList <Categoria> agregarCategoriasProducto(int [] categorias, Producto unProducto){
        ArrayList categoriasProducto= new ArrayList <Categoria> ();
        for(int i=0; i<categorias.length; i++){
            Categoria unaC=getListaCategorias().get(categorias[i]);
            categoriasProducto.add(unaC);
        }
        return categoriasProducto;
    }

    public Producto darProducto(String producto) {
        Producto prod=null;
        for(Producto unProducto:this.getListaProductos()){
            if(unProducto.getNombre().equalsIgnoreCase(producto)){
                prod=unProducto;
            }
        }
        return prod;
    }
    public void agregarAListaProductosSeleccionados(Producto unP){
        this.getListaProdcutosSeleccionados().add(unP);
        pCS1.firePropertyChange("valor", "previo", "nuevo");
    }
    public int precioPedidoEnCurso(){
        int total=0;
        for(Producto unP: this.getListaProdcutosSeleccionados()){
            total+=unP.getPrecio();
        }
        return total;
    }
}
