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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "FetchMovies", urlPatterns = {"/retrieveMovies"})
public class FetchMovies extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String actorName = "";
        
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;

        Movies movieObj = new Movies();
        /* TODO output your page here. You may use following sample code. */

        String userKeyword = "", keywordType = "";

        if (request.getParameter("keyword") != null && request.getParameter("drone") != null) {
            System.out.println("Inside If Condition !");
            userKeyword = request.getParameter("keyword");
            keywordType = request.getParameter("drone");
            userKeyword.toUpperCase();
            System.out.println("KeywordType Value : "+keywordType);
            System.out.println("Keyword Value : "+userKeyword);
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviestore", "root", "MySQLPwd$21");
            st = con.createStatement();
            System.out.println("Connection Successful...!");

            if (keywordType.equals("actor")) {
                System.out.println("Inside Actor Condition !"+userKeyword.toUpperCase());
                rs = st.executeQuery("SELECT * from moviecollections where LEAD_ACTOR= '"+userKeyword.toUpperCase()+"'");
                if (rs.next()) {
                    movieObj.setMovie_ID(rs.getInt("MOVIE_ID"));
                    movieObj.setMovie_Title(rs.getString("MOVIE_TITLE"));
                    movieObj.setLead_Actor(rs.getString("LEAD_ACTOR"));
                    movieObj.setLead_Actress(rs.getString("LEAD_ACTRESS"));
                    movieObj.setMovie_Genre(rs.getString("MOVIE_GENRE"));
                    movieObj.setRelease_Year(rs.getString("RELEASE_YEAR"));
                    request.setAttribute("test1", movieObj);
                    //actorName = rs.getString("LEAD_ACTOR");
                }
                
            } else if(keywordType.equals("actress")){
                System.out.println("Inside Actress Condition !"+userKeyword.toUpperCase());
                rs = st.executeQuery("SELECT * from moviecollections where LEAD_ACTRESS='"+userKeyword.toUpperCase()+"'");
                if (rs.next()) {
                    movieObj.setMovie_ID(rs.getInt("MOVIE_ID"));
                    movieObj.setMovie_Title(rs.getString("MOVIE_TITLE"));
                    movieObj.setLead_Actor(rs.getString("LEAD_ACTOR"));
                    movieObj.setLead_Actress(rs.getString("LEAD_ACTRESS"));
                    movieObj.setMovie_Genre(rs.getString("MOVIE_GENRE"));
                    movieObj.setRelease_Year(rs.getString("RELEASE_YEAR"));
                    request.setAttribute("test1", movieObj);
                }
            } else {
                System.out.println("Inside Title Condition !");
                rs = st.executeQuery("SELECT * from moviecollections where MOVIE_TITLE='"+userKeyword.toUpperCase()+"'");
                if (rs.next()) {
                    movieObj.setMovie_ID(rs.getInt("MOVIE_ID"));
                    movieObj.setMovie_Title(rs.getString("MOVIE_TITLE"));
                    movieObj.setLead_Actor(rs.getString("LEAD_ACTOR"));
                    movieObj.setLead_Actress(rs.getString("LEAD_ACTRESS"));
                    movieObj.setMovie_Genre(rs.getString("MOVIE_GENRE"));
                    movieObj.setRelease_Year(rs.getString("RELEASE_YEAR"));
                    request.setAttribute("test1", movieObj);
                }
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        finally {
            try {
                if(rs != null){
                    rs.close();
                }
                if(con != null){
                    con.close();
                }
                if(st != null){
                    st.close();
                }
            }
            catch(Exception e){
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        
        

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/FetchResults.jsp");
        rd.forward(request, response);

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
        try {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(FetchMovies.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchMovies.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(FetchMovies.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FetchMovies.class.getName()).log(Level.SEVERE, null, ex);
        }
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
