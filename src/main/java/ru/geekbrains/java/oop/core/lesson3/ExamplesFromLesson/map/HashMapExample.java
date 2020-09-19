package ru.geekbrains.java.oop.core.lesson3.ExamplesFromLesson.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Human, Cat> humanCatHashMap = new HashMap<>();
        Human alex = new Human("Алексей");
        Human kate = new Human("Катя");

        Cat barsic = new Cat("Барсик");
        Cat vasiliy = new Cat("Василий");

        //Добавление объектов
        humanCatHashMap.put(alex,barsic);
        humanCatHashMap.put(kate,barsic);
        humanCatHashMap.put(kate,vasiliy);

        //Получение размера
        System.out.println(humanCatHashMap.size());

        //Получение объектов по ключу
        System.out.println(humanCatHashMap.get(alex));
        System.out.println(humanCatHashMap.get(kate));


        //Получение объектов по ключу
        System.out.println(humanCatHashMap.containsKey(kate));
        System.out.println(humanCatHashMap.containsValue(vasiliy));

        //Получение ключей/значений
        humanCatHashMap.put(kate,barsic);

        Set<Human> humans = humanCatHashMap.keySet();
        System.out.println(humans);
        Collection<Cat> values = humanCatHashMap.values();
        System.out.println(values);

        //Удаление элементов

        humanCatHashMap.remove(kate);
        System.out.println(humanCatHashMap);

    }
}
