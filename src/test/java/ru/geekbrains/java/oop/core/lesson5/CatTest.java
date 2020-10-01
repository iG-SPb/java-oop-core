package ru.geekbrains.java.oop.core.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.core.lesson1.Cat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {
    @Test
    public void nameTest(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
            // стандартный вывод
            PrintStream old = System.out;
            Cat tom = new Cat("Tom", 3, 15);
            // переназначение вывода
            System.setOut(new PrintStream(output));
            tom.animalRunning(4);
            Assertions.assertEquals(output.toString().replaceAll("\n",""), "Run cat Tom\r");
            //обрезаем /n, если println, так как текст без /n
            // возврат стандартного вывода
            System.setOut(old);
    }
}
