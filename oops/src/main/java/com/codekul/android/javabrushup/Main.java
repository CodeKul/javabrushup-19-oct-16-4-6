package com.codekul.android.javabrushup;


import com.codekul.android.javabrushup.classesandobjects.Car;

/**
 * Created by aniruddha on 21/10/16.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        classesAndObjects();
    }

    public static void classesAndObjects(){
        Car car = new Car();
        car.showCarInfo();
    }
}
