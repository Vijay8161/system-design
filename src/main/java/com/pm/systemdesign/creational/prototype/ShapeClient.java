package com.pm.systemdesign.creational.prototype;

public class ShapeClient {
    private final Shape shapePrototype;

    // When you create a client, you give it a prototype (a shape).
    public ShapeClient(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}
