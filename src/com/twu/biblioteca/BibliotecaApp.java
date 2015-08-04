package com.twu.biblioteca;


import java.io.PrintStream;


public class BibliotecaApp {

    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream) {
        this.printStream = printStream;
        printStream.println("Welcome to Biblioteca!");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca!");
    }

}
