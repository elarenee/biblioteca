package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;


public class BibliotecaApp {

    private PrintStream printStream;
    private ArrayList<Book> listOfBooks;

    public BibliotecaApp(PrintStream printStream, ArrayList<Book> listOfBooks) {
        this.printStream = printStream;
        this.listOfBooks = listOfBooks;
    }

    public void openBiblioteca() {
        printStream.println("Welcome to Biblioteca!");
        listBooksInLibrary();
    }

    public void listBooksInLibrary() {
        String output = "";
        for (Book book: listOfBooks) {
            output += book.getTitle() + " | " + book.getAuthor() + " | " + book.getYearPublished() + "\n";
        }
        printStream.print(output);
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        //books.add("Game of Thrones");
        BibliotecaApp biblioteca = new BibliotecaApp(System.out, books);
        biblioteca.openBiblioteca();

    }

}
