/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

/**
 *
 * @author andre
 */
public class Vuelo {
    private String nombre;
    private int cantidadPasajes;

    public Vuelo(String nombre, int cantidadPasajes) {
        this.nombre = nombre;
        this.cantidadPasajes = cantidadPasajes;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "nombre=" + nombre + ", cantidadPasajes=" + cantidadPasajes + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }
    
    
}
