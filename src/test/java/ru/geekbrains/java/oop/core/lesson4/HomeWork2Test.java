package ru.geekbrains.java.oop.core.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons.MethodsForHomeWork2;
import ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons.MyArrayDataException;
import ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons.MyArraySizeException;

public class HomeWork2Test {
    @DisplayName("Проверка метода runArray:")
    @Test               // тест
    public void check_runArray() {
        String[][] arr1 = {{"1"}, {"2"}, {"8"}, {"4"}};
        String[][] arr2 = {{"1"}, {"2"}, {"test"}, {"4"}};
        MethodsForHomeWork2 myMethods = new MethodsForHomeWork2();
        Assertions.assertAll( "Данные для проверки: 15 и 7",           // проверка всех условий
                () -> Assertions.assertEquals(15, myMethods.runArray(arr1)),
                () -> Assertions.assertEquals(7, myMethods.runArray(arr2))
        );
    }

    @DisplayName("Проверка исключения для размера массива:")
    @Test               // тест
    public void check_runArray_ExceptionSize() {
        String[][] arr1 = {{"1"}, {"2"}, {"8"}, {"4"}, {"9"}};
        String[][] arr2 = {{"1"}, {"2"}, {"test"}};
        MethodsForHomeWork2 myMethods = new MethodsForHomeWork2();
        Assertions.assertThrows(            // проверка срабатывания исключения (размер массива не 4)
                MyArraySizeException.class,
                () -> myMethods.runArray(arr1)
        );
        Assertions.assertThrows(            // проверка срабатывания исключения (размер массива не 4)
                 MyArraySizeException.class,
                 () -> myMethods.runArray(arr2)
        );
    }

    @DisplayName("Проверка исключения для данных массива:")
    @Test               // тест
    public void check_runArray_ExceptionData() {
        String[][] arr1 = {{"1"}, {"2"}, {"error"}, {"4"}};
        MethodsForHomeWork2 myMethods = new MethodsForHomeWork2();
        Assertions.assertThrows(            // проверка срабатывания исключения (данные не int)
                MyArrayDataException.class,
                () -> myMethods.sumArray(arr1, 2, 0)
        );
    }
}
