package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        //Collection of unique ordered objects. insertion order
        Set<String> names = new LinkedHashSet<>();
        names.add("Kex");
        names.add("Ross");
        names.add("Jane");
        names.add("Elon");

        System.out.println(names);


    }
}
