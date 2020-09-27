package ru.geekbrains.java.oop.core.lesson4;

import java.util.ArrayList;
import java.util.Collections;

public class Nomenclature {
    public static void main(String[] args) {
        ArrayList<String> myNomenclature = new ArrayList<>();
        myNomenclature.add("name1");
        myNomenclature.add("name2");
        myNomenclature.add("name3");
        myNomenclature.add("name4");
        myNomenclature.add("name5");
        myNomenclature.add("name1");
        myNomenclature.add("name1");
        myNomenclature.add("name2");
        myNomenclature.add("name3");
        myNomenclature.add("name4");
        myNomenclature.add("name5");
        myNomenclature.add("name5");
        myNomenclature.add("name5");
        myNomenclature.add("name5");
        myNomenclature.add("name5");

        System.out.println(myNomenclature);             // до сортировки
        Collections.sort(myNomenclature);               // сортировка коллекции
        System.out.println(myNomenclature);
        Object temp_element = myNomenclature.get(0);    // первый элемент коллекции
        int temp_count = 0;                             // для подсчета количества повторений
        for(Object element : myNomenclature) {
            if( temp_element.equals(element) ) {        // совпадение с выбранным элементом
                temp_count++;
            } else {                                    // завершение совпадения с выбранным элементом
                System.out.println("Элемент: " + temp_element + " встречается в коллекции " + temp_count + " раз(а).");
                temp_element = element;
                temp_count = 1;
            }
        }
        System.out.println("Элемент: " + temp_element + " встречается в коллекции " + temp_count + " раз(а).");
    }
}
