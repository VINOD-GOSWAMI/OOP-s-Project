package org.example.oopConcepts.projects.Bouquet;

import java.util.ArrayList;
import java.util.Scanner;

public class Bouquet {
    Scanner sc;
    public  ArrayList<Flower> flowers=new ArrayList<>();
    private final Jasmin jasmin;
    private final RedRoses redRoses;
    private final WhiteRoses whiteRoses;
    private final Lilies lilies;
    private int cost;
    private int sizeCost;

    public Bouquet() {
        jasmin = new Jasmin();
        redRoses = new RedRoses();
        whiteRoses = new WhiteRoses();
        lilies = new Lilies();
        sc = new Scanner(System.in);
        this.size();
    }

    public void addingJasminFlower() {
        jasmin.addingJasminFlower();
    }

    public void addingRedRosesFlower() {
        redRoses.addingRedRosesFlower();
    }

    public void addingWhiteRosesFlower() {
        whiteRoses.addingWhiteRosesFlower();
    }

    public void addingLiliesFlower() {
        lilies.addingLiliesFlower();
    }

    public void totalCost() {
        cost = jasmin.getCost() + lilies.getCost() + whiteRoses.getCost() + redRoses.getCost() + sizeCost;
        System.out.println("total cost of bouquet is : " + cost);
    }

    private void size() {
        System.out.println("please select size of bouquet \n1.Large\n2.Medium\n3.Small");
        int size = sc.nextInt();
        if (size == 1) {
            sizeCost = 500;
            System.out.println("you had selected large size, price is : " + sizeCost);
        } else if (size == 2) {
            sizeCost = 300;
            System.out.println("you had selected medium size, price is : " + sizeCost);
        } else if (size == 3) {
            sizeCost = 200;
            System.out.println("you had selected small size, price is : " + sizeCost);
        } else {
            System.out.println("you had given wrong input please try again");
            size();
        }
    }

}
