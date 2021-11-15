package dominio;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.*;
;
import java.util.*;


public class Sistema implements Serializable {

    // por que lista cliente tiene que ser un hashmap? 
    private HashMap<String, Cliente> listaClientes;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<Pedido> listaPedidos;
    private ArrayList<Producto> listaProductos;
    private PropertyChangeSupport pCS1;


    public Sistema() {
        listaClientes = new HashMap<String, Cliente>();
        listaCategorias = new ArrayList<Categoria>();
        listaPedidos = new ArrayList<Pedido>();
        listaProductos = new ArrayList<Producto>();
        this.pCS1=new PropertyChangeSupport(this);

    }
    
    public void agregarListenerpCS1(PropertyChangeListener listener){
       pCS1.addPropertyChangeListener(listener);
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

    public void setListaCategorias(Categoria categoria) {
        this.getListaCategorias().add(categoria);
        
        for(Categoria unaCategoria:this.getListaCategorias()){
            System.out.println(unaCategoria);
        }
        
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
