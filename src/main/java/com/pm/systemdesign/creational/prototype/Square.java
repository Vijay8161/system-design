package com.pm.systemdesign.creational.prototype;

import java.awt.*;

public class Square implements Shape{
    private final Color color;
    public Square(Color color){
        this.color = color;
    }

    @Override
    public Shape clone(){
        return new Square(this.color);
    }

    @Override
    public void draw(){
        System.out.println("Drawing "+color+" square");
    }
}
