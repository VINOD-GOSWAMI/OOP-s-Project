package org.example.oopConcepts.projects.Home;

public class Fan extends ElectricalAppliances {
    private static final Fan obj = new Fan();
    private Fan() {
    }

    public static Fan getInstance() {
        return obj;
    }

    public int getUnit() {
        System.out.println("your current electricity unit for fan is : " + unit);
        return unit;
    }

    @Override
    public void switchOn() {
        unit = unit + 2;
    }
}
