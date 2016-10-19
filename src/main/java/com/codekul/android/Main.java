package com.codekul.android;

/**
 * Created by aniruddha on 19/10/16.
 */
public class Main {

    public static void main(String[] args) {

        int i= 10;
        Thread t = new Thread(()->{});
        t.start();

        Runnable run = Main::my; // functional

        System.out.println("Hello to Java -- I am gradle");
    }

    public static void my(){

    }
}
