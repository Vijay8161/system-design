package com.pm.systemdesign.structural.decorator;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza decoratedPizza){
        super(decoratedPizza);
    }
    @Override
    public String getDesc(){
        return decoratedPizza.getDesc()+", olive version (costs 40 extra)";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 40;
    }
}
