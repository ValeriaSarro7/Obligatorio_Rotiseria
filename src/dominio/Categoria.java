//Agustina Chaparro 194551 Valeria Sarro 229531
package dominio;

import java.util.*;

public class Categoria {
    private String nombre;
    private int prioridad;
    private String detalle;

    public Categoria(String nombre, int prioridad, String detalle) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String descripcion) {
        this.nombre = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
}
