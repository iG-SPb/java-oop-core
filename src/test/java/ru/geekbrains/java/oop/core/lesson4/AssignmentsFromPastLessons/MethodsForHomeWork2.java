package ru.geekbrains.java.oop.core.lesson4.AssignmentsFromPastLessons;

public class MethodsForHomeWork2 {

    int intArr = 0;

    public int runArray (String[][] myArr) throws MyArraySizeException, MyArrayDataException {
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
        return sumArr;
    }

    public void sumArray(String[][] myArr, int y, int i) throws MyArrayDataException {
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
}
