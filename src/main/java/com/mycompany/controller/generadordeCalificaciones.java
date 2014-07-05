/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.controller;

import com.mycompany.examen.Evaluacion;
import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class generadordeCalificaciones {

    public static ArrayList<Evaluacion> getCalificacion() {
        return calificacion;
    }

    public static void setCalificacion(ArrayList<Evaluacion> aCalificacion) {
        calificacion = aCalificacion;
    }
    private String Nombre;
    private float Calificacion;
    
    
    
    
    
       private static ArrayList<Evaluacion> calificacion = new ArrayList<Evaluacion>();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  
    }

   
    
    
   
    
        
    
            
    

