/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4.ShoppingCart;

import com.movies.model.Cart;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class RemoveItem {
    Cart c;
    
    public RemoveItem() {
    }
    
    @RequestMapping(value = "/removeItem.htm", method = RequestMethod.POST)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        
        PrintWriter out = response.getWriter();

        //ArrayList<String> cartItems = c.getItemsList();
        HttpSession session = request.getSession(true);

        Cart c1 = (Cart) session.getAttribute("items");
        ArrayList<String> items = c1.getItemsList();

        //out.println(items);

        String[] selectedStudentIds = request.getParameterValues("vCart");
        //ArrayList<String> test = new ArrayList<String>();

        for (String del : selectedStudentIds) {
            c1.removeItemsList(del);
        }

        session.setAttribute("items", c1);

        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet RemoveFromCart</title>");
        out.println("</head>");
        out.println("<body bgcolor='Teal'>");
        out.println("<h1> Items Removed from Cart Successfully !</h1>");
        out.println("<br>");
        out.println("<a href='http://localhost:8081/Assignment4/ShoppingCart.jsp'>Click Here to be Redirected to Main Page</a>");
        out.println("</body>");
        out.println("</html>");
        RequestDispatcher rd = request.getRequestDispatcher("ItemRemoved.jsp");
        rd.forward(request, response);
        
        return new ModelAndView("");
    }
    
}
