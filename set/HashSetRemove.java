package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRemove {
    public static void main(String[] args){
        Set<String> ssn = new HashSet<>();
        ssn.add("000-22-4567");
        ssn.add("000-21-4567");
        ssn.add("020-22-4567");
        ssn.add("000-42-4567");
        ssn.add("200-22-4567");
        ssn.add("000-00-0000");

        System.out.println(ssn);
        System.out.println(ssn.size());
        if(ssn.remove("000-22-4567")){
            System.out.println("removed invalid ssn");
        }
        System.out.println(ssn);
        System.out.println(ssn.size());

        //isEmpty
        if(ssn.isEmpty()){
            System.out.println("Not empty");
        }
        //contains
        if(ssn.contains("000-00-0000")){
            System.out.println("Is that your ssn?");
        }
        //-------------------------
        ssn.add("000-22-4567");
        ssn.add("000-21-4567");
        ssn.add("020-22-4i67");
        ssn.add("000-42-4567");
        ssn.add("200-22-4567");
        ssn.add("000-00-0000");

        //Iterate through our set
        //for (a new variable with the same datatype of the elements in the collection : collection variable)
        for(String s: ssn){
            System.out.println(s);
        }
        //--------------------------
        //Check the format of all elements of the List with checkFormat method
        List<String> ssnList = new ArrayList<>();
        ssnList.add("000-2w-4567");
        ssnList.add("000-21-4567");
        ssnList.add("020-22-4967");

        for(int y = 0; y < ssnList.size(); y++){
            if(!checkFormat(ssnList.get(y))){
                System.out.println(ssnList.get(y) + "has invalid format");
            }
        }
        //print all the values in the list
        for(int i = 0; i < ssnList.size(); i++){
            String ssnElement = ssnList.get(i);
            System.out.println(ssnElement);
        }//----> Use for each loop only if you have to go through every single element in the collection

        for(String ssnElement : ssnList){
            System.out.println(ssnElement);
        }//----> Use regular for loop if you have to jump through some elements or stop somewhere in the middle
        //Also if you want to start not from beginning

        //-------------------------
        ssn.clear();
        System.out.println(ssn);
        System.out.println(checkFormat("000-33-4567"));
    }
    //Check if the input is in a right format
    public static boolean checkFormat(String socialSecurityNumber){
        boolean first3areDigits = Character.isDigit(socialSecurityNumber.charAt(0))
                &&
                Character.isDigit(socialSecurityNumber.charAt(1))
                &&
                Character.isDigit(socialSecurityNumber.charAt(2));
        boolean char4isHyphen = socialSecurityNumber.charAt(3)=='-';
        boolean char5Ans6areDigits = Character.isDigit(socialSecurityNumber.charAt(4))
                &&
                Character.isDigit(socialSecurityNumber.charAt(5));
        boolean char7isHyphen = socialSecurityNumber.charAt(6)=='-';
        boolean last4IsDigits = Character.isDigit(socialSecurityNumber.charAt(7))
                &&
                Character.isDigit(socialSecurityNumber.charAt(8))
                &&
                Character.isDigit(socialSecurityNumber.charAt(9))
                &&
                Character.isDigit(socialSecurityNumber.charAt(10));

        return first3areDigits && char4isHyphen && char5Ans6areDigits && char7isHyphen && last4IsDigits;
    }
}
