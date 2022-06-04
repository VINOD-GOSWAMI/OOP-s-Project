package org.example.oopConcepts.projects.pizzaShop;
import java.util.HashSet;
import java.util.Scanner;

public class Pizza {
    private final HashSet<Toppings> topping;
    Scanner sc;
    private PizzaBase base;
    private double totalCost;
    private PizzaCost pizzaCost;

    public Pizza() {
        topping = new HashSet<>();
        sc = new Scanner(System.in);
    }

    public void breadType() {
        System.out.println("Please Select your bread \n1.standardBase \n2.softBase");
        int breadType = sc.nextInt();
        if (breadType == 1)
            base = new StandardBase();
        else if (breadType == 2)
            base = new SoftBase();
        else {
            System.out.println("you had given wrong input please select again");
            breadType();
        }

    }

    public void totalCost() {
        pizzaCost = new PizzaCost(topping, base);
        totalCost = pizzaCost.totalPizzaCost();
    }


    public void addingCornTopping() {
        topping.add(new Corn());
    }

    public void addingTomatoTopping() {
        topping.add(new Tomato());
    }

    public void addingMushroomsTopping() {
        topping.add( new Mushrooms());
    }

}
