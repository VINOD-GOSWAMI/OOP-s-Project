package org.example.oopConcepts.projects.Home;

public class Light extends ElectricalAppliances {
    private static final Light obj = new Light();
    private Light() {}

    public static Light getInstance() {
        return obj;
    }

    public int getUnit() {
        System.out.println("your current electricity unit for Light is : " + unit);
        return unit;
    }

    @Override
    public void switchOn() {
        unit = unit + 1;
    }
}
