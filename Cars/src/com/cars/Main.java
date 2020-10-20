package com.cars;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car poop = new Car(4, "Toyota", "Camry");
        poop.startEngine();
        System.out.println(poop.getMake());

        Motorcycle moto = new Motorcycle(2, "I know nothing", "About motorcycles", false);
        moto.startEngine();

        GoKart newKart = new GoKart(4, "honda", "civic", "7 flags");
        newKart.startEngine();
    }
}
