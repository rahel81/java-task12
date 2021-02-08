package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    private Product product = new Product(7, "X", 500);

    @Test
    void searchByProduct() {
        boolean actual = product.matches("X");
        assertEquals(true, actual);
    }

    @Test
    void searchByNotProductForTest() {
        boolean actual = product.matches("");
        assertEquals(false, actual);
    }
}
