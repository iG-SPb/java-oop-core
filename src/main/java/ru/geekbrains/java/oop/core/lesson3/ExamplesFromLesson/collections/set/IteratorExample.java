package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.collections.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");

        Iterator<String> iterator = cats.iterator();

        // System.out.println(iterator.hasNext());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(iterator.hasNext());
    }
}
