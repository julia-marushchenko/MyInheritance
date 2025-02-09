package com.main;

public class Vehicle {

    int cost = 0;
    int mileage = 0;

    public Vehicle(int c, int m) {
        cost = c;
        mileage = m;
    }

    public void show_vehicle_details() {
        System.out.println("I am a vehicle");
        System.out.println("Cost of vehicle is " + cost);
        System.out.println("Mileage of vehicle is " + mileage);
    }
}
