package org.example;

public class App {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.findBook("1984");
        library.removeBook(book1);
        library.displayBooks();
    }
}