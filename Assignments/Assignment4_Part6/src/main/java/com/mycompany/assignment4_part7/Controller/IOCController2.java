/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4_part7.Controller;

import com.mycompany.assignment4_part7.Utility.DependencyClass;
import com.mycompany.assignment4_part7.Utility.DependencyClass2;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.incubator.jpackage.internal.Arguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
public class IOCController2 {
    public IOCController2() {
    }
    @RequestMapping(value = "/Part9.htm", method = RequestMethod.POST)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response, DependencyClass2 obj1) throws Exception {
        
        String userName = request.getParameter("userName");
        
        request.setAttribute("info", obj1.getInfo());
        request.setAttribute("objectID", obj1);
        request.setAttribute("username", userName);
//        request.setAttribute("objectID2", obj1);
        
        return new ModelAndView("IOCExample_1");
    }   
    
}
