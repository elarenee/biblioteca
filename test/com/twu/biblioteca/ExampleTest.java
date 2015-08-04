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

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
        listOfBooks = new ArrayList<String>();
    }

    @Test
    public void shouldWelcomeWhenBibliotecaOpens() {
        BibliotecaApp biblioteca = new BibliotecaApp(printstream, listOfBooks);
        biblioteca.openLibrary();
        verify(printstream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldNotPrintAnythingWhenLibraryIsEmpty() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printstream, listOfBooks);
        bibliotecaApp.openLibrary();
        verify(printstream).println("");
    }



}
