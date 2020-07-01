package com.modules;

public abstract class FMthdPlan {
    /*
    A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
    In other words, subclasses are responsible to create the instance of the class.

    Factory Method Pattern allows the sub-classes to choose the type of objects to create.


    */

    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}