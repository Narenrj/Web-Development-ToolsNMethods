/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

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
public class QuizServlet extends HttpServlet {

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

        //if session already exists returns the session ID; else it creates a new session
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        String questionIdentifier = request.getParameter("qn");

        switch (questionIdentifier) {
            case "1":
                // question 1 has been submitted
                // read answer 1 and display question 2
                String answer1 = request.getParameter("question");
                //Saving the answer in the user's session object
                session.setAttribute("answer1",answer1);
                
                out.println("<!doctype HTML>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Online Quiz</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Session ID: " + session.getId() + "</h1>");
                out.println("<h1>Question 2: An object could be ...</h1>");
                out.println("<form action='quiz' method='POST'>");
                out.println("<input type='radio' name='question' value='a' checked/> anything<br/>");
                out.println("<input type='radio' name='question' value='b' /> an algorithm<br/>");
                out.println("<input type='radio' name='question' value='c' /> a data container<br/>");
                out.println("<input type='radio' name='question' value='d' /> a program<br/>");
                out.println("<input type='hidden' name='qn' value='2' />");
                out.println("<input type='submit' value='SEND ANSWER'/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
                break;

            case "2":
                // question 2 has been submitted
                // read answer 2 and display question 3
                String answer2 = request.getParameter("question");
                //Saving the answer in the user's session object
                session.setAttribute("answer2",answer2);
                
                out.println("<!doctype HTML>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Online Quiz</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Session ID: " + session.getId() + "</h1>");
                out.println("<h1>Question 3: Choose the appropriate data type for this value: 5.5</h1>");
                out.println("<form action='quiz' method='POST'>");
                out.println("<input type='radio' name='question' value='a' checked/> int<br/>");
                out.println("<input type='radio' name='question' value='b' /> double<br/>");
                out.println("<input type='radio' name='question' value='c' /> boolean<br/>");
                out.println("<input type='radio' name='question' value='d' /> String<br/>");
                out.println("<input type='hidden' name='qn' value='3' />");
                out.println("<input type='submit' value='SEND ANSWER'/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
                break;

            case "3":
                // question 3 has been submitted
                // read answer 3 and display question 4
                String answer3 = request.getParameter("question");
                //Saving the answer in the user's session object
                session.setAttribute("answer3",answer3);
                
                out.println("<!doctype HTML>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Online Quiz</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Session ID: " + session.getId() + "</h1>");
                out.println("<h1>Question 4: Which of the following is/are advantages of packages?</h1>");
                out.println("<form action='quiz' method='POST'>");
                out.println("<input type='radio' name='question' value='a' checked/>  Packages avoid name clashes<br/>");
                out.println("<input type='radio' name='question' value='b' />  Classes, even though they are visible outside their package, can have fields visible to packages only<br/>");
                out.println("<input type='radio' name='question' value='c' /> We can have hidden classes that are used by the packages, but not visible outside.<br/>");
                out.println("<input type='radio' name='question' value='d' /> All of the above<br/>");
                out.println("<input type='hidden' name='qn' value='4' />");
                out.println("<input type='submit' value='SEND ANSWER'/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
                break;

            case "4":
                // question 4 has been submitted
                // read answer 4 and display question 5
                String answer4 = request.getParameter("question");
                //Saving the answer in the user's session object
                session.setAttribute("answer4",answer4);
                
                out.println("<!doctype HTML>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Online Quiz</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Session ID: " + session.getId() + "</h1>");
                out.println("<h1>Question 5: Which of the following is true about inheritance in Java? </h1> \n" + "1) Private methods are final.\n"
                        + "2) Protected members are accessible within a package and inherited classes outside the package.\n"
                        + "3) Protected methods are final.\n"
                        + "4) We cannot override private methods. ");
                out.println("<form action='quiz' method='POST'>");
                out.println("<input type='radio' name='question' value='a' checked/> 1, 2 and 4 <br/>");
                out.println("<input type='radio' name='question' value='b' />  Only 1 and 2<br/>");
                out.println("<input type='radio' name='question' value='c' /> 1, 2 and 3<br/>");
                out.println("<input type='radio' name='question' value='d' /> 2, 3 and 4<br/>");
                out.println("<input type='hidden' name='qn' value='5' />");
                out.println("<input type='submit' value='SEND ANSWER'/>");
                out.println("</form>");
                out.println("</body>");
                out.println("</html>");
                break;

            case "5":
                // question 5 has been submitted
                // read answer 5 and display the results
                String answer5 = request.getParameter("question");
                //Saving the answer in the user's session object
                session.setAttribute("answer5",answer5);
                
                out.println("<H1>Thanks for Submitting your response!</H1>");
                out.println("You are response are as follows<br>");
                String [] answers = new String[5];
                answers[0] = (String) session.getAttribute("answer1");
                answers[1] = (String) session.getAttribute("answer2");
                answers[2] = (String) session.getAttribute("answer3");
                answers[3] = (String) session.getAttribute("answer4");
                answers[4] = (String) session.getAttribute("answer5");
                int i = 1;
                for(String s: answers){
                    out.println("The Answer for "+i+" is: "+s+"<br>");
                }
                break;

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
