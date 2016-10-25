package com.codekul.android.javabrushup.staticdemo;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Db {

    private static Connection con;

    static  { //static block
        con = new Connection();
        System.out.println("Static Block");
    }

    {
        //init block
        System.out.println("Init Block");
    }

    public Db() {
        System.out.println("Cons");
    }

    public static Connection getCon(){
        return con;
    }
}