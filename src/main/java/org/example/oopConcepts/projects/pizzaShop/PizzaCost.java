package org.example.oopConcepts.projects.pizzaShop;

import java.util.HashSet;

public class PizzaCost {
    private HashSet<Toppings> topping;
    private PizzaBase base;
    private double totalCost;

    public PizzaCost(HashSet<Toppings> topping, PizzaBase base) {
        this.base = base;
        this.topping = topping;
    }



    public double totalPizzaCost() {
        totalCost=toppingCost() + base.getCost();
        System.out.println("Base cost of Pizza : " + base.getCost());
        System.out.println("Total cost of pizza : "+totalCost);
        return totalCost;
    }

    private double toppingCost() {
        double toppingCost = 0;
        for (Toppings topping : topping)
            toppingCost += topping.getPrice();
        System.out.println("Topping cost of Pizza : " + toppingCost);
        return toppingCost;
    }
}
