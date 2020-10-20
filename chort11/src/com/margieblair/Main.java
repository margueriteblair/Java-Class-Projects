package com.margieblair;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello CareerDevs");
        Car myCar = new Car("blue", "Subaru", "1234", 2021);
        System.out.println(myCar.model);
        myCar.model = "Roadster X"
        System.out.println(myCar.model);
        myCar.toString();

    }
}
