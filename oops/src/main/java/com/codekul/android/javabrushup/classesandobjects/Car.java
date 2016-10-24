package com.codekul.android.javabrushup.classesandobjects;

/**
 * Created by aniruddha on 24/10/16.
 */
public class Car {

    // state
    private int speed;
    private String name;

    public Car() { // default constructor
        speed = 0;
        name = "car";
    }
    // behavior
    public void increaseSpeed() {
        speed++;
    }

    public void showCarInfo(){
        System.out.println("\n Name - " + name + "\n Speed - "+speed);
    }
}
