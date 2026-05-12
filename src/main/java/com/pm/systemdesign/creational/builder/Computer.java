package com.pm.systemdesign.creational.builder;

// Product
// The final complex object that is created using the Builder pattern.
public class Computer {
    private String cpu_;
    private String ram_;
    private String storage_;

    public void setCpu_(String cpu) {
        cpu_ = cpu;
    }

    public void setRam_(String ram){
        ram_ = ram;
    }

    public void setStorage_(String storage){
        storage_ = storage;
    }

    public void displayInfo() {
        System.out.println("Configuration: "
        + "\nCPU: " + cpu_
        + "\nRAM: " + ram_
        + "\nSTORAGE: " + storage_+ "\n\n");
    }
}
