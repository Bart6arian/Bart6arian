package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {

    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

}
