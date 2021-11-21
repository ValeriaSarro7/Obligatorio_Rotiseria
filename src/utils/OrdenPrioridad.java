//Agustina Chaparro 194551 Valeria Sarro 229531
package utils;
import dominio.Categoria;
import java.util.Comparator;

public class OrdenPrioridad implements Comparator <Categoria>{
    public int compare (Categoria unaCategoria, Categoria otraCategoria){
        int dif=unaCategoria.getPrioridad()-(otraCategoria.getPrioridad()); 
        if(dif==0){
            dif=unaCategoria.getNombre().toUpperCase().compareTo(otraCategoria.getNombre().toUpperCase());
        }
    return dif;
    }
}