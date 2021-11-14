/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.books.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naren
 */
@WebServlet(name = "AddbooksToDB", urlPatterns = {"/addBooksToDB"})
public class AddbooksToDB extends HttpServlet {

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
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;

        /* TODO output your page here. You may use following sample code. */
        ArrayList<String> isbnList = new ArrayList<>();
        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> authorList = new ArrayList<>();
        ArrayList<Float> priceList = new ArrayList<>();

        Map m = request.getParameterMap();
        Set s = m.entrySet();
        Iterator it = s.iterator();

        while (it.hasNext()) {
            Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
            String key = entry.getKey();
            String[] value = entry.getValue();
            String noEntry = "textArea";

            if (!key.equalsIgnoreCase(noEntry)) {
                out.println("Key is " + key + "<br>");
            }
            if (value.length >= 1) {
                for (int i = 0; i < value.length; i++) {
                    out.println("<li> Value " + (i + 1) + " is <strong>" + value[i].toString() + "</strong></li><br>");
                    if (key.equalsIgnoreCase("isbn")) {
                        isbnList.add(value[i].toString());
                    } else if (key.equalsIgnoreCase("btitle")) {
                        titleList.add(value[i].toString());
                    } else if (key.equalsIgnoreCase("authors")) {
                        authorList.add(value[i].toString());
                    } else {
                        priceList.add(Float.parseFloat(value[i]));
                    }
                }
            } else {
                out.println("Value is <strong>" + value[0].toString() + "</strong><br>");
            }
        }
        //out.println("the size of List are :"+isbnList+titleList+authorList+priceList);

        if (!isbnList.isEmpty() && !titleList.isEmpty() && !authorList.isEmpty() && !priceList.isEmpty()) {
            int size = isbnList.size();
            int i = 0;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviestore", "root", "MySQLPwd$21");
                st = con.createStatement();
                System.out.println("Connection Successful...!");
                String sql = "INSERT INTO bookcollections VALUES(?,?,?,?)";

                //System.out.println("Inside Actor Condition !" + userKeyword.toUpperCase());
                PreparedStatement ps;
                try {
                    while (i < size) {
                        ps = con.prepareStatement(sql);

                        ps.setString(1, isbnList.get(i).toUpperCase());
                        ps.setString(2, titleList.get(i).toUpperCase());
                        ps.setString(3, authorList.get(i).toUpperCase());
                        ps.setFloat(4, priceList.get(i));

                        int status = ps.executeUpdate();
                        if (status > 0) {
                            System.out.println("Record is inserted successfully !!!");
                        } else {
//                        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/BookNotAdded.jsp");
//                        rd.forward(request, response);
                        }
                        i++;
                    }

                } catch (SQLException e) {
                    System.out.println("The Prepared Statement Error Message is " + e.getMessage());
                }

            } catch (ClassNotFoundException e) {
                System.out.println("Class Not Found Exception: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                    if (st != null) {
                        st.close();
                    }
                } catch (Exception e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/BookAdded.jsp");
            rd.forward(request, response);
        }

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
