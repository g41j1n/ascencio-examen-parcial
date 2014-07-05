/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.controller;

import com.mycompany.examen.Evaluacion.calificacion;
import com.mycompany.examen.Evaluacion.nombre;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @param x
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, Object x)
            throws ServletException, IOException {
        Nombre  no = new nombre();
         no.setNombre("Ana");
         
         Calificacion ca= new calificacion();
         ca.setCalificacion("7");
        request.setAttribute("presentacion", x);
       RequestDispatcher despachador=request.getRequestDispatcher("/presentacion.jsp");
       despachador.forward(request, response);
        
}
}