package oop.Inheritance.human;

public abstract class AbstractPerson implements Human, Health{
    private int foodConsumed;
    private double weight;

    public AbstractPerson(int foodConsumed, double weight) {
        this.foodConsumed = foodConsumed;
        this.weight = weight;
    }

    public void setFoodConsumed(int foodConsumed) {
        this.foodConsumed = foodConsumed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
