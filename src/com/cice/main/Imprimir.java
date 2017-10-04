/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class Imprimir extends Thread {

    private int dato;
    private String nombre;

    public Imprimir(String nombre, int dato) {
        this.dato = dato;
        this.nombre=nombre;
    }
    
    
    @Override
    public void run() {
        try {
            for (int i=0; i<3; i++){
                sleep(dato);
                System.out.println("Hilo: " +nombre+ " imprimo mensaje después de : "+ dato/1000 + " segundos");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
