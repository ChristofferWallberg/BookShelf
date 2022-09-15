package book;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private String colour;
    private ArrayList<Book> books = new ArrayList<>();

    public Shelf(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void printTitles() {
        System.out.println("Böcker i bokhyllan: ");
        for (Book book : books) {
            int i = books.indexOf(book) + 1;
            System.out.println(i + ": " + book.getTitle());
        }
//        books.forEach(book -> System.out.println(book.getTitle()));
    }

    public int getIndexOfBook(int x) {
        return getBooks().indexOf(books);
    }
}
