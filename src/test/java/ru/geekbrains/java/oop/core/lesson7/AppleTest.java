package ru.geekbrains.java.oop.core.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple testApple = new Apple();

    @Test
    @DisplayName("Test name")
    void getName() {
        Assertions.assertEquals("Apple", testApple.getName());
    }

    @Test
    @DisplayName("Test weight")
    void getWeitht() {
        Assertions.assertEquals(1.0f, testApple.getWeight());
    }
}