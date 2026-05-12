package com.pm.systemdesign.creational.factory;

public class FourWheelerFactory implements VehicleFactory{
    public  Vehicle createVehicle() {
        return new FourWheeler();
    }
}
