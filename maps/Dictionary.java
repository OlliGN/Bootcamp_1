package maps;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String [] args){
        Scanner scm = new Scanner(System.in);

        Map<String, String> Dictionary = new HashMap<>();
        Dictionary.put("jdk", "Java Development Kit is a bundle of JVM, and some libraries which comes with installation of Java");
        Dictionary.put("Lists","Lists are collections of objects of same data type and it can not store primitives");
        Dictionary.put("==", "Difference between == and . equals ...");

        System.out.println("Enter the word");
        String input = scm.nextLine().trim().toLowerCase(Locale.ROOT);

        if(Dictionary.get(input) == null){
            System.out.println("This word does not exist in my dictionary");
        }
        else{
            System.out.println(Dictionary.get(input));
        }

        //containsKey(key) ---> boolean - returns true(if exact match ) or false if not
        //containsValue(value) ---> boolean - returns true if the value (exact match) or false if not
        if(Dictionary.containsKey("input")){
            System.out.println(Dictionary.get(input));
        }
        //remove(key) ---> removes key and value
        Dictionary.remove("Lists");

        //replace(key, value) ---> it returns old value
        Dictionary.replace("jdk", "Java Development Kit");

        //size() ---->
        //isEmpty() --->
        //clear()  --->



    }

}
