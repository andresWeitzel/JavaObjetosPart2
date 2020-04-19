/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase22;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author andre
 */
public class MapaCollections {
    
    public static Map<String,String>getMapa(){
        
        Map<String,String>mapa=new LinkedHashMap();
        mapa.put("Lista_con_duplicados","java.util.ArrayList");
        mapa.put("Lista_sin_duplicados","java.util.LinkedHashSet");
        mapa.put("Lista_sin_duplicados_rapida","java.util.HashSet");
        mapa.put("Lista_sin_duplicados_ordenada","java.util.TreeSet");
        //Usamos una cola y encolamos la lista de elementos ya existentes
        mapa.put("Cola_de_elementos","java.util.ArrayDeque");
        //Usamos la tecnologia Stack(pila) y empilamos los elementos ya existentes
        mapa.put("Pila_de_elementos","java.util.Stack");
        
        return mapa;
    }
    
}
