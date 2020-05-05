/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26;

/**
 *
 * @author andre
 */
public class GeneratorException {
    
    public static void generator(){
        //Estoy reindicando un valor del array para una posicion que no existe
        int vector[]= new int[5];
        vector[10]=20;
    }
    public  static void generator(boolean x){
            //Si al paramettro se le pasa true entonces entra al if, por ende se ejecuta 
            //el bloque y se produce la exception
        if(x){  
            System.out.println(10/0);
        }
    }
    
    public static void generator(String nro){
        //Si se ingresa un valor tipo 10x se produce una exeption   
        Integer.parseInt(nro);
    }
    
}
