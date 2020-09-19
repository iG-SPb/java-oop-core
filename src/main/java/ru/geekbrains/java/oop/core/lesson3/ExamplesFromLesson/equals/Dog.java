package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.equals;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                weight == dog.weight &&
                dogPassportNumber == dog.dogPassportNumber &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, weight, dogPassportNumber);
    }
}
