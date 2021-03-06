/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23;

import java.text.DecimalFormat;

/**
 *
 * @author andre
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     //Escribirimos el orden de ordenamiento
    //utilizams el decimalformat para no tener problemas con los decimales de la edad
    public String compare(){
        return nombre + ","+apellido +","+new DecimalFormat("0000").format(edad);
    }
    @Override
    public int compareTo(Persona o) {
        return  this.compare().compareTo(o.compare());
       }

    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
   

    
    
    
    
    
}
