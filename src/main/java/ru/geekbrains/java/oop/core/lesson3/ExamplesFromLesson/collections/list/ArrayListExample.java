package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.collections.list;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

    public static void main(String[] args) {

        // Создание коллекции элементов
        Collection <String> animalList = new ArrayList<>();

        // Добавление элементов

        // одного элемента
        animalList.add("Лорд1");
        animalList.add("Лорд2");
        animalList.add("Лорд3");
        animalList.add("Лорд4");

        // элементов коллекции
        Collection <String> catList = new ArrayList<>();
        catList.add("Борис1");
        catList.add("Борис2");
        animalList.addAll(catList);

        // Определение размера
        System.out.println("Размер - " + animalList.size());

        // проверка на пустоту
        System.out.println("проверка на пустоту " + animalList.isEmpty());

        // Проверки на вхождение
        System.out.println("одного элемента: " + catList.contains("Барсик"));
        System.out.println("всех элементов коллекции c: "+ animalList.containsAll(catList));

        // Удаление элементов
        System.out.println("одного элемента "+ catList.remove("Шарик"));
        System.out.println("элементов коллекции "+animalList.removeAll(catList));
        System.out.println("Определение размера " + animalList.size());

        animalList.clear();
        System.out.println("Определение размера " + animalList.size());
    }
}
