/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

/**
 *
 * @author andre
 */
public class Persona {
    private String nombre;
    private EstadoCivil estado;
    private Genero genero;

    public Persona(String nombre, EstadoCivil estado, Genero genero) {
        this.nombre = nombre;
        this.estado = estado;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", estado=" + estado + ", genero=" + genero + '}';
    }
    
    
}
