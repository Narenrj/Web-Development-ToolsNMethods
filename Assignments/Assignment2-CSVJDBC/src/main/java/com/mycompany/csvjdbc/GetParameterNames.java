/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csvjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author naren
 */
@WebServlet(name = "GetParameterNames", urlPatterns = {"/getParameterNames"})
public class GetParameterNames extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet GetParameterNames</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet GetParameterNames at " + request.getContextPath() + "</h1>");

        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            out.print("Paramter Name: <strong>" + parameterName + "</strong><br>");

//            Enumeration<String> valueIt = request.getHeaders(parameterName);
//            out.println("</strong>, Header Value: <em>");
//            while (valueIt.hasMoreElements()) {
//                String headerValue = valueIt.nextElement();
//                out.println(headerValue + " ");
//                out.println("</em><br/>");
//            }
        }
        out.println("<hr>");
        //out.println("-------------------------------------------------------------------------------------------------------------------------------<br><br>");
        out.println("<H1>GetParameterMap() Demonstration: <br></H1>");
        Map m = request.getParameterMap();
        Set s = m.entrySet();
        Iterator it = s.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
            String key = entry.getKey();
            String[] value = entry.getValue();
            String noEntry = "textArea";
            
            if(!key.equalsIgnoreCase(noEntry)){
             out.println("Key is " + key + "<br>");

            if (value.length > 1) {
                for (int i = 0; i < value.length; i++) {
                    out.println("<li> Value "+(i + 1)+" is <strong>" + value[i].toString() + "</strong></li><br>");
                }
            } else {
                out.println("Value is <strong>" + value[0].toString() + "</strong><br>");
            }
            out.println("--------------------------------------------<br>");   
            }
            
            
        }

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
