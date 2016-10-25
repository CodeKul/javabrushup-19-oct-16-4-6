package com.codekul.android.javabrushup.abstractclassess;


import com.codekul.android.javabrushup.inheritance.Bird;
import com.codekul.android.javabrushup.inheritance.Parrot;
import com.codekul.android.javabrushup.inheritanceout.PeaCock;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Jungle {

    public void sectors(){

        Tiger tiger = new Tiger();
        tiger.walk();

        Animal animal = new Tiger();
        animal.walk();

        //Parrot parrot = (Parrot) new Bird();
    }

    public void doSomeThing(Bird bird) {

        if(bird instanceof Parrot){
            Parrot parrot = (Parrot) bird;
        }
        if(bird instanceof PeaCock){
            PeaCock peaCock = (PeaCock) bird;
        }
    }

    public void checkSomething(){

        Parrot parrot = new Parrot();
        doSomeThing(parrot);

        PeaCock peaCock = new PeaCock();
        doSomeThing(peaCock);
    }
}
