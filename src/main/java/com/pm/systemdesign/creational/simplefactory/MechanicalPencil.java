package com.pm.systemdesign.creational.simplefactory;

public class MechanicalPencil implements Pencil {
    private final String type;
    private final float leadThickness;

    public MechanicalPencil(String type, float leadThickness) {
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
