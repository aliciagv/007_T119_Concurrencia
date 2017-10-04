/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class MainCronometro {

    public static void main(String[] args) {

        try {
            Cronometro crono = new Cronometro();
            crono.run();
            
            Thread.sleep(2000);
            crono.setPausa(true);
            Thread.sleep(3000);
            crono.setPausa(false);
            crono.setStop(true);
            
            /*Scanner sc = new Scanner(System.in);
            System.out.println("===================");
            System.out.println("===CRONOMETRO======");
            System.out.println("===================");
            System.out.println("Elige una opción");
            String opcion;
            do {
            System.out.println("I.Iniciar");
            System.out.println("P.Parar");
            System.out.println("F.Finalizar");
            opcion= sc.nextLine();
            switch (I) {
            case val:
            
            break;
            default:
            throw new AssertionError();
            }
            crono.setEstado(false);
            } while opcion.equalsIgnoreCase("F");
            
        }*/ } catch (InterruptedException ex) {
            Logger.getLogger(MainCronometro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
