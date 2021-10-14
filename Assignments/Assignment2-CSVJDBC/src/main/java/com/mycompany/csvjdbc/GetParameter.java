/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csvjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author naren
 */
public class GetParameter extends HttpServlet {

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
        
        //Section 1 Fields
        String termIdentifier = request.getParameter("term");
        String academicYear = request.getParameter("academicYear");
        String employeeStatus = request.getParameter("status");
        //Section 2 Fields
        String studentFN = request.getParameter("firstName");
        String relationship = request.getParameter("relationship");
        String nuID = request.getParameter("nuid");
        String empName = request.getParameter("empName");
        String empNUID = request.getParameter("empNUID");
        String dept = request.getParameter("dept");
        String location = request.getParameter("location");
        String phNo = request.getParameter("phNumber");
        String supervisorName = request.getParameter("supervisorName");
        //Section 3 Fields
        String program = request.getParameter("progamtype");
        String courseNo = request.getParameter("courseNo");
        String courseName = request.getParameter("courseName");
        String supervisorSign = request.getParameter("supervisorSign");
        String credit = request.getParameter("credit");
        String days = request.getParameter("days");
        String timeField = request.getParameter("timeField");
        //Section 4 Fields
        String empSign = request.getParameter("empSign");
        String dateField = request.getParameter("dateField");
        String hrm = request.getParameter("hrm");
        String hrmDate = request.getParameter("hrmDate");
        
        
        
        
        
        
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetParameter</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>GetParameter() Demonstration: " + request.getContextPath() + "</h1>");
            out.println("<H2 style=color:red;>Section 1</H1>");
            out.println("The Term Entered is: <strong>"+termIdentifier +"</strong><br>");
            out.println("The Year Entered is: <strong>"+academicYear +"</strong><br>");
            out.println("The Employee Status is: <strong>"+employeeStatus +"</strong><br>");
            out.println("<H2 style=color:red;><strong>Section 2</strong></H1>");
            out.println("The Student First Name is: <strong>"+studentFN +"</strong><br>");
            out.println("The Relationship is: <strong>"+relationship +"</strong><br>");
            out.println("The NUID is: <strong>"+nuID +"</strong><br>");
            out.println("The Employee Name is: <strong>"+empName +"</strong><br>");
            out.println("The Employee NUID is: <strong>"+empNUID +"</strong><br>");
            out.println("The Department is: <strong>"+dept +"</strong><br>");
            out.println("The Location is: <strong>"+location +"</strong><br>");
            out.println("The Phone Number is: <strong>"+phNo +"</strong><br>");
            out.println("The Supervisor Name is: <strong>"+supervisorName +"</strong><br>");
            out.println("<H2 style=color:red;><strong>Section 3</strong></H1>");
            out.println("The Program Type is: <strong>"+program +"</strong><br>");
            out.println("The Course Number is: <strong>"+courseNo +"</strong><br>");
            out.println("The Course Name is: <strong>"+courseName +"</strong><br>");
            out.println("The Superviosr Sign is: <strong>"+supervisorSign +"</strong><br>");
            out.println("The No. of Credits is: <strong>"+credit +"</strong><br>");
            out.println("The No. of Days is: <strong>"+days +"</strong><br>");
            out.println("The Time is: <strong>"+timeField +"</strong><br>");
            out.println("<H2 style=color:red;><strong>Section 4</strong></H1>");
            out.println("The Employee Sign is: <strong>"+empSign +"</strong><br>");
            out.println("The Employee Status is: <strong>"+dateField +"</strong><br>");
            out.println("The HRM is: <strong>"+hrm +"</strong><br>");
            out.println("The HRM Date is: <strong>"+hrmDate +"</strong><br>");
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
