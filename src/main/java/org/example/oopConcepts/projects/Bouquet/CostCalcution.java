package org.example.oopConcepts.projects.Bouquet;

import java.util.ArrayList;

public class CostCalcution {
    public static Flower addingFlower(int numberOfFlower, FlowerList flowerType) {
        switch (flowerType){
            case Jasmin:
                return new Jasmin();
            case Lilies:
                return new Lilies();
            case RedRoses:
                return new RedRoses();
            case WhiteRoses:
                return new WhiteRoses();
            default:
                break;
        }
        return null;
        }

    }
