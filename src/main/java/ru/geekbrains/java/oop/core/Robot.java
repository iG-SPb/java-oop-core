package ru.geekbrains.java.oop.core;

public class Robot implements Jump, Running {

    private String name;
    private int jump;
    private int track;

    Robot(String name, int jump, int track) {
        this.name = name;
        this.jump = jump;
        this.track = track;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setJump(int jump) {
        this.jump = jump;
    }

    int getJump() {
        return this.jump;
    }

    void setTrack(int track) {
        this.track = track;
    }

    int getTrack() {
        return this.track;
    }

    public void animalJump(int myWall) {
        if( myWall < this.jump) {
            System.out.println("Jump robot " + this.name);
        } else
            System.out.println("No jump robot " + this.name);
    }

    public void animalRunning(int myTrack) {
        if( myTrack < this.track) {
            System.out.println("Run robot " + this.name);
        } else
            System.out.println("No run robot " + this.name);
    }
}
