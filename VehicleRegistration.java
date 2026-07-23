package com.java.basic;

public class VehicleRegistration {
    public static void main(String[] args) {

        int vehicleNumber = 56789;
        short engineCapacity = 1498;
        float mileage = 18.5f;
        char fuelType = 'P';   // P = Petrol, D = Diesel
        boolean insuranceStatus = true;

        System.out.println("Vehicle Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Insurance Status: " + insuranceStatus);
    }
}
