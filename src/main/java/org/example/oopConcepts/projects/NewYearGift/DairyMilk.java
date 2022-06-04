package org.example.oopConcepts.projects.NewYearGift;

public class DairyMilk implements Sweet {
    private final double perPackageWeight = 0.8;
    private final String sweetName = "DairyMilk";
    private double totalWeight;

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalCost() {
        return 120 * totalWeight;
    }

    @Override
    public String sweetName() {
        return sweetName;
    }

    @Override
    public void weightOfSweet(int noOfPacket) {
        totalWeight += perPackageWeight * noOfPacket;
        System.out.println("total weight of dairymilk is : " + totalWeight + " kg.");
        System.out.println("total cost of dairymilk is : " + getTotalCost() + " Rs.");
        System.out.println("******************************************************");
    }
}
