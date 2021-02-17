package oop.classes;

import java.util.Set;

public class Candidate {
    //Every entity mast have some characteristics also known as state

    //We have created our own instance variables
    String name;
    int yearsOfExp;
    boolean hasEAD;
    char gender;
    Set<String> candidateSkills;
    String phoneNumber;
    String email;

    public Candidate() {
        System.out.println("Colling Constructor 123");
    }

    //Constructor overloading - different params;
    //Demonstrating :
    //Constructor is a special method that used to initialize instance variable,
    //it's also used to force users of the class to provide required info
    //Constructor can be used with preceded by new keyword
    //Constructor params are no different than method params
    public Candidate(String fullName, String emailAddress, int year) {
        System.out.println("Creating a Candidate Object with three params");
        name = fullName;
        yearsOfExp = year;
        email = emailAddress;

    }

    class Mentor {
        public Mentor() {

        }
    }

}