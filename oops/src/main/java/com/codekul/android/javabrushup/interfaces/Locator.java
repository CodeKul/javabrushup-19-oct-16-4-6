package com.codekul.android.javabrushup.interfaces;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Locator {

    public void locate(GpsListener listener){
        listener.sendLocation();
    }
}
