package com.pm.systemdesign.creational.simplefactory;

public class H2BPencil implements  Pencil {
    private final String type;
    private final float leadThickness;

    H2BPencil(String type, float leadThickness) {
        this.type = type;
        this.leadThickness = leadThickness;
    }
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public float getLeadThickness() {
        return this.leadThickness;
    }
}
