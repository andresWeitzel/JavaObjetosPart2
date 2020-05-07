/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordetexto;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class ContenedorPadre extends JFrame{
    
    public  ContenedorPadre(){
        setTitle("Procesador de Texto 1");
        setBounds(600,300,600,350);
        
        ContenedorHijo contenedorHijo1 =new ContenedorHijo();
        
        add(contenedorHijo1);
        
        setVisible(true);
    }
    
}
