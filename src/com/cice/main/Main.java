/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

/**
 *
 * @author cice
 */
public class Main {
    
    public static void main(String[] args) {
    
    Imprimir imprimir30 = new Imprimir("1",3000);
    imprimir30.start();
    Imprimir imprimir15 = new Imprimir("2",1000);
    imprimir15.start();
    Imprimir imprimir55 = new Imprimir("3",5500);
    imprimir55.start();
    Imprimir imprimir20 = new Imprimir("4",2000);
    imprimir20.start();
    
    
    }
    
}
