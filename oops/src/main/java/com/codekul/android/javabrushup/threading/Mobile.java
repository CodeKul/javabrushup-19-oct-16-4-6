package com.codekul.android.javabrushup.threading;

/**
 * Created by aniruddha on 26/10/16.
 */
public class Mobile {

    public void makeCall(){
        Call call = new Call();
        call.start();
    }

    public void makeVideoCall(){
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    public void capturePhoto(){

        Thread thread = new Thread(new Camera());
        thread.start();
    }
}
