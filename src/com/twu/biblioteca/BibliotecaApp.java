package com.twu.biblioteca;


import java.io.PrintStream;


public class BibliotecaApp {

    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void openLibrary() {
        printStream.println("Welcome to Biblioteca!");
        listBooksInLibrary();
    }

    public void listBooksInLibrary() {
        printStream.println("House of Sand and Fog");
        printStream.println("Game of Thrones");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca!");
    }

}
