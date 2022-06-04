package org.example.oopConcepts.projects.Home;

public class Home {
    private final Fan fan;
    private final Laptop laptop;
    private final Light light;
    private final TV tv;
    private int allUnit;

    public Home() {
        fan = Fan.getInstance();
        laptop = Laptop.getInstance();
        light = Light.getInstance();
        tv = TV.getInstance();
    }

    public void allUnitCalculations() {
        allUnit = fan.getUnit() + laptop.getUnit() + light.getUnit() + tv.getUnit();
        System.out.println("your Total current electricity unit consumption is : " + this.allUnit);
    }

    public void usingFan() {
        fan.switchOn();
    }

    public void usingLaptop() {
        laptop.switchOn();
    }

    public void usingTV() {
        tv.switchOn();
    }

    public void usingLight() {
        light.switchOn();
    }
}
