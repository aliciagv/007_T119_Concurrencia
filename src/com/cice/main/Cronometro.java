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
public class Cronometro extends Thread {
   
    private int horas;
    private int minutos;
    private int segundos;
    private boolean stop=false;
    private volatile boolean pausa=false;

    @Override
    public void run() {
    
        //System.currentTimeMillis()
        while (!stop) {
            if (!pausa) {
                try {
                    Thread.sleep(1000);
                    segundos++;
                    if (segundos == 60) {
                        minutos++;
                        segundos = 0;
                    } if (minutos==60) {
                        minutos=0;
                        horas++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }
    
    

}
