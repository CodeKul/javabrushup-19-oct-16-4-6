package com.codekul.android.javabrushup;


import com.codekul.android.javabrushup.abstractclassess.Jungle;
import com.codekul.android.javabrushup.classesandobjects.Car;
import com.codekul.android.javabrushup.inheritance.Bird;
import com.codekul.android.javabrushup.interfaces.Road;
import com.codekul.android.javabrushup.staticdemo.Connection;
import com.codekul.android.javabrushup.staticdemo.Db;

/**
 * Created by aniruddha on 21/10/16.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        interfaces();
    }

    public static void classesAndObjects(){
        Car car = new Car();
        car.showCarInfo();

        Car.whatsVersion();
    }

    public static void staticDemo(){
        Db db1 = new Db();

        Db db2 = new Db();
        Connection con = Db.getCon();
    }

    public static void inheritance(){

        Bird bird = new Bird();
        bird.setFlyingSpeed(10);
        bird.setMigrated(true);
        bird.setWeight(50);

        Bird birdParrot = new Bird();
        birdParrot.setFlyingSpeed(50);

        int weight = bird.getWeight();
        int speed = bird.getFlyingSpeed();
        boolean isMigrated = bird.isMigrated();

        System.out.println(bird.toString());
        System.out.println(bird);
    }

    public static void abstractClasess(){

        Jungle jungle = new Jungle();
        jungle.sectors();
        jungle.checkSomething();
    }

    public static void interfaces(){

        Road road = new Road();
        road.travel();
    }
}
