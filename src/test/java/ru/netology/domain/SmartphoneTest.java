package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    private Product smartphone = new Smartphone(11, "Galaxy S", 15000, "Samsung");

    @Test
    void searchByMakerSmartphone() {
        boolean actual = smartphone.matches("Samsung");
        assertEquals(true, actual);
    }

    @Test
    void searchByMakerSmartphoneInvalid() {
        boolean actual = smartphone.matches("Sam-sung");
        assertEquals(false, actual);
    }

}
