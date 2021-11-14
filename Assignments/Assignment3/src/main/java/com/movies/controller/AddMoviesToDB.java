/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.controller;

import com.movies.model.Movies;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(name = "AddMovies", urlPatterns = {"/addMovies"})
public class AddMoviesToDB extends HttpServlet {

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

        Connection con = null;
        ResultSet rs = null;
        Statement st = null;

        Movies movieObj = new Movies();
        /* TODO output your page here. You may use following sample code. */
        //movieID movieTitle actor actress genre year
        String movieID = "", movieTitle = "", actorName = "", actressName = "", genreType = "", releaseYear = "";
        movieID = request.getParameter("movieID");
        movieTitle = request.getParameter("movieTitle");
        actorName = request.getParameter("actor");
        actressName = request.getParameter("actress");
        genreType = request.getParameter("genre");
        releaseYear = request.getParameter("year");

        if (movieID != null && movieTitle != null && actorName != null && actressName != null && genreType != null && releaseYear != null) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviestore", "root", "MySQLPwd$21");
                st = con.createStatement();
                System.out.println("Connection Successful...!");
                String sql = "INSERT INTO moviecollections VALUES(?,?,?,?,?,?)";

                //System.out.println("Inside Actor Condition !" + userKeyword.toUpperCase());
                PreparedStatement ps;
                try {
                    ps = con.prepareStatement(sql);

                    ps.setInt(1, Integer.parseInt(movieID));
                    ps.setString(2, movieTitle.toUpperCase());
                    ps.setString(3, actorName.toUpperCase());
                    ps.setString(4, actressName.toUpperCase());
                    ps.setString(5, genreType.toUpperCase());
                    ps.setString(6, releaseYear.toUpperCase());

                    int status = ps.executeUpdate();
                    if (status > 0) {
                        System.out.println("Record is inserted successfully !!!");
                    } else {
//                        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/MovieNotAdded.jsp");
//                        rd.forward(request, response);
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

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/MovieAdded.jsp");
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
