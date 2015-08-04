package com.twu.biblioteca;


import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;


public class BibliotecaApp {

    private PrintStream printStream;
    private ArrayList<String> listOfBooks;

    public BibliotecaApp(PrintStream printStream, ArrayList<String> listOfBooks) {
        this.printStream = printStream;
        this.listOfBooks = listOfBooks;
    }

    public void openLibrary() {
        printStream.println("Welcome to Biblioteca!");
        listBooksInLibrary();
    }

    public void listBooksInLibrary() {
        printStream.println("");
    }

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        BibliotecaApp biblioteca = new BibliotecaApp(System.out, books);
        biblioteca.openLibrary();

    }

}
