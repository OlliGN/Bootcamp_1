package oop.Inheritance.abstractclass;

public abstract class Car extends Vehicle {

    //abstract class - class that can contain abstract and non-abstract (regular) methods
    //construct abstract class constructors are used purely to initialize instance variables
    //constructors can be called in sub-classes using super() keyword


    public Car(String vin, String model, long mileage, String make, String color) {

        super(vin, model, mileage, make, color);
    }

    //any cars that extends Car must have drive, but with their own implementation
    public abstract void drive();

    public void print() {
        System.out.println("Hello from Car class");
    }

    public void rollDownTheWindow() {
        System.out.println("Rolling down the window");
    }
}
