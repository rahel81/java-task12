package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private Product book = new Book(1, "Прованс", 100, "Мейл");


    @Test
    void searchByAuthorBook() {
        boolean actual = book.matches("Мейл");
        assertEquals(true, actual);
    }

    @Test
    void searchByAuthorBookInvalid() {
        boolean actual = book.matches("Меил");
        assertEquals(false, actual);
    }
}
