/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author andre
 */
public class TestClase25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //*******************EXCEPTIONS**************************
         
        /*
        //Estructura try-catch-finally

        try{
            -Colocar todas las sentencias que puedan lanzar un error
            -Costo de hardware
            -Si hay un error se detiene la ejecucion del bloque y pasa al bloque
                catch   
        
        }catch(Exception e){
            -Solo se ejecuta en caso de que haya un error en el try
            -El programa no se detiene
            -Se recibe como parametro un objeto del tipo Exception con la
                description del error.
            -Terminado este control salta al bloque finally si es que existe
        
        }finally{
            -Es opcional
            -Se ejecuta ocurra un error o no.
            -No se tiene scope(alcance) de las variables declaradas, quedan destruidas
            -No se lo puede usar para cerrar conexiones
        }
     
        */
        /*
        try{
            System.out.println(10/0);
            System.out.println("Esta linea no se ejecuta");
            
        }catch(Exception e){
            System.out.println("Ocurrio un error!!");
            System.out.print("El error ha sido: ");
            System.out.println(e);
        
        }finally{
            System.out.println("El programa ha terminado!");
        }*/
        
        
        try{
           // GeneratorException.generator();
            GeneratorException.generator(true);
       
        }catch(Exception e){
            System.out.println("\nEl error es:");
            System.out.println(e);
        }
        
        
    }
        
    
}
