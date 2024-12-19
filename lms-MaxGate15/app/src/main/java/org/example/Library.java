package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Max added the book: " + book.getTitle());
    }


    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Max removed the book: " + book.getTitle());
    }

    public void displayBooks() {
        System.out.println("Books in Max's library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + book.getYearPublished() + ")");
        }
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void clearBooks() {
        books.clear();
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Max found the book: " + book.getTitle());
                return book;
            }
        }
        System.out.println("Max couldn't find the book: " + title);
        return null;
    }
}