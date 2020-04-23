/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author andre
 */
public class Clase23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //La particularidad de api stream es que nos permite utilizar le codigo
        //sql
        System.out.println("\n☻☻API STREAM☻☻\n");
        System.out.println("♠♠Interfaz List♠♠");
        System.out.println("\n**Listas**"); 
        
        List <Persona>lista1=new ArrayList();
       lista1.add(new Persona("Jose","Alvarez",45));
       lista1.add(new Persona("Jimena","perez",67));
       
       lista1.forEach(System.out::println);
       
       
         System.out.println("\n**Usando los metodos stream() y filter() para encontrar elementos**"); 
      //El metodo stream nos devuelve una implementacion de3 la interfaz stream
      //El metodo filter nos permite escribir un predicado de  una expresion lamda 
      //Dentro del filter hay una expresion booleana(llamada predicado(en este caso se utilizara el 
      //mismo nombre de la clase persona)) que la usamos para determminar si 
      //lo que tenemos dentro de la clase es parte de los resultados o no lo son
      //Usamos el equal ignorecase porque yo no se si dentro de la base de datos se respetan
      //o no las mayusculas
      
     
        System.out.println("--Personas cuyos nombres sean Jose(mayus/minus)--");
       //SELECT * FROM Persona WHERE nombre='Ana';
        lista1
              .stream()
              .filter(p->p.getNombre().equalsIgnoreCase("Jose"))
              .forEach(System.out::println);
      
      System.out.println("\n--Personas cuya edad sea mayor a 30 años--");
      //SELECT * FROM Persona WHERE edad >= 30;
      lista1
              .stream()
              .filter(persona->persona.getEdad() >= 30)
              .forEach(System.out::println);
              
      
        System.out.println("\n--Personas cuyos nombres sean Jose(mayus/minus) o Ana(mayus/minus)--");
         //SELECT * FROM Persona WHERE nombre='Ana' or nombre='Jose';
        lista1
              .stream()
              .filter(persona->persona.getNombre().equalsIgnoreCase("Jose") 
                      || persona.getNombre().equalsIgnoreCase("Ana"))
              .forEach(System.out::println);
        
         System.out.println("\n--Personas cuyos nombres comiencen con j (mayus/minus)--");
        //SELECT * FROM Personas WHERE nombre='j%'
        //Con el metodo startWith le indicamos que compare lo que comience con j, pero cmo
        //no sabemos si esta en mayuscula o minuscula lo convertimos todo a minuscula con el lower
         lista1
              .stream()
              .filter(persona->persona.getNombre().toLowerCase().startsWith("j"))
              .forEach(System.out::println);
       
        System.out.println("\n--Personas que tengan en sus nombres el conjunto de letras 'os'(mayus/minus)--");
       //SELECT * FROM Personas WHERE nombre like '%os%'
       lista1
              .stream()
              .filter(persona->persona.getNombre().toLowerCase().contains("os"))
              .forEach(System.out::println);
       
       System.out.println("\n--Personas ordenadas por nombre--");
       //SELECT * FROM Personas ORDER BY nombre;
       lista1
              .stream()
              .sorted(Comparator.comparing(Persona::getNombre))//Ordena por lo que dice la interfaz comparable en la clase Persona
              .forEach(System.out::println);
       
         System.out.println("\n--Personas ordenadas por edad--");
       //SELECT * FROM Personas ORDER BY edad;
       lista1
              .stream()
              .sorted(Comparator.comparingInt(Persona::getEdad))
              .forEach(System.out::println);
       
       System.out.println("\n--Personas cuay edad este comprendida entre 30 y 40 años--");
       //SELECT * FROM Personas WHERE edad BETWEEN 30 and 40 ORDER BY nombre;
       lista1
               .stream()
               .filter(p->p.getEdad() >= 30 && p.getEdad() <= 60)
               .sorted(Comparator.comparing(Persona::getEdad))
               .forEach(System.out::println);
               
    
    
    
    
    
    
    }
    
}
