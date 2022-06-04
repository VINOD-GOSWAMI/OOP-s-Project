package org.example.oopConcepts.projects.Home;

public class ElectricityUsage {
    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        laptop.switchOn();
        Fan fan = Fan.getInstance();
        fan.switchOn();

        TV tv = TV.getInstance();
        tv.switchOn();
        Light light = Light.getInstance();
        light.switchOn();
        Home home = new Home();
        home.usingLight();
        home.usingLaptop();
        home.allUnitCalculations();
    }
}
