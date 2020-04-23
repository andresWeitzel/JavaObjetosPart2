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
public class OrigenBebidaSinAzucar {
    private String pais;
    private String ciudad;
    private String fecha_extraccion;
    private String tipo_recurso;//Natural/Artificial

    public OrigenBebidaSinAzucar(String pais, String ciudad, String fecha_extraccion, String tipo_recurso) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.fecha_extraccion = fecha_extraccion;
        this.tipo_recurso = tipo_recurso;
    }

    public String getTipo_recurso() {
        return tipo_recurso;
    }

    public void setTipo_recurso(String tipo_recurso) {
        this.tipo_recurso = tipo_recurso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha_extraccion() {
        return fecha_extraccion;
    }

    public void setFecha_extraccion(String fecha_extraccion) {
        this.fecha_extraccion = fecha_extraccion;
    }

    @Override
    public String toString() {
        return " OrigenBebidaSinAzucar{" + "pais=" + pais + ", ciudad=" + ciudad + ", fecha_extraccion=" + fecha_extraccion + ", tipo_recurso=" + tipo_recurso + '}';
    }
    
    
}
