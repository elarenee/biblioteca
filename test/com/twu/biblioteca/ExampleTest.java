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
    ArrayList<String> listOfBooks;
    private BibliotecaApp biblioteca;

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
        listOfBooks = new ArrayList<String>();
        biblioteca = new BibliotecaApp(printstream, listOfBooks);
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
    public void shouldPrintOneBookWhenOneBookInBiblioteca() {
        listOfBooks.add("House of Sand and Fog");
        biblioteca.openLibrary();
        verify(printstream).print(contains("House of Sand and Fog"));
    }


}
