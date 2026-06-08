package com.pm.systemdesign.structural.decorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public String getDesc(){
        return decoratedPizza.getDesc()+", pepperoni version (costs 50 extra)";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 50;
    }
}
