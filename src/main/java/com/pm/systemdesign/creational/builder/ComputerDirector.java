package com.pm.systemdesign.creational.builder;

//Director
//A class that controls the building process by calling
// builder methods in the correct order to construct the product.
public class ComputerDirector {
    public void construct(Builder builder){
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}
