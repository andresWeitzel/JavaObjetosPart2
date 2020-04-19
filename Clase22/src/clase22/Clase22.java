/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Clase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
         System.out.println("\n☻☻FRAMEWORK COLLECTION☻☻\n");
        System.out.println("♠♠Interfaz List♠♠\n");
        
        //  Collection sera nuestra VARIABLE DE REFERENCIA, en donde se puede
        // implemenmtar las clases e interfaces que se desee, respetanto el framework
        // LA VARIABLE DE REFERENCIA HAE REFERENCIA A LA INTERFAZ COLLECTION
        Collection nombres=new ArrayList();
        
        System.out.println("Ingrese si desea-->");
        System.out.println("*Lista con duplicados");//HashSet
        System.out.println("*Lista sin duplicados");//LinkedHashSet
        System.out.println("*Lista sin duplicados rapida");//HashSet
        System.out.println("*Lista sin duplicados ordenada");//TreeSet
        
        String tipoLista=new Scanner(System.in).next();
        
        nombres.add("Jose");
        nombres.add("Antonia");
        nombres.add("Marcelo");
        nombres.add("Marcela");
        nombres.add("Juanjo");
        nombres.add("Pepito");
        nombres.add("Sarasa");
        nombres.add("Marcos");
        nombres.add("Julieta");
    }
    
    
}
