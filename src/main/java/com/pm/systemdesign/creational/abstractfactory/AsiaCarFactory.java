package com.pm.systemdesign.creational.abstractfactory;

// Concrete Factories (AsiaCarFactory)
// "AsiaCarFactory" are concrete factories that implement the abstract factory interface "CarFactory" to create cars and specifications specific to Asia.
public class AsiaCarFactory implements CarFactory{
    public Car createCar(){
        return new Audi();
    }
    public CarSpec createSpec(){
        return new AsiaSpec();
    }
}
