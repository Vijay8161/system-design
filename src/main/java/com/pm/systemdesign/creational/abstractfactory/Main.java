package com.pm.systemdesign.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpec northAmericaSpec = northAmericaFactory.createSpec();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Asia
        CarFactory asiaFactory = new AsiaCarFactory();
        Car asiaCar = asiaFactory.createCar();
        CarSpec asiaSpec = asiaFactory.createSpec();

        asiaCar.assemble();
        asiaSpec.display();
    }
}
