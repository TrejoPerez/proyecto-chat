/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.chat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
public class controlThreads {
    public static String asigna="pp";
    /*
    public static String actualizarEstado(String estado){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                int i=0;
                while(true){
                    if(i<persistenciaLibro.leerLibro().size()){
                        asigna = estado+persistenciaLibro.leerLibro().get(i).getMensaje();
                        System.out.println(asigna);
                        i = i+1;
                    }
                    try {
                    Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        System.out.println("Error al actualizar los mensajes");
                    }
                }
            }
        });
          try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(controlThreads.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.start();
      
        System.out.println("valor asiga"+asigna);
        return asigna;
    }
    */
    public synchronized void thread1(String na){
        for(int i=0;i<=8;i++){
            System.out.println(i+ na);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
       controlThreads c = new controlThreads();
       c.thread1("t1");
       controlThreads c2 = new controlThreads();
       c2.thread1("t2");
        System.out.println("Terminado");
    }
    
    
}
class lp{
    
    
}
