package oop.Inheritance.abstractclass;

public class Gas extends Car {

    private double mpg;

    public Gas(String vin, String model, long mileage, String make, String color, double mpg) {
        super(vin, model, mileage, make, color);
        this.mpg = mpg;
    }

    @Override
    public void drive() {

    }

    public void print() {
        System.out.println("Gaz");
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    @Override
    public void startEngine() {

    }

    @Override // change the way that method works
    public String getMake() {
        System.out.println("Child Gas class");
        return "Child";
    }
}
