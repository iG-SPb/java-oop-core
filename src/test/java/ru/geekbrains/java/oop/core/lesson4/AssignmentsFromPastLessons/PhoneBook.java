package ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) throws ParseException {

        MethodsForPhoneBook myMethods = new MethodsForPhoneBook();
        HashMap<String, String> myPhoneBook = new HashMap<>();

        // заполнение телефонного справочника сгенерированными данными
        for (int i = 0; i < 3; i++) {
            myPhoneBook.put(myGenerateNumber(), myGenerateName());
        }

        // добавление записей в телефонную книгу
        myMethods.addRecord( myPhoneBook, "(921)-111-11-11", "Иванов");
        myMethods.addRecord( myPhoneBook, "(921)-222-22-22", "Иванов");
        myMethods.addRecord( myPhoneBook, "(921)-333-33-33", "Иванов");
        myMethods.addRecord( myPhoneBook, "(921)-555-55-55", "Сидоров");

        // вывод всей телефонной книги
        for (Map.Entry entry : myPhoneBook.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        System.out.println("-----------------------------------------------");

        // поиск имени в телефонной книге
        myMethods.getRecord( myPhoneBook, "Петров");
        myMethods.getRecord( myPhoneBook, "Иванов");
        myMethods.getRecord( myPhoneBook, "Сидоров");
    }

    // генератор имени владельца телефонного номера
    static String myGenerateName() {
        int minNameNumber = 100;
        int maxNameNumber = 999;
        int phoneName_int;
        String phoneName_String;

        phoneName_int = (int)(( Math.random() * (maxNameNumber - minNameNumber + 1) + minNameNumber ));
        phoneName_String = Integer.toString(phoneName_int);
        return "generateName" + phoneName_String;
    }

    // генератор телефонного номера
    static String myGenerateNumber() throws ParseException {
        long minPhoneNumber = 1000000000L;
        long maxPhoneNumber = 9999999999L;
        long phoneNumber_long;
        String phoneNumber_String;
        String phoneMask= "(###)-###-##-##";

        phoneNumber_long = (long)(( Math.random() * (maxPhoneNumber - minPhoneNumber + 1) + minPhoneNumber ));
        phoneNumber_String = Long.toString(phoneNumber_long);
        MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        return maskFormatter.valueToString(phoneNumber_String);
    }
}
