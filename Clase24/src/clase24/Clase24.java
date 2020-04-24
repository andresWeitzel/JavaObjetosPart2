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
public class Clase24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ENUMERADOS
        EstadoCivil estado=EstadoCivil.SOLTERO;//Es del tipo enumerado
        Genero genero=Genero.MASCULINO;
        
        //estado=EstadoCivil.valueOf("Soltero");//Error, es otra palabra
        estado=EstadoCivil.valueOf("SOLTERO");//cORRECTO, MISMO ENUMERADO
        
        //Recorrer todo un enumerado, me devuelve un vector
        System.out.println("\n--Enumerados de la clase EstadoCivil--");
        for(EstadoCivil e: EstadoCivil.values()){            
            System.out.println(e);
        }
        
        System.out.println("\n--Enumerados de la clase Genero--");           
        for(Genero e: Genero.values()){
            System.out.println(e);
        }
        
        System.out.println("\n--Objetos de la clase Persona--");
        Persona persona1=new Persona("Jaime", EstadoCivil.CASADO, Genero.FEMENINO);
        System.out.println(persona1);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
