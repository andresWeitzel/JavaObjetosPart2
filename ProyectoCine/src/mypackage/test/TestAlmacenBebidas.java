/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.test;

import mypackage.entities.BebidasConAzucar;
import mypackage.entities.BebidasSinAzucar;
import mypackage.entities.OrigenBebidaSinAzucar;

/**
 *
 * @author andre
 */
public class TestAlmacenBebidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos un array para almacenar los productos del almacen(bebidas) se
        //almacenan en una estanteria(seran las columnas de los arrays)
        System.out.println("\n♦♦Almacen Rayito de Sol♦♦\n");
        System.out.println("Primera Estanteria\n");
    
    //Deaclaramos los arrays y asignamos en memoria los mismos
    BebidasSinAzucar[] BebidasSinAzucar=new BebidasSinAzucar[30];
    BebidasConAzucar[] BebidasConAzucar=new BebidasConAzucar[30];
    
    //Inicializamos los elemntos del primer array
    BebidasSinAzucar[0]=new BebidasSinAzucar(new OrigenBebidaSinAzucar("Italia", "Venecia", "28-03-2019", "Natutal"), "75875hf",300, 3);
    BebidasSinAzucar[1]=new BebidasSinAzucar(new OrigenBebidaSinAzucar("Brasil", "Santa Catarina", "08-06-2020", "Artificial"), "hdfhdf454",5600, 59);
    BebidasSinAzucar[2]=new BebidasSinAzucar(new OrigenBebidaSinAzucar("Argentina", "Cordoba", "12-08-2019", "Natutal"), "nikfgf34",743500, 7485);
    BebidasSinAzucar[3]=new BebidasSinAzucar(new OrigenBebidaSinAzucar("Uruguay", "Punta Ancha", "11-02-2020", "Natutal"), "jin787",1900, 890);
      
    //Recorremos nuestro primer array, utilizamos una increible forma de recorrer el array indicano la posicion de cada elemto, analizar bien
     for (int i = 0; i < BebidasSinAzucar.length; i++){
         //Se imprimira en consola siempre y cuando la posicion no sea nula   
         if(BebidasSinAzucar[i] != null){
                System.out.println("Elemento en la posicion nro " + i + " del Array BebidasSinAzucar: " + BebidasSinAzucar[i]);
                }
            }
     
        System.out.println("\nSegunda Estanteria\n");
        
        //Deaclaramos los arrays y asignamos en memoria los mismos
        //Inicializamos los elemntos del segundo array
    BebidasConAzucar[0]=new BebidasConAzucar(05, true, "frjnnis8", 5678, 78);
    BebidasConAzucar[1]=new BebidasConAzucar(07, false, "fginf86", 953, 130);
    BebidasConAzucar[2]=new BebidasConAzucar(12, true, "kokmdkjfni", 4578, 192);
   
    for (int i = 0; i < BebidasConAzucar.length; i++){  
         if(BebidasConAzucar[i] != null){
                System.out.println("Elemento en la posicion nro " + i + " del Array BebidasConAzucar: " + BebidasConAzucar[i]);
                }
            }
          
    
    
   
    }
    
}
