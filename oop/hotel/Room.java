package oop.hotel;

import java.util.Map;

public class Room {

    //these are going to be instance variables of the objects
    int beds;
    int baths;
    Map<String, Integer> bedTypes;
    boolean isAvailable;
    int number;

    //Constructor is a  method that we use to initialize variables
    //Constructor name has to be the same as a class name and has no return type

    public Room(int number, int beds, int baths, Map<String, Integer> bedTypes, boolean isAvailable) {
        // System.out.println("Colling constructor");
        // System.out.println("beds " + beds);
        // System.out.println("baths " + baths);
        // System.out.println("bedTypesMap " + bedTypes);
        // System.out.println("isAvailable " + isAvailable);

        //establishes the initial state of a particular Room object
        //this ---> keyword to initialize an instance variable in our constructor
        //if you use different variable names in the params - you will not use "this" keyword
        this.beds = beds;
        this.baths = baths;
        this.bedTypes = bedTypes;
        this.isAvailable = isAvailable;
        this.number = number;

    }
}
