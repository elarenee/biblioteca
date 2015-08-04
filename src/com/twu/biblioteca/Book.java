package com.twu.biblioteca;

/**
 * Created by lfitzger on 8/4/15.
 */
public class Book {

    private String author;
    private String title;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getTitle() {
        return title;
    }


}
