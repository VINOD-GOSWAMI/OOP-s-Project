package org.example.oopConcepts.projects.NewYearGift;

public class FiveStar implements Sweet {
    private final double perPackageWeight = 0.5;
    private final String sweetName = "FiveStar";
    private double totalWeight;

    public double getTotalCost() {
        return 90 * totalWeight;
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
        System.out.println("total weight of fiveStar is : " + totalWeight + " kg.");
        System.out.println("total cost of fiveStar is : " + getTotalCost() + " Rs.");
        System.out.println("******************************************************");

    }
}
