package ru.geekbrains.java.oop.core.lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    Apple myApple1 = new Apple();
    Apple myApple2 = new Apple();
    Apple myApple3 = new Apple();
    Box<Apple> box1 = new Box<>(myApple1, myApple2, myApple3);

    @Test
    void add() {
        Apple myApple4 = new Apple();
        box1.add(myApple4);
        Assertions.assertEquals(4, box1.sizeBox());
    }

    @Test
    void sizeBox() {
        Assertions.assertEquals(3, box1.sizeBox());
    }

    @Test
    void clear() {
        box1.clear();
        Assertions.assertEquals(0, box1.sizeBox());
    }

    @Test
    void getWeight() {
        Assertions.assertEquals(3.0f, box1.getWeight());
    }

    @Test
    void compare() {
        Orange myOrange1 = new Orange();
        Orange myOrange2 = new Orange();
        Box<Orange> box2 = new Box<>(myOrange1, myOrange2);
        Assertions.assertTrue(box1.compare(box2));
    }

    @Test
    void transfer() {
        Box myBox = new Box();
        Assertions.assertEquals(3, box1.sizeBox());
        box1.transfer(myBox);
        Assertions.assertEquals(0, box1.sizeBox());
        Assertions.assertEquals(3, myBox.sizeBox());
    }
}