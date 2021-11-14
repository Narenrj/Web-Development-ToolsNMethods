/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.neu.edu.controller;

import com.neu.edu.pojo.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author sachin
 */
@Controller
public class MovieFormController {

//    @RequestMapping(value = "/movie.htm", method = RequestMethod.GET)
//    public String showForm(ModelMap model, Movie movie) {
//        //TODO
//         return "movie-form";
//    }

    @GetMapping("movie.htm")
    public String showSuccess() {
        //TODO
        Movie movie = new Movie();
        
        movie.setMovieID(108);
        movie.setTitle("Jai Bhim");
        movie.setActor("Surya");
        movie.setActress("Lijo Mol Jose");
        movie.setGenre("Drama");
        movie.setYear(2021);
        
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(movie);
        tx.commit();
         return "movie-success";
    }
}
