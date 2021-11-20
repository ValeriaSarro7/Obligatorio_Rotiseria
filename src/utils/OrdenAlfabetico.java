//Agustina Chaparro 194551 Valeria Sarro 229531
package utils;

import dominio.Categoria;
import java.util.Comparator;

public class OrdenAlfabetico implements Comparator <Categoria>{
    public int compare (Categoria unaCategoria, Categoria otraCategoria){
        int dif=unaCategoria.getNombre().toUpperCase().compareTo(otraCategoria.getNombre().toUpperCase()); 
        if(dif==0){
            dif=unaCategoria.getPrioridad()-(otraCategoria.getPrioridad());
        }
    return dif;
    }
}
