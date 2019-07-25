package com.mbednarz.ujopde.s9;

public class OOP {

    public static void main(String[] args) {

        Monitor sonyDisp = new Monitor();
            sonyDisp.height = 125;

        Monitor lgDisp = new Monitor();
            lgDisp.width = 150;

        System.out.println(sonyDisp.height);
        System.out.println(lgDisp.width);

        String name = "Matthew";

    }
}

class Monitor {
    int width;
    int height;

    void turnOn() {
    }

    void turnOff() {
    }
}
