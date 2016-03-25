/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto.chat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author root
 */
public class persistenciaLibro {
    private static final String RUTA="Archivo";
    public static ArrayList<libro> leerLibro(){
        ArrayList<libro> lib= new ArrayList<>();
        File f = new File(RUTA);
        try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                lib = (ArrayList<libro>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Erro al leer el archivo" + e.getMessage());
        }
      
        return lib;
    }
    public void guardarLibro(libro l )throws Exception{
        ArrayList<libro> lib = new ArrayList<>();
        File f = new File(RUTA);
        if(f.exists()) lib = leerLibro();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        lib.add(l);
        oos.writeObject(lib);
        System.out.println("Guardado con exito");
    }
}
