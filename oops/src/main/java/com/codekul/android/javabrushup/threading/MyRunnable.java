package com.codekul.android.javabrushup.threading;

/**
 * Created by aniruddha on 26/10/16.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 100 ; i++) {
            System.out.println("Runnable - "+i);
        }
    }
}
