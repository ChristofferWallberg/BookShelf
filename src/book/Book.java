package book;

import java.io.Serial;
import java.io.Serializable;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String backText;

    public Book(String title, String author, int numberOfPages, String backText) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.backText = backText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getBackText() {
        return backText;
    }

    public void setBackText(String backText) {
        this.backText = backText;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "$Author: " + author +
                "$Number of pages: " + numberOfPages +
                "$Back text: " + backText;
    }
}
