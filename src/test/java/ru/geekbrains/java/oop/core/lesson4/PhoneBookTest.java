package ru.geekbrains.java.oop.core.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class PhoneBookTest {
    @DisplayName("Проверка метода getRecord из PhoneBook")
    @Test
    public void check_getRecord() {
        MethodsForPhoneBook myMethods = new MethodsForPhoneBook();
        HashMap<String, String> myPhoneBook = new HashMap<>();
        // ввод данных
        myPhoneBook.put("(921)-123-45-67", "Орлов");
        // проверка чтения записанных данных
        Assertions.assertEquals("Орлов", myMethods.getRecord(myPhoneBook,"Орлов"));
    }
    @DisplayName("Проверка метода addRecord из PhoneBook")
    @Test
    public void check_addRecord() {
        HashMap<String, String> myPhoneBook = new HashMap<>();
        MethodsForPhoneBook myMethods = new MethodsForPhoneBook();
        // запуск метода
        myMethods.addRecord( myPhoneBook, "(921)-111-11-11", "Иванов");
        // проверка результата
        Assertions.assertEquals("Иванов", myPhoneBook.get("(921)-111-11-11"));
    }
}
