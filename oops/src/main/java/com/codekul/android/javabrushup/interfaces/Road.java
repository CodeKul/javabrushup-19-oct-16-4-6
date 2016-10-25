package com.codekul.android.javabrushup.interfaces;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Road {

    public void travel(){

        Human human = new Human();
        human.walk();
        human.sendLocation();

        Bike bike = new Bike();
        bike.ride();
        bike.sendLocation();

        Locator locator = new Locator();
        locator.locate(human);
        locator.locate(bike);
    }
}
