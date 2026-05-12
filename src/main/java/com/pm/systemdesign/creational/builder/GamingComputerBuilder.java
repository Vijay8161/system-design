package com.pm.systemdesign.creational.builder;

// A specific builder class that implements the Builder steps
// to create a gaming computer configuration.
public class GamingComputerBuilder implements Builder{

    private final Computer comp_ = new Computer();

    @Override
    public void buildCpu(){
        comp_.setCpu_("Gaming CPU");
    }
    @Override
    public void buildStorage(){
        comp_.setStorage_("1TB SSD");
    }
    @Override
    public void buildRam(){
        comp_.setRam_("32GB DDR4");
    }
    @Override
    public Computer getResult(){
        return comp_;
    }
}
