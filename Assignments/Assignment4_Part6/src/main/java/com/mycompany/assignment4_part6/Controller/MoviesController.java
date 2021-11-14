/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4_part6.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author naren
 */
public class MoviesController extends AbstractController {
    
    public MoviesController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        String userSelection = "";
        if (request.getParameter("choice") != null) {
            System.out.println("Inside If Condition !");
            userSelection = request.getParameter("choice");
        }

        /* TODO output your page here. You may use following sample code. */
        if (userSelection.equals("browse")) {
//            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/BrowseMovies.jsp");
//            rd.forward(request, response);
            return new ModelAndView("BrowseMovies");
        } else if (userSelection.equals("add")) {
//            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/AddMovies.jsp");
//            rd.forward(request, response);
            return new ModelAndView("AddMovies");
        } else {
            System.out.println("########### INVALID USER SELECTION #######################");
        }

        return new ModelAndView();
    }
    
}
