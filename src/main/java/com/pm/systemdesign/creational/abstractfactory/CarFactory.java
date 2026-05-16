package com.pm.systemdesign.creational.abstractfactory;

// Abstract Factory Interface (CarFactory)
//"CarFactory" is a Abstract Factory Interface that defines methods
// for creating cars and their specifications.
public interface CarFactory {
    Car createCar();
    CarSpec createSpec();
}
