package com.codekul.android.javabrushup.interfaces;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Bike implements GpsListener{

    private String type;
    private int verion;
    private int rpm;

    public void ride(){
        rpm++;
    }

    @Override
    public void sendLocation() {
        System.out.println("Bike Sending location");
    }

    /*public void sendLocation() {

    }*/
}
