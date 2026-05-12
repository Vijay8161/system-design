package com.pm.systemdesign.creational.builder;

// An interface/abstract class that defines step-by-step
// methods to create different parts of the Product (Computer).
public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    Computer getResult();
}
