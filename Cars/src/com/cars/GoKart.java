package com.cars;

public class GoKart extends Car {
    private String amusementParkName;

    public GoKart(int wheels, String make, String model, String amusementParkName) {
        super(wheels, make, model);
        this.amusementParkName = amusementParkName;
    }

    public void goKartMethod() {
        System.out.println("I am a go cart");
    }

    public String getNameOfAmusementPark() {
        return amusementParkName;
    }

    @Override
    public void startEngine() {
        System.out.println("tf does a gokart even sound like??? bye");
    }
}
