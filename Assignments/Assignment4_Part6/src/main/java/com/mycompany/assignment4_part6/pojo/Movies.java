/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment4_part6.pojo;

/**
 *
 * @author naren
 */
public class Movies {
    
    private int movie_ID;
    private String movie_Title;
    private String lead_Actor;
    private String lead_Actress;
    private String movie_Genre;
    private String release_Year;

    public int getMovie_ID() {
        return movie_ID;
    }

    public void setMovie_ID(int movie_ID) {
        this.movie_ID = movie_ID;
    }

    public String getMovie_Title() {
        return movie_Title;
    }

    public void setMovie_Title(String movie_Title) {
        this.movie_Title = movie_Title;
    }

    public String getLead_Actor() {
        return lead_Actor;
    }

    public void setLead_Actor(String lead_Actor) {
        this.lead_Actor = lead_Actor;
    }

    public String getLead_Actress() {
        return lead_Actress;
    }

    public void setLead_Actress(String lead_Actress) {
        this.lead_Actress = lead_Actress;
    }

    public String getMovie_Genre() {
        return movie_Genre;
    }

    public void setMovie_Genre(String movie_Genre) {
        this.movie_Genre = movie_Genre;
    }

    public String getRelease_Year() {
        return release_Year;
    }

    public void setRelease_Year(String release_Year) {
        this.release_Year = release_Year;
    }

    @Override
    public String toString() {
        return "Movies{" + "movie_ID=" + movie_ID + ", movie_Title=" + movie_Title + ", lead_Actor=" + lead_Actor + ", lead_Actress=" + lead_Actress + ", movie_Genre=" + movie_Genre + ", release_Year=" + release_Year + '}';
    }
}
