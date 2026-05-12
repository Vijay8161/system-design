package com.pm.systemdesign.creational.simplefactory;

public class PencilFactory {
    public static Pencil createPencil(String type,float leadThickness) {
        return new MechanicalPencil(type,leadThickness);
    }
}
