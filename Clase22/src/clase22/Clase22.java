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
        
       /* System.out.println("**Menu de opciones**");
        System.out.println("Lista_con_duplicados");//HashSet
        System.out.println("Lista_sin_duplicados");//LinkedHashSet
        System.out.println("Lista_sin_duplicados_rapida");//HashSet
        System.out.println("Lista_sin_duplicados_ordenada");//TreeSet      
        //Utilizamos colas y encolamos la lista de elementos ya existentes
        System.out.println("Cola_de_elementos");//ArrayDeque
        //Utilizamos pilas y empilamos los elementos ya existentes
        System.out.println("Pila_de_elementos");//Stack    
        */
        //Automatizamos las opciones que tenemos del mapa, en vez de escribir c/u de ellas
        //pedimos el conjunto de llaves, la recorremos con el foreach y las mostramos 
        MapaCollections.getMapa().keySet().forEach(System.out::println);
        
        System.out.println("\n--¿Escriba tal cual el elemento que desee?");
        String tipoLista=new Scanner(System.in).next();
        
        //Obtenemos la lista creada en MapaCollection a traves del metodo getMapa
        //Recordar que este al ser un metodo estatico no necesito crear una objeto
        //Casteamos todos los objetos que traemos con el constructor al tipo de dato declarado en la clase padre(Collection)
        nombres=(Collection)Class
                                 .forName(MapaCollections
                                 .getMapa()
                                 .get(tipoLista))
                                 .getConstructor(null)
                                 .newInstance();
        
        nombres.add("Jose");
        nombres.add("Antonia");
        nombres.add("Marcelo");
        nombres.add("Marcela");
        nombres.add("Juanjo");
        nombres.add("Pepito");
        nombres.add("Sarasa");
        nombres.add("Marcos");
        nombres.add("Julieta");
        
        nombres.forEach(System.out::println);
    }
    
    
}
