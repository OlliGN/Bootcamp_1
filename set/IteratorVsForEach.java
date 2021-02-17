package set;

import java.util.HashSet;
import java.util.Set;

public class IteratorVsForEach {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Marry");
        names.add("Jane");
        names.add("Joe");
        names.add("Frank");
        names.add("Cale");
        names.add("Ross");
        names.add("Lol");
        names.add("Oksana");

        //We have to use Iterator if we need to remove multiple elements from Set based on same condition

        /*
        for(String name: names){
            if(name.endsWith("e")){
                names.remove(name);
            }
        }
        */
    }
}
