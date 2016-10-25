package com.codekul.android.javabrushup.inheritance;

/**
 * Created by aniruddha on 25/10/16.
 */
public class Bird {

    // is A relationship
    private int weight;
    private int flyingSpeed;
    private boolean isMigrated;
    public String name;
    protected float price;
    boolean isFlying;

    //getter and setter

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public boolean isMigrated() {
        return isMigrated;
    }

    public void setMigrated(boolean migrated) {
        isMigrated = migrated;
    }

    public String toString() {
        return "Bird { " +
                "weight=" + weight +
                ", flyingSpeed=" + flyingSpeed +
                ", isMigrated=" + isMigrated +
                " } ";
    }
}
