package ru.geekbrains.java.oop.core.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrangeTest {

    Orange testOrange = new Orange();

    @Test
    @DisplayName("Test name")
    void getName() {
        Orange testOrange = new Orange();
        Assertions.assertEquals("Orange", testOrange.getName());
    }

    @Test
    @DisplayName("Test weight")
    void getWeitht() {
        Assertions.assertEquals(1.5f, testOrange.getWeight());
    }
}