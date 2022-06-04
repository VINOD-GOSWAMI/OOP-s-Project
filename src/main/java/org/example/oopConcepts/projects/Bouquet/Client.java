package org.example.oopConcepts.projects.Bouquet;

public class Client {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addingJasminFlower();
        bouquet.addingLiliesFlower();
        bouquet.addingWhiteRosesFlower();
        bouquet.addingRedRosesFlower();
        bouquet.totalCost();
        CostCalcution.addingFlower(15,FlowerList.Jasmin);

    }
}