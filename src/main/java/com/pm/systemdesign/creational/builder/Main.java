package com.pm.systemdesign.creational.builder;

// client / user that selects the builder and starts the building process
public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gcb = new GamingComputerBuilder();
        ComputerDirector dir = new ComputerDirector();
        dir.construct(gcb);
        Computer gamingComputer = gcb.getResult();
        gamingComputer.displayInfo();
    }
}
