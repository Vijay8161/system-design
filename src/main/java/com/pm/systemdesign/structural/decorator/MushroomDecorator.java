package com.pm.systemdesign.structural.decorator;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }
    @Override
    public String getDesc(){
        return decoratedPizza.getDesc()+", mushroom version (costs 60 extra)";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 60;
    }
}
