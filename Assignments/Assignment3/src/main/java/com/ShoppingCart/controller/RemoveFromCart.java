/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ShoppingCart.controller;

import com.movies.model.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
@WebServlet(name = "RemoveFromCart", urlPatterns = {"/removeItem"})
public class RemoveFromCart extends HttpServlet {

    Cart c;

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
        PrintWriter out = response.getWriter();

        //ArrayList<String> cartItems = c.getItemsList();
        HttpSession session = request.getSession(true);

        Cart c1 = (Cart) session.getAttribute("items");
        ArrayList<String> items = c1.getItemsList();

        //out.println(items);

        String[] selectedStudentIds = request.getParameterValues("vCart");
        //ArrayList<String> test = new ArrayList<String>();

        for (String del : selectedStudentIds) {
            //out.println("<br>");
            //out.println(del);
            c1.removeItemsList(del);
            //test.add(del);
        }
        //out.println("<br>");
        //out.println(test);
        //out.println("<br>");
        //out.println(c1.getItemsList());

//        out.println(Arrays.toString(selectedStudentIds));
//        for(int i=0; i<selectedStudentIds.length; i++)
//        {
//            out.println(selectedStudentIds[i]);
//        }
//        c.addItemsList(selectedStudentIds);
//        ArrayList<String> sample = cartObj.getItemsList();
//        
//        for(int i=0; i<sample.size(); i++ )
//        {
//            out.println(sample.get(i)+", ");
//        }
        session.setAttribute("items", c1);

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet RemoveFromCart</title>");
        out.println("</head>");
        out.println("<body bgcolor='Teal'>");
        out.println("<h1> Items Removed from Cart Successfully !</h1>");
        out.println("<br>");
        out.println("<a href='http://localhost:8081/Assignment_3/ShoppingCart.jsp'>Click Here to be Redirected to Main Page</a>");
        out.println("</body>");
        out.println("</html>");
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
