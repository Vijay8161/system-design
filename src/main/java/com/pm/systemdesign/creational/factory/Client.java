package com.pm.systemdesign.creational.factory;

public class Client {
    private final Vehicle pVehicle;

    public Client(VehicleFactory factory){
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle(){
        return pVehicle;
    }
}
