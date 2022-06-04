package org.example.oopConcepts.projects.Home;

public class TV extends ElectricalAppliances {
    private static final TV obj = new TV();
    private TV() {
    }

    public static TV getInstance() {
        return obj;
    }

    public int getUnit() {
        System.out.println("your current electricity unit for TV is : " + unit);
        return unit;
    }

    @Override
    public void switchOn() {
        unit = unit + 3;
    }
}
