/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4.ShoppingCart;

import com.movies.model.Cart;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author naren
 */
@Controller
public class AddToCart {

    Cart cartObj = new Cart();

    public AddToCart() {
    }

    @RequestMapping(value = "/virtualCart.htm", method = RequestMethod.POST)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession(true);

        String[] selectedStudentIds = request.getParameterValues("books");

        cartObj.addItemsList(selectedStudentIds);

        session.setAttribute("items", cartObj);

        RequestDispatcher rd = request.getRequestDispatcher("VirtualCart.jsp");
        rd.forward(request, response);

        return new ModelAndView("");
    }
}
