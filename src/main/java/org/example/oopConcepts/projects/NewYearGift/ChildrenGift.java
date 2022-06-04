package org.example.oopConcepts.projects.NewYearGift;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.util.TreeMap;

public class ChildrenGift {
    private static final Logger logger = LogManager.getLogger(ChildrenGift.class);
    static Scanner sc = new Scanner(System.in);
    TreeMap<String, Object> sweet;
    TreeMap<String, Object> chocolate;
    private final DairyMilk dairyMilk;
    private final FiveStar fiveStar;
    private final KajuKatali kajuKatali;
    private final Laddu laddu;

    public ChildrenGift() {
        dairyMilk = new DairyMilk();
        fiveStar = new FiveStar();
        kajuKatali = new KajuKatali();
        laddu = new Laddu();
    }

    private void addSweet() {
        sweet = new TreeMap<>();
        sweet.put(kajuKatali.sweetName(), kajuKatali.getTotalWeight());
        sweet.put(laddu.sweetName(), laddu.getTotalWeight());
    }

    private void addChocolate() {
        chocolate = new TreeMap<>();
        chocolate.put(fiveStar.sweetName(), fiveStar.getTotalWeight());
        chocolate.put(dairyMilk.sweetName(), dairyMilk.getTotalWeight());
    }

    public void packetOfDairyMilk(int numOfPackets) {
        dairyMilk.weightOfSweet(numOfPackets);
    }

    public void packetOfiveStar(int numOfPackets) {
        fiveStar.weightOfSweet(numOfPackets);
    }

    public void packetOfLaddu(int numOfPackets) {
        laddu.weightOfSweet(numOfPackets);
    }

    public void packetOfKajuKatali(int numOfPackets) {
        kajuKatali.weightOfSweet(numOfPackets);
    }

    public double totalWeight() {
        double totalWeight = weightOfSweet() + weightOfChocolate();
        System.out.println("total weight is : " + totalWeight + " Kg.");
        System.out.println("******************************************************");
        return totalWeight;
    }

    public double totalCostOfGift() {
        double totalCost = costOfSweet() + costOfChocolate();
        System.out.println("total cost =" + totalCost + " Rs.");
        System.out.println("******************************************************");
        return totalCost;
    }

    private double costOfChocolate() {
        double chocolateCost = dairyMilk.getTotalCost() + fiveStar.getTotalCost();
        System.out.println("cost of chocolate is : " + chocolateCost + " Rs.");
        return chocolateCost;
    }

    private double costOfSweet() {
        double sweetCost = laddu.getTotalCost() + kajuKatali.getTotalCost();
        System.out.println("cost of sweet is : " + sweetCost + " Rs.");
        return sweetCost;
    }


    private double weightOfChocolate() {
        addChocolate();
        double weightOfChocolate = 0;
        for (Object j : chocolate.values())
            weightOfChocolate += (Double) j;
        System.out.println("weight of chocolate is : " + weightOfChocolate + " kg");
        return weightOfChocolate;
    }

    private double weightOfSweet() {
        addSweet();
        double weightOfSweet = 0;
        for (Object i : sweet.values())
            weightOfSweet += (Double) i;
        System.out.println("total weight of sweet : " + weightOfSweet + " kg");
        return weightOfSweet;
    }

    public void sort() {
        logger.info("Sorting gifts of children");
        logger.info("in the form of chocolate : ");
        logger.info(chocolate);
        logger.info("****************************");
        logger.info("in the form of sweets : ");
        logger.info(sweet);
    }

}
