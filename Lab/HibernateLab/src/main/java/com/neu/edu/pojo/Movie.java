package com.neu.edu.pojo;

/**
 *
 * @author Sachin
 */
public class Movie {
    
    //todo
    private int movieID;
    private String title;
    private String actor;
    private String actress;
    private String genre;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }
    

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", actor=" + actor + ", actress=" + actress + ", genre=" + genre + ", year=" + year + '}';
    }
    
    
    
}
