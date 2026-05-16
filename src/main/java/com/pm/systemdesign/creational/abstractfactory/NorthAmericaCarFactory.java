package com.pm.systemdesign.creational.abstractfactory;

// Concrete Factories (NorthAmericaCarFactory)
// "NorthAmericaCarFactory" are concrete factories that implement the abstract factory interface "CarFactory" to create cars and specifications specific to NorthAmerica.
public class NorthAmericaCarFactory implements CarFactory{
    public Car createCar(){
        return new Sedan();
    }
    public CarSpec createSpec(){
        return new NorthAmericaSpec();
    }
}
