package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Автор книги " + title + " - " + author + ", год выпуска - " + year;
    }
}
