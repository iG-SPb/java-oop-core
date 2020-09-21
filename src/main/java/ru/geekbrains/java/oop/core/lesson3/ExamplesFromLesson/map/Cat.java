package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.map;

public class Cat {
    private String name ;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
