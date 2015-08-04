package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ExampleTest {

    private PrintStream printstream;

    @Before
    public void setUp() {
        printstream = mock(PrintStream.class);
    }

    @Test
    public void shouldWelcomeWhenBibliotecaOpens() {
        BibliotecaApp biblioteca = new BibliotecaApp(printstream);
        biblioteca.openLibrary();
        verify(printstream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldListBooksAfterWelcome() {
        BibliotecaApp biblioteca = new BibliotecaApp(printstream);
        biblioteca.openLibrary();
        verify(printstream).println("Welcome to Biblioteca!");
        verify(printstream).println("House of Sand and Fog");
        verify(printstream).println("Game of Thrones");
    }
}
