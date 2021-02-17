package set;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {
    public static void main(String[] args){

        Set<String> listOfSpeakers = new HashSet<>();
        listOfSpeakers.add("Elon");
        listOfSpeakers.add("Bezos");
        listOfSpeakers.add("Marry");
        listOfSpeakers.add("Jane");
        listOfSpeakers.add("Joe");

        Set<String> listOfRegistrants = new HashSet<>();
        listOfRegistrants.add("Elon");
        listOfRegistrants.add("Jane");
        listOfRegistrants.add("J44an2132");

        if(listOfSpeakers.containsAll(listOfRegistrants)){
            System.out.println("Let them in");
        }
        else {
            System.out.println("Someone trying to break in");
        }

    }
}
