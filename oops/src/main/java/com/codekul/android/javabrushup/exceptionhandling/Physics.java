package com.codekul.android.javabrushup.exceptionhandling;

/**
 * Created by aniruddha on 26/10/16.
 */
public class Physics {

    private int result;

    // f = ma
    public int accelaration(int force, int mass) {

        try {
            //System.exit(0);
            //result = force / mass; // throw new ArithmaticException();
        }
        catch (ArithmeticException e){
            System.out.println("i caught exception");
        }
        finally {
            System.out.println("I will execute everytime ...");
        }

        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return result;
    }

    public int accelaration(int force, int mass, int gravity) throws RuntimeException {

        //if(gravity < 0) throw new RuntimeException();
        result = (force/mass) / gravity;

        return result;
    }
}
