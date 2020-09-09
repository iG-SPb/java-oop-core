package ru.geekbrains.java.oop.core;

public class HomeWork1 {
    public static void main(String[] args) {

        Cat tom = new Cat("Kisa", 3, 20);
        Human adam = new Human("Adam", 1, 10);
        Robot rob = new Robot("Robotics", 0, 5);
        Wall myWall1 = new Wall(1);
        Wall myWall2 = new Wall(3);
        Wall myWall3 = new Wall(10);
        Track myTrack1 = new Track(1);
        Track myTrack2 = new Track(5);
        Track myTrack3 = new Track(20);

        Jump[] myJump = {tom, adam, rob};
        Running[] myRunning = {tom, adam, rob};
        Wall[] myWall = {myWall1, myWall2, myWall3};
        Track[] myTrack = {myTrack1, myTrack2, myTrack3};

        for (Jump allJump : myJump) {
            for (int i = 0; i < myWall.length; i++) {
                allJump.animalJump(myWall[i].getHeightWall());
            }
        }

        for(Running allRunning : myRunning) {
            for (int i = 0; i < myWall.length; i++) {
                allRunning.animalRunning(myTrack[i].getLenghtTrack());
            }
        }
    }
}
