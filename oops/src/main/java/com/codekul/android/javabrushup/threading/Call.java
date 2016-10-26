package com.codekul.android.javabrushup.threading;

/**
 * Created by aniruddha on 26/10/16.
 */
public class Call extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i <100  ; i++) {
            System.out.println("Call - "+i);
        }
    }
}
