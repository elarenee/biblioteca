package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ExampleTest {

    private PrintStream printstream;
    ArrayList<Book> listOfBooks;
    private BibliotecaApp biblioteca;
    private Book sandAndFog;

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
        listOfBooks = new ArrayList<Book>();
        biblioteca = new BibliotecaApp(printstream, listOfBooks);
        sandAndFog = new Book("House of Sand and Fog", "Andre Dubus", 2003);
    }

    @Test
    public void shouldWelcomeWhenBibliotecaOpens() {
        biblioteca.openLibrary();
        verify(printstream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldNotPrintAnythingWhenBibliotecaIsEmpty() {
        biblioteca.openLibrary();
        verify(printstream).print("");
    }

    @Test
    public void shouldPrintOneTitleWhenOneBookInBiblioteca() {
        listOfBooks.add(sandAndFog);
        biblioteca.openLibrary();
        verify(printstream).print(contains("House of Sand and Fog"));
    }

    @Test
    public void shouldPrintAllDataWhenOneBookInBiblioteca() {
        listOfBooks.add(sandAndFog);
        biblioteca.openLibrary();
        verify(printstream).print(contains("House of Sand and Fog, Andre Dubus, 2003"));
    }

}
