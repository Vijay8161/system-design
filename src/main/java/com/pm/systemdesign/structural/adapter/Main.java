package com.pm.systemdesign.structural.adapter;

public class Main {
    public static void main(String[] args) {
        PrinterAdapter adapter = new PrinterAdapter();
        clientCode(adapter);
    }
    private static void clientCode(PrinterAdapter adapter){
        adapter.print();
    }
}
