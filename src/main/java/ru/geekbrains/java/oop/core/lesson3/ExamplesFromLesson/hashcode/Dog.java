package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.hashcode;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;

    private int dogPassportNumber;

    public Dog(String name, int dogPassportNumber) {
        this.name = name;
        this.dogPassportNumber = dogPassportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, weight, dogPassportNumber);
    }
}
