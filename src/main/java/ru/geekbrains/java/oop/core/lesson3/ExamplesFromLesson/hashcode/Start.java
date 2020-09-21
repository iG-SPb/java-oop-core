package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.hashcode;

public class Start {
    public static void main(String[] args) {
        System.out.println(new Dog("Ларри", 55443322).hashCode());
        System.out.println(new Dog("Ларри", 55443322).hashCode());
        System.out.println(new Dog("Ларри", 55443322).hashCode());

        System.out.println("".hashCode());
        System.out.println(Integer.valueOf(5).hashCode());

    }
}
