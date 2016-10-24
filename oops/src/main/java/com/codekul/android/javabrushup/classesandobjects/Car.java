package com.codekul.android.javabrushup.classesandobjects;

/**
 * Created by aniruddha on 24/10/16.
 */
public class Car {

    // state
    private int speed;
    private String name;
    private static int ver = 10;

    public Car() { // default constructor
        speed = 0;
        name = "car";
    }
    // behavior
    public void increaseSpeed() {
        speed++;
        ver = 1; // non static methods can access static content
    }

    public void showCarInfo(){
        System.out.println("\n Name - " + name + "\n Speed - "+speed);
    }

    public static void whatsVersion(){
        //speed = 0; static method can access only static content
         ver = 1;
    }
}
