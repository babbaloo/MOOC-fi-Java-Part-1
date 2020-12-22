/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maris
 */
public class Book {
    private String bookTitle;
    private int numberOfPages;
    private int publishYear;

    public Book(String title, int pages, int year) {
        this.bookTitle = title;
        this.numberOfPages = pages;
        this.publishYear = year;
    }
    
    public String getEverything() {
        return this.bookTitle + ", " + this.numberOfPages + " pages, " + this.publishYear;
    }
    
    public String getName() {
        return this.bookTitle;
    }
}
