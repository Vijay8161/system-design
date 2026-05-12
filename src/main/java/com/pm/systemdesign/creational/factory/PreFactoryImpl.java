//package com.pm.systemdesign.creational.factory;
//
//// Without Factory Method Design Pattern
//abstract class Vehicle1 {
//    public abstract void printVehicle();
//}
//
//class TwoWheeler extends Vehicle1 {
//    public void printVehicle()
//    {
//        System.out.println("I am two wheeler");
//    }
//}
//
//class FourWheeler extends Vehicle1 {
//    public void printVehicle()
//    {
//        System.out.println("I am four wheeler");
//    }
//}
//
//// Client (or user) class
//class Client {
//    private Vehicle1 pVehicle;
//
//    public Client(int type)
//    {
//        if (type == 1) {
//            pVehicle = new TwoWheeler();
//        }
//        else if (type == 2) {
//            pVehicle = new FourWheeler();
//        }
//        else {
//            pVehicle = null;
//        }
//    }
//
//    public void cleanup()
//    {
//        if (pVehicle != null) {
//            pVehicle = null;
//        }
//    }
//
//    public Vehicle1 getVehicle() { return pVehicle; }
//}
//
//public class PreFactoryImpl {
//    public static void main(String[] args)
//    {
//        Client pClient = new Client(1);
//        Vehicle1 pVehicle = pClient.getVehicle();
//        if (pVehicle != null) {
//            pVehicle.printVehicle();
//        }
//        pClient.cleanup();
//    }
//}
//
//
////Issues with the Current Design
////Tight coupling: Client depends directly on product classes.
////Violation of SRP: Client handles both product creation and usage.
////Hard to extend: Adding a new vehicle requires modifying the client.
