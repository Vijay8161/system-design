package com.pm.systemdesign.creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        twoWheeler.printVehicle();
        fourWheeler.printVehicle();
    }
}
