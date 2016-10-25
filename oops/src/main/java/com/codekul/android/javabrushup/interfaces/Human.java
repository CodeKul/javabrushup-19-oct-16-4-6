package com.codekul.android.javabrushup.interfaces;


/**
 * Created by aniruddha on 25/10/16.
 */
public class Human implements GpsListener{

    private String name;
    private String city;
    private int legs;

    public void walk(){
        legs++;
    }

    @Override
    public void sendLocation() {
        System.out.println("Human sending location");
    }

    /*public void sendLocation(){

    }*/
}
