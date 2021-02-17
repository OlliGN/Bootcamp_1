package oop.Inheritance.human;

//don't use extends
//use implement
public class Man extends AbstractPerson {

    public Man(int foodConsumed, double weight) {
        super(foodConsumed, weight);
        // this.foodConsumed = foodConsumed;
        // this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Ate 1 kilo");
        // foodConsumed++;
        // weight++;
    }

    @Override
    public void rest() {

    }

    @Override
    public int run() {
     //   weight--;
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
