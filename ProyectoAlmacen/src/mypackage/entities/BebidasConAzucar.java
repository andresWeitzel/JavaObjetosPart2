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
public class BebidasConAzucar extends Bebidas {
    
    private float porcentaje_azucar;
    private boolean promocion;//si la tiene tendrá un descuento del 10% en el precio.

    public BebidasConAzucar(float porcentaje_azucar, boolean promocion, String id, float volumen, float precio) {
        super(id, volumen, precio);
        this.porcentaje_azucar = porcentaje_azucar;
        this.promocion = promocion;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    public float getPorcentaje_azucar() {
        return porcentaje_azucar;
    }

    public void setPorcentaje_azucar(float porcentaje_azucar) {
        this.porcentaje_azucar = porcentaje_azucar;
    }

    @Override
    public String toString() {
        return super.toString()+" BebidasConAzucar{" + "porcentaje_azucar=" + porcentaje_azucar + "% , promocion=" + promocion + '}';
    }
    
    
}
