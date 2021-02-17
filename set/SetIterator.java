package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args){
        //Problem
        //Since Sets can not be access via index and since the Collections can not be modified
        //inside a for each loop
        //we don't have a way of modifying Set objects

        //Iterator is an interface - which is a collection of same objects
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");

        System.out.println(names);

        //Usually Iterators are initialized from a method of Lists, Sets.
        //iterator method is going to initialize an iterator
        //which the values the SET contains
        Iterator<String> iterator = names.iterator();
        String name1 =  iterator.next();
        System.out.println(name1);
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //there is a connection between Set and Iterator
        //bc Iterator stores the references to the objects in the set
        iterator.remove();


    }
}
