package ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons;

import java.util.HashMap;
import java.util.Set;

public class MethodsForPhoneBook {
    // вывод записи из телефонной книги
    public String getRecord(HashMap book, String name) {
        if ( book.containsValue(name) ) {
            System.out.println("Имя - " + name + ":");
            Set<String> keys = book.keySet();
            for( String key: keys ) {
                // вывод ключа System.out.println(key);
                // вывод значения по ключу System.out.println(book.get(key));
                if (book.get(key).equals(name)) {
                    System.out.println("- номер: " + key + ";");
                }
            }
        } else {
            System.out.println("Имя - " + name + ":");
            System.out.println("- запись отсутствует в телефонной книге");
            return "no name";
        }
        return name;
    }

    // добавление новой записи в телефонную книгу
    public void addRecord(HashMap book, String number, String name) {
        book.put(number, name);
    }
}
