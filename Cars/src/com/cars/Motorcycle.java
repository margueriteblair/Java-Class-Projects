package com.cars;

public class Motorcycle extends Car{
    private boolean hasTrunk;

    public Motorcycle(int wheels, String make, String model, boolean hasTrunk) {
        super(wheels, make, model);
        this.hasTrunk = hasTrunk;
    }

//    public void break() {
//        System.out.println("");
//    }
    public void safety() {
        System.out.println("You need a helmet to ride bb");
    }


    @Override
    public void startEngine() {
        System.out.println("I am a motorcycle and I sound different GRRRRR");
    }
}
