package oop.Inheritance.abstractclass;

public class Electric extends Car {

    private int batteryRange;

    public Electric(String vin, String model, long mileage, String make, String color, int batteryRange) {
        super(vin, model, mileage, make, color);
        this.batteryRange = batteryRange;
    }

    @Override
    public void drive() {
        System.out.println("Hello rom the Electric");
    }

    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    @Override
    public void startEngine() {

    }
}
