package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lfitzger on 8/4/15.
 */
public class BookTest {


    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book("House of Sand and Fog", "Andre Dubus", 2003);
    }

    @Test
    public void shouldAccessBookAuthor() {
        String author = book.getAuthor();
        assertEquals("Andre Dubus", author);
    }

    @Test
    public void shouldAccessYearPublished() {
        int yearPublished = book.getYearPublished();
        assertEquals(2003, yearPublished);
    }

    @Test
    public void shouldAccessTitle() {
        String title = book.getTitle();
        assertEquals("House of Sand and Fog", title);
    }

}
