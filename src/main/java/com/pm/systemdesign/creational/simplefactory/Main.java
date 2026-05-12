package com.pm.systemdesign.creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        Pencil mechPencil = PencilFactory.createPencil("mechanical",0.9f);
        System.out.println(mechPencil.getLeadThickness());
        System.out.println(mechPencil.getType());
    }
}
