package org.example.oopConcepts.projects.NewYearGift;

public class Laddu implements Sweet {
    private final double perPackageWeight = 1.00;
    private final String sweetName = "Laddu";
    private double totalWeight;

    public double getTotalCost() {
        return 50 * totalWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String sweetName() {
        return sweetName;
    }

    @Override
    public void weightOfSweet(int noOfPacket) {
        totalWeight += perPackageWeight * noOfPacket;
        System.out.println("total weight of laddu is : " + totalWeight + " kg");
        System.out.println("total cost of laddu is : " + getTotalCost() + " Rs.");
        System.out.println("******************************************************");
    }
}
