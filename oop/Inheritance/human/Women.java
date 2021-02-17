package oop.Inheritance.human;

public class Women extends AbstractPerson {

    //homework

    public Women(int foodConsumed, double weight) {
        super(foodConsumed,weight);
        //      this.foodConsumed = foodConsumed;
        //      this.weight = weight;
    }

    @Override
    public void eat() {

        System.out.println("Ate 200gm");
        //     foodConsumed += 0.2;
        //    weight += 0.2;

    }

    @Override
    public void rest() {

    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public double laugh() {
        return 0;
    }

    @Override
    public int yearsInService() {
        return 0;
    }

    @Override
    public boolean isHealthy() {
        return false;
    }
}
