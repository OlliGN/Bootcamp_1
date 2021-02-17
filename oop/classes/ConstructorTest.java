package oop.classes;

import oop.classes.Candidate;

public class ConstructorTest {
    public static void main(String[] args){
        Candidate johnDoe = new Candidate("John", "Jo@gmail.com", 12);
        //every time you are creating a new object
        //every object creation is very similar process
        Candidate elon = new Candidate("Elon", "Elon@gmail.com", 7);

        System.out.println(johnDoe.email);
        System.out.println(johnDoe.name);

    }
}
