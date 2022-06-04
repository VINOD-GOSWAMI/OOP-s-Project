package org.example.oopConcepts.projects.Home;

public class Laptop extends ElectricalAppliances {
    static Laptop obj = new Laptop();
    private Laptop() {}
    public static Laptop getInstance() {
        return obj;
    }

    public int getUnit() {
        System.out.println("your current electricity unit for Laptop is : " + unit);
        return unit;
    }

    @Override
    public void switchOn() {
        unit = unit + 2;
    }
}
