package ru.geekbrains.java.oop.core.lesson4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo_FirstJUnitsTest {

    @BeforeAll          // выполняется перед блоком тестов
    public static void beforeAll() {
        System.out.println("FirstJUnitsTest.beforeAll");
    }

    @BeforeEach         // выполняется перед каждым тестом
    public void beforeEach() {
        System.out.println("FirstJUnitsTest.beforeEach");
    }

    @DisplayName("test-1")
    @Test               // тест
    public void checkTest1() {
        System.out.println("FirstJUnitsTest.checkTest1");
        Assertions.assertEquals(2, 1 + 1);
    }

    @Disabled           // приостановлен
    @DisplayName("test-2")
    @Test               // тест
    public void checkTest2() {
        System.out.println("FirstJUnitsTest.checkTest2");
        Assertions.assertEquals(2, 1 + 1);
    }

    @Timeout(1)         // должен выполниться в течение определенного времени
    @DisplayName("test-3")
    @Test               // тест
    public void checkTest3() {
        System.out.println("FirstJUnitsTest.checkTest3");
        Assertions.assertEquals(2, 1 + 1);
    }

    @DisplayName("test-4")
    @RepeatedTest(3)               // тест повторяется 3 раза
    public void checkTest4() {
        System.out.println("FirstJUnitsTest.checkTest4");
        Assertions.assertEquals(2, 1 + 1);
    }

    @DisplayName("test-5")
    @ParameterizedTest              // тест с разными аргументами
    @MethodSource("dataProvider")
    public void checkTest5(int expectedValue, int sum) {
        Assertions.assertEquals(expectedValue, sum+1);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(11,10),
                Arguments.of(3,4),
                Arguments.of(3,2)
        );
    }

    @DisplayName("test-6")
    @Test               // тест
    public void checkTest6() {
        System.out.println("FirstJUnitsTest.checkTest6");
        Assertions.assertThrows(            // проверка срабатывания исключения (нет такого файла)
                FileNotFoundException.class,
                () -> new Scanner( new File("src/test/resources/file1_test.txt"))
        );
    }

    @DisplayName("test-7")
    @Test               // тест
    public void checkTest7() {
        System.out.println("FirstJUnitsTest.checkTest7");
        String testFirstName = "Ivanov";
        String testSecondName = "Ivan";
        Assertions.assertAll( "Данные для проверки:",           // проверка всех условий
                () -> Assertions.assertEquals(testFirstName, "Ivaniv"),
                () -> Assertions.assertEquals(testSecondName, "Ivan")
        );
    }

    @AfterEach          // выполняется после каждого теста
    public void afterEach() {
        System.out.println("FirstJUnitsTest.afterEach");
    }

    @AfterAll           // выполняется после блока тестов
    public static void afterAll() {
        System.out.println("FirstJUnitsTest.afterAll");
    }
}
