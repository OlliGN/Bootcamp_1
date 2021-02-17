package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPractice {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");
        names.add("Joe");

        //using Iterator print out every single element
        Iterator<String> it = names.iterator();

        //we have to call next() method as many times as the size of the Set

        //next() method #1 (bad one)
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());

        //method #2 --> Better one
        for(int i = 0; i < names.size(); i++){
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++");

        //method #3  --> good too
        while (it.hasNext()){
            System.out.println(it.next());
        }

        while(it.hasNext()){
            if(it.next().equals("Joe")){
                it.remove();
                //while an iterator is used u can not modify your Set
                //names.add("Rio'); ---> will cause an error!!!!
            }
        }
        names.add("Rio"); //---> you can only modify(add)  more stuff to your Set after the iterator has reached the end
        //or if --->  Iterator.hasNext() returns false
        System.out.println(names);

    }
}
