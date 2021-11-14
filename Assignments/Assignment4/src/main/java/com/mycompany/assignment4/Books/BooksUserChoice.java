/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4.Books;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author naren
 */
public class BooksUserChoice extends AbstractController {
    
    public BooksUserChoice() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            
        String userChoice = request.getParameter("books");
            
            int no = Integer.parseInt(userChoice);
            request.setAttribute("number", no);
        
        return new ModelAndView("AddBooks");
    }
    
}
