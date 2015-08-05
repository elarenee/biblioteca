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
    private Book gameOfThrones;

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
        listOfBooks = new ArrayList<Book>();
        biblioteca = new BibliotecaApp(printstream, listOfBooks);
        sandAndFog = new Book("House of Sand and Fog", "Andre Dubus", 2003);
        gameOfThrones = new Book("Game of Thrones", "George R. R. Martin", 2000);
    }

    @Test
    public void shouldWelcomeWhenBibliotecaOpens() {
        biblioteca.openBiblioteca();
        verify(printstream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldNotPrintAnythingWhenBibliotecaIsEmpty() {
        biblioteca.openBiblioteca();
        verify(printstream).print("");
    }

    @Test
    public void shouldPrintOneTitleWhenOneBookInBiblioteca() {
        listOfBooks.add(sandAndFog);
        biblioteca.openBiblioteca();
        verify(printstream).print(contains("House of Sand and Fog"));
    }

    @Test
    public void shouldPrintAllDataWhenOneBookInBiblioteca() {
        listOfBooks.add(sandAndFog);
        biblioteca.openBiblioteca();
        verify(printstream).print(contains("House of Sand and Fog"));
        verify(printstream).print(contains("Andre Dubus"));
        verify(printstream).print(contains("2003"));
    }

    @Test
    public void shouldPrintAllDataInColumnsWhenManyBooksInBiblioteca() {
        listOfBooks.add(sandAndFog);
        listOfBooks.add(gameOfThrones);
        biblioteca.openBiblioteca();
        verify(printstream).print(contains("House of Sand and Fog | Andre Dubus | 2003"));
        verify(printstream).print(contains("Game of Thrones | George R. R. Martin | 2000"));
    }

    @Test
    public void shouldDisplayMenuOptionsWhenBibliotecaStarts() {
        biblioteca.openBiblioteca();

        verify(printstream).println("Enter 1 to list books.");
    }

}
