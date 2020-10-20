package com.cars;

public class Car {
    private int wheels;
    private String make;
    private String model;

    //constructor
    public Car(int wheels, String make, String model) {
        this.wheels = wheels;
        this.make = make;
        this.model = model;
    }


    public void startEngine() {
        System.out.println("VRRROOOOM VROM VRUM i AM CAR");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setMake(String newMake) {
        make = newMake;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setWheels(int wheelNum) {
        wheels = wheelNum;
    }

}
