package com.pm.systemdesign.structural.decorator;

//2. Concrete Component
//This class implements the Pizza interface and provides the basic implementation for a plain pizza.
public class PlainPizza implements Pizza {
    @Override
    public String getDesc() {
        return "Plain Pizza";
    }
    @Override
    public double cost() {
        return 150.0;
    }
}
