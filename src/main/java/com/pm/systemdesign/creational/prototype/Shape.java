package com.pm.systemdesign.creational.prototype;


// Prototype Interface (Shape)
// Defines the blueprint for common methods like cloning and drawing shapes.
public interface Shape {
    Shape clone();
    void draw();
}
