package com.pm.systemdesign.structural.adapter;

public class PrinterAdapter implements Printer{
    private final LegacyPrinter legacyPrinter;
    PrinterAdapter() {
        legacyPrinter = new LegacyPrinter();
    }

    @Override
    public void print(){
        legacyPrinter.printDocument();
    }
}
