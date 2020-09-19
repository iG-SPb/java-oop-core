package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.equals;

public class Start {
    public static void main(String[] args) {
        Dog larry = new Dog("Ларри", 55443322);
        Dog larry_2 = new Dog("Ларри", 55443322);

        System.out.println(larry.equals(larry_2));
    }
}
