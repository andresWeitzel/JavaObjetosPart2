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
public class BebidasSinAzucar extends Bebidas{
    
    private OrigenBebidaSinAzucar origen;

    public BebidasSinAzucar(OrigenBebidaSinAzucar origen, String id, float volumen, float precio) {
        super(id, volumen, precio);
        this.origen = origen;
    }

    public OrigenBebidaSinAzucar getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenBebidaSinAzucar origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString()+" BebidasSinAzucar{" + "origen=" + origen + '}';
    }
    
    
    
    
}
