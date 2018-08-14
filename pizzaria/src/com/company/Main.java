package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pizza basicPizza = new TomateSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: "+basicPizza.getDescription());
        System.out.println("Price: "+basicPizza.getCost());

    }
}
