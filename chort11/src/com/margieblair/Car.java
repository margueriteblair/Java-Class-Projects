package com.margieblair;

public class Car {
    private String color;
    private String model;
    private String vin;
    private int tireCount;
    private int year;
    private boolean isOn; //common syntax for boolean item to start with is

    public Car(String color,String model, String vin, int tireCount, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = tireCount;
        this.year = year;
        isOn = false; //can be default
    }
    //constructor overloading man!!
    public Car(String color,String model, String vin, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = 4;
        this.year = year;
        isOn = false; //can be default
    }

}
