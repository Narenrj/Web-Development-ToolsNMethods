/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.me.controller;

import com.me.pojo.Course;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ysf
 */
@WebServlet(name = "CourseController", urlPatterns = {"/course.htm"})
public class CourseController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public void init() {
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        
        c1.setCode("INFO 5001-01");
        c1.setTitle("Application Modeling and Design");
        c1.setCrn(17497);
        c1.setInstructor("Khaled Bugrara");
        
        c2.setCode("INFO 6105-01");
        c2.setTitle("Data Science engineering Methods and Tools");
        c2.setCrn(14345);
        c2.setInstructor("Dino Konstantopoulos");
        
        c3.setCode("INFO 6205-01");
        c3.setTitle("Program Structure and Algorithms");
        c3.setCrn(14304);
        c3.setInstructor("Robin Hillyard");
        
        ArrayList<Course> courseList = new ArrayList();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        
        ServletContext application = this.getServletContext();
        application.setAttribute("courses", courseList);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/courseview.jsp");
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
