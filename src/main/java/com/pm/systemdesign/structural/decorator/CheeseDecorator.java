package com.pm.systemdesign.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
    @Override
    public String getDesc(){
        return decoratedPizza.getDesc()+", cheese version (costs 30 extra)";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 30;
    }
}
