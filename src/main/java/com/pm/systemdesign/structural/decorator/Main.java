package com.pm.systemdesign.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDesc() +" : $" + pizza.cost());
        Pizza cheesePizza = new CheeseDecorator(pizza);
        System.out.println(cheesePizza.getDesc() +" : $" + cheesePizza.cost());
        Pizza mushroomPizza = new MushroomDecorator(pizza);
        System.out.println(mushroomPizza.getDesc() +" : $" + mushroomPizza.cost());
        Pizza olivePizza = new OliveDecorator(pizza);
        System.out.println(olivePizza.getDesc() +" : $" + olivePizza.cost());
        Pizza pepperoniPizza = new PepperoniDecorator(pizza);
        System.out.println(pepperoniPizza.getDesc() +" : $" + pepperoniPizza.cost());
    }
}
