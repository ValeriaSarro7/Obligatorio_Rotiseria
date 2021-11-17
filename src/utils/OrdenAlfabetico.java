/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
