package Design_Pattern.Creational.Factory;

import Design_Pattern.Creational.Factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car Engine");
    }
}
