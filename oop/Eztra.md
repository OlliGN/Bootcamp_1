package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SolutionWithClasses {
public static void main(String[] args) {

        //we are creating an instance of the data type
        Candidate johnDoe = new Candidate();
        //
        johnDoe.name = "John Doe";
        johnDoe.hasEAD = true;
        johnDoe.yearsOfExp = 5;
        johnDoe.gender = 'M';
        System.out.println(johnDoe.name);
        System.out.println(johnDoe.hasEAD);
        System.out.println(johnDoe.yearsOfExp);

        Candidate c2 = new Candidate();
        c2.name = "Melania Mask";
        c2.hasEAD = false;
        c2.yearsOfExp = 7;

        // providing characteristics are optional if an instance variable(characteristic) are not initialized


        List<Candidate> allCandidates = new ArrayList<>();
        allCandidates.add(johnDoe);
        allCandidates.add(c2);

    }
    //Class is the data type
    //Object is an instance(version) of that data type

}

//one java file can contains multiple classes, but only one public class
//Entity means one object
class Candidate {
//Every entity mast have some characteristics also known as state

    //We have created our own instance variables
    String name;
    int yearsOfExp;
    boolean hasEAD;
    char gender;
    Set<String> candidateSkills;
    String phoneNumber;
    String email;

}