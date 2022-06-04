package org.example.oopConcepts.projects.NewYearGift;

public class KajuKatali implements Sweet {
    private final double perPackageWeight = 2.00;
    private final String sweetName = "KajuKatali";
    private double totalWeight;

    public double getTotalCost() {
        return 80 * totalWeight;
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
        System.out.println("total weight of kajukatali is : " + totalWeight);
        System.out.println("total cost of kajukatali is : " + getTotalCost());
        System.out.println("***********************************************");
    }
}
