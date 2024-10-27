package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public ArrayList<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {

    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

    }
    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear) {

    }
    public ArrayList<Vehicle> getVehiclesByColor(String color) {

    }
    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {

    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {

    }
    public ArrayList<Vehicle> getAllVehicles() {

    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
}

