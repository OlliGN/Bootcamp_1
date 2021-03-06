package oop.Inheritance.Demo;

public class Main {
    public static void main(String[] args) {

        Animal animal = new FourLeg();
        //the value from a datatype class will be used for variables
        System.out.println(animal.name);

        FourLeg fourLeg = new FourLeg();
        System.out.println(fourLeg.name);

        Animal animal1 = new FourLeg();
        //Whatever the data type of a variable is value from that class will be retrieved.
        System.out.println(((FourLeg) animal1).name);

        //methods that are available defined by the data type of a variable, not an object assigned.
        //methods that are going to be executed are defined by the object itself
        animal.printName();

        //call hello method using animal variable
        ((FourLeg) animal1).hello();
    }
}
