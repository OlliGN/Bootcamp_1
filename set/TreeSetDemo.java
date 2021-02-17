package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        // Collection of unique ordered objects. Alphabetical or numerical order, asc by default, can be changed
        Set<String> names = new TreeSet<>();
        names.add("Kex");
        names.add("Ross");
        names.add("Jane");
        names.add("Elon");

        System.out.println(names);
    }
}
