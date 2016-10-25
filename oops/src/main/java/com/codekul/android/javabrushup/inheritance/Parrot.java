package com.codekul.android.javabrushup.inheritance;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Parrot /*is a*/ extends Bird{

    public Parrot() {
        isFlying = true; // public
        name = "ZilMil"; // protected
        price = 500; // default
//        getFlyingSpeed = 40;
    }
}
