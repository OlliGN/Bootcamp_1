package set;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetClass1 {
    public static void main(String[] args) {

        List<String> ssn = new ArrayList<>();
        ssn.add("000-00-0000");
        ssn.add("123-33-4444");
        ssn.add("222-33-2457");
        ssn.add("988-00-6788");
        //DUPLICATE
        ssn.add("000-00-0000");
        System.out.println(ssn);

        Set<String> ssnUnique = new HashSet<>();
        ssnUnique.add("000-00-0000");
        ssnUnique.add("123-33-4444");
        ssnUnique.add("222-33-2457");
        ssnUnique.add("988-00-6788");
        //DUPLICATE
        //Java does not complain when duplicate values are added at compile time
        ssnUnique.add("000-00-0000");
        //Set checks at runtime if the value is already in collection
        System.out.println(ssnUnique);


        //public boolean add(E value)
        // add method will add a value and return true if the value does not already exist
        //add method will return false and do not add anything if the Set already contains the value
        boolean result = ssnUnique.add("123-11-2222");
        if (!result) {
            System.out.println("Ssn already exist!");
        }
        ssnUnique.add("222-33-2457");
        ssnUnique.add("988-00-6788");

        //call addSsn method
        addSsn(ssnUnique, "988-00-6788");
    }

    //This method adds new SSNs
    //If SSN already exists send a warning to the owner of ssn
    // @param ssnSet
    // @param ssn
    public static void addSsn(Set<String> ssnSet, String ssn) {
        boolean added = ssnSet.add(ssn);
        if (!added) {
            System.out.println("Already exist, SSN# has to be unique!");
        }
    }

    public static void add(List<String> ssn, String str) {
        if (!ssn.contains(str)) {
            ssn.add(str);
        }
    }

}
