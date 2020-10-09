package ru.geekbrains.java.oop.core.lesson7;

public class HomeWork7 {

    public static void main(String[] args) {

        Apple myApple1 = new Apple();
        Apple myApple2 = new Apple();
        Apple myApple3 = new Apple();
        Box<Apple> box1 = new Box<>(myApple1, myApple2, myApple3);
        System.out.println("В коробке " + box1.sizeBox() + " яблок(а) весом " + box1.getWeight());

        Orange myOrange1 = new Orange();
        Orange myOrange2 = new Orange();
        //Box<Orange> box2 = new Box<>(myOrange1, myOrange2);
        Box<Orange> box2 = new Box<>();
        box2.add(myOrange1);
        box2.add(myOrange2);
        System.out.println("В коробке " + box2.sizeBox() + " апельсин(а) весом " + box2.getWeight());

        if ( box1.compare(box2) ) {
            System.out.println("Вес коробок совпадает");
        } else {
            System.out.println("Вес коробок не совпадает");
        }

        System.out.println("Перемещаем фрукты из 2-0й коробки в дополнительную коробку");
        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
        System.out.println("Во второй коробке " + box2.sizeBox() + " фрукт(ов) весом " + box2.getWeight());
        System.out.println("В дополнительной коробке " + box3.sizeBox() + " фрукта(ов) весом " + box3.getWeight());
    }
}
