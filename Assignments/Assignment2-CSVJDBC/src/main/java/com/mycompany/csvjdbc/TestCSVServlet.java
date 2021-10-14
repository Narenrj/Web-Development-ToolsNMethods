/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csvjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naren
 */
@WebServlet(name = "TestCSVServlet", urlPatterns = {"/testcsv.xls"})
public class TestCSVServlet extends HttpServlet {

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
        /* TODO output your page here. You may use following sample code. */

        String fileName = request.getParameter("fileName");

        if (fileName.equalsIgnoreCase("parking_facilities")) {
            try {
                Class.forName("org.relique.jdbc.csv.CsvDriver");
                Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:\\Coursework\\Fall 21\\Web Tools & Methods\\Assignments\\Assignment2");

                // create a scrollable Statement so we can move forwards and backwards
                // through ResultSets
                java.sql.Statement stmt = conn.createStatement();
                ResultSet results = stmt.executeQuery("SELECT * FROM parking_facilities");
                ResultSetMetaData rsmd = results.getMetaData();
                int numberOfColumns = rsmd.getColumnCount();

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet TestCSVServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet CSV Connection Test at " + request.getContextPath() + "</h1>");
                out.println("<table border='1'>");

                out.println("<tr>");
                for (int i = 1; i <= numberOfColumns; i++) {
                    out.println("<th>" + rsmd.getColumnName(i) + "</th>");
                }
                out.println("</tr>");
                // dump out the last record in the result set, then the first record
                while (results.next()) {
                    out.println("<tr>");
                    out.println("<td>" + results.getString(1) + "</td>");
                    out.println("<td>" + results.getString(2) + "</td>");
                    out.println("<td>" + results.getString(3) + "</td>");
                    out.println("<td>" + results.getString(4) + "</td>");
                    out.println("<td>" + results.getString(5) + "</td>");
                    out.println("<td>" + results.getString(6) + "</td>");
                    out.println("<td>" + results.getString(7) + "</td>");
                    out.println("<td>" + results.getString(8) + "</td>");
                    out.println("<td>" + results.getString(9) + "</td>");
                    out.println("<td>" + results.getString(10) + "</td>");
                    out.println("<td>" + results.getString(11) + "</td>");
                    out.println("<td>" + results.getString(12) + "</td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
                // clean up
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            out.println("<form action='index.html' method='POST'>");
            out.println("<H2 style='color:red'>ERROR 404 </H2>");
            out.println("<input type='submit' value='Retry' style='min-width: 120px'><br><br>");
            out.println("</form>");
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
