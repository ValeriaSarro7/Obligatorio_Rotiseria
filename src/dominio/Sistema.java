package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
;
import java.util.*;


public class Sistema implements Serializable {

    // por que lista cliente tiene que ser un hashmap? 
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Producto> listaProductos;
    private Cliente clienteSeleccionado;
    private PropertyChangeSupport pCS1;
    private PropertyChangeSupport pCS2;


    public Sistema() {
        listaClientes = new ArrayList<Cliente>();
        listaCategorias = new ArrayList<Categoria>();
        listaPedidos = new ArrayList<Pedido>();
        listaProductos = new ArrayList<Producto>();
        this.pCS1=new PropertyChangeSupport(this);
        this.pCS2=new PropertyChangeSupport(this);
        

    }
    public Cliente getClienteSeleccionado(){
        return this.clienteSeleccionado;
    }
    
    public void setClienteSeleccionado(Cliente unCliente){
        this.clienteSeleccionado=unCliente;
        pCS2.firePropertyChange("nombre", "previo", "nuevo" );
    }
    
    public void agregarListenerpCS1(PropertyChangeListener listener){
       pCS1.addPropertyChangeListener(listener);
    }
    
    public void agregarListenerpCS2(PropertyChangeListener listener){
       pCS2.addPropertyChangeListener(listener);
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    // no es redundante pasar el nombre como string y como atributo de cliente? 
    public void setListaClientes(Cliente cliente) {
        this.getListaClientes().add(cliente);
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

    public void setListaCategorias(Categoria categoria) {
        this.getListaCategorias().add(categoria);   
        pCS1.firePropertyChange("valor", "previo", "nuevo");
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(Pedido unPedido) {
        this.getListaPedidos().add(unPedido);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Producto unProducto) {
        this.getListaProductos().add(unProducto);
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
    
    public String[] obtenerNombresClientes(){
        String[] array= new String[this.getListaClientes().size()];
        int cont=0;
        for(Cliente unCliente: this.getListaClientes()){
            array[cont]=unCliente.getNombre();
            cont++;
        }
        return array;
    }

    public String[] filtrarLista(String filtro) {
        String lis = "";
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            if (this.getListaClientes().get(i).toString().toUpperCase().contains(filtro.toUpperCase())) {
                lis += this.getListaClientes().get(i).toString() + ";";
            }
        }
        return lis.split(";");
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
    
    public String[] arrayPedidos(ArrayList<Pedido> listaPedidos){
        String[] lista=new String[listaPedidos.size()];
        int cont=0;
        Iterator<Pedido> it=listaPedidos.iterator();
        while(it.hasNext()){
            Pedido unP=it.next();
            lista[cont]=unP.toString();
            cont++;
        }
        return lista;
    }
    
    public String[] arrayProductos(ArrayList<Producto> listaProductos){
        String[] lista=new String[listaProductos.size()];
        int cont=0;
        Iterator<Producto> it=listaProductos.iterator();
        while(it.hasNext()){
            Producto unP=it.next();
            lista[cont]=unP.toString();
            cont++;
        }
        return lista;
    }
    public String[] arrayCategorias(){
        String[] lista=new String[getListaCategorias().size()];
        int cont=0;
        Iterator<Categoria> it=getListaCategorias().iterator();
        while(it.hasNext()){
            Categoria unaC=it.next();
            lista[cont]=unaC.toString();
            cont++;
        }
        return lista;
    }
    public void agregarCategoriasProducto(List <String> categorias, Producto unProducto){
        for(int i=0; i<categorias.size(); i++){
            Iterator<Categoria> it=getListaCategorias().iterator();
            Categoria unaC = null;
            boolean encontre=false;
            while(it.hasNext()&&!encontre){
                unaC=it.next();
                if(unaC.getNombre().equalsIgnoreCase(categorias.get(i))){
                    encontre=true;
                    unProducto.setListaCategorias(unaC);
                }
                    
            }
        }
    }

}
