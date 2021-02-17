package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetsAndListsWithTim {
    public static void main(String[] args) {

        //SET
        //Set is a collection of unique and unordered values
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);

        //check if the value exists
        t.contains(4);
        boolean x = t.contains(5);

        System.out.println(t.contains(5));
        System.out.println(x);

        //remove element from the set
        t.remove(9);
        System.out.println(t);

        //t.clear(); ---> to delete everything from the Set

        //check how many elements
        t.size();
        int o = t.size();
        System.out.println(o);

        //LIST

        ArrayList<Integer> i = new ArrayList<Integer>();
        //Slower than Array and it can change sizes and also ordered

        //to add the value to the end of the List
        i.add(12);
        i.add(14);
        i.add(152);
        i.add(152);

        System.out.println(i);

        //find element by index
        System.out.println(i.get(0));

        //to set(change/replace) a value --> i.set(index, element)
        i.set(0, 1994);
        System.out.println(i);

        //To get the sublist of the List (from index, to index)
        //i.sublist(index,index);
        System.out.println(i.subList(1, 4));

    }
}
