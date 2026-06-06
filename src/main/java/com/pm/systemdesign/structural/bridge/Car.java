package com.pm.systemdesign.structural.bridge;

public class Car extends Vehicle {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1,workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car : ");
        workShop1.work();
        workShop2.work();
    }
}
