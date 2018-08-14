package com.company;

public class TomateSauce extends ToppingDecorator {
    public TomateSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomate Sauce";
    }

    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
