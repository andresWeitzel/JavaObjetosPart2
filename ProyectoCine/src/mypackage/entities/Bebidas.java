/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.entities;

/**
 *
 * @author andre
 */
public class Bebidas {
    
    private String id;
    private float volumen;
    private float precio;

    public Bebidas(String id, float volumen, float precio) {
        this.id = id;
        this.volumen = volumen;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return " Bebidas{" + "id=" + id + ", volumen=" + volumen + "CC, precio= $" + precio + '}';
    }
    
    
    
    
    
}
