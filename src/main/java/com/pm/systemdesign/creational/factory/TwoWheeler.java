package com.pm.systemdesign.creational.factory;

// Concrete product classes representing different types of vehicles
public class TwoWheeler extends Vehicle{
    @Override
    public void printVehicle(){
        System.out.println("TwoWheeler here...");
    }
}
