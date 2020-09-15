package ru.geekbrains.java.oop.core.lesson2;

public class HomeWork2 {

    public static int intArr = 0;

    private static void runArray (String[][] myArr) throws MyArraySizeException, MyArrayDataException {
        int sumArr = 0;
        System.out.println("--------------------------------");
        System.out.println("Размер массива - " + myArr.length);
        if (myArr.length != 4) {
            throw new MyArraySizeException("Некорректный размер массива");
        }
        for (int y = 0; y < myArr.length; y++) {
            for (int i = 0; i < myArr[y].length; i++) {
                System.out.println(myArr[y][i]);
                try {
                    sumArray(myArr, y, i);
                }catch (MyArrayDataException e){
                    e.printStackTrace();
                }
                sumArr += intArr;
            }
        }
        System.out.println("Сумма элементов: " + sumArr);
    }

    private static void sumArray (String[][] myArr, int y, int i) throws MyArrayDataException {
        intArr = 0;
        try {
            intArr = Integer.parseInt(myArr[y][i]);
        }catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        finally{
            if (intArr == 0) {
                throw new MyArrayDataException("Некорректное значение. y-" + y + "; i-" +i);
            }
        }
    }

    public static void main(String[] args) {

        String[][] arr1 = {{"1"}, {"2"}, {"test"}, {"4"}};
        String[][] arr2 = {{"test2"}, {"test2"}, {"test3"}};
        String[][] arr3 = {{"test3"}, {"test2"}, {"test3"}, {"test4"}, {"test5"}};

        try {
            runArray(arr2);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            runArray(arr1);
        }catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            runArray(arr3);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
