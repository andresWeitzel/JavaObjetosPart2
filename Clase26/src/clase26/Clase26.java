/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author andre
 */
public class Clase26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURAS PERSONALIZADAS
        try {
            //GeneratorException.generator(true);
            GeneratorException.generator();
            
            //Exceptions in networks
            //me lanzara una excepcion de host desconocido
            System.out.println(InetAddress.getByName("Juan").getHostAddress());
            
        } catch (ArithmeticException e) {
            System.out.println("Division sobre cero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango");
        }catch(IOException e){
            System.out.println("Problema de I/0");
        }
    }
    
}
