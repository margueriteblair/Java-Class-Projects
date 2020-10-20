package com.margieblair;

public class Car {
    private String color;
    public String model;
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

    public void drive() {
        if (!isOn) {
            System.out.println("Lol, your car needs to be on first");
            return;
            //you can return nothing
        }
        System.out.println("Moving!");

    }

    public void setisOn() {
        //you can addsome logic to your setters
        //otherwise, you might as well have a public var, you know
        if (isOn && on) {
            System.out.println("Screech");
        }

        if (!isOn && !on) {
            System.out.println("Radio starting...");
        }
        isOn = !isOn;
    }

    public void displayDetails() {
        System.out.println("");
    }

    @Override //called a flag
    //overriding the behavior of that toString() method
    public String toString() {
        return "You are driving a" + color + "car " + year + " " + model + ".";
    }

}
