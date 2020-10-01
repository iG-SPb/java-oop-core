package ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons;

public class HomeWork2 {

    public static void main(String[] args) {

        MethodsForHomeWork2 myMethods = new MethodsForHomeWork2();
        String[][] arr1 = {{"1"}, {"2"}, {"test"}, {"4"}};
        String[][] arr2 = {{"test2"}, {"test2"}, {"test3"}};
        String[][] arr3 = {{"test3"}, {"test2"}, {"test3"}, {"test4"}, {"test5"}};

        try {
            myMethods.runArray(arr2);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            myMethods.runArray(arr1);
        }catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            myMethods.runArray(arr3);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
