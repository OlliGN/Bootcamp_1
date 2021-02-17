package oop.Inheritance.abstractclass;

public class Demo {
    public static void main(String[] args) {
        //you can not create an object from the abstract class, but you can use Abstract classes as data types
        // Car car = new Car(); ---> error

        Car car = new Gas("92323929", "Lexus", 0, "nx", "black", 123);
        //methods that will be executed are defined by the object;


        System.out.println(car.getMake());

        Car tesla = new Electric("122232", "Tesla", 10000, "Model", "pink", 100);
        tesla.rollDownTheWindow();
    }
}
