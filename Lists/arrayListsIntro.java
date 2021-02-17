package Lists;

import java.util.ArrayList;
//option + return (shortcut to import)

public class arrayListsIntro {
    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<>();

        //how to add element to the list?
        firstList.add("BMW");
        firstList.add("Mercedes");
        firstList.add("");
        System.out.println(firstList);

        firstList.add("Ferrari");
        System.out.println(firstList);

        //this is a flexible method that add the element at the given index
        firstList.add(1,"Dodge");
        System.out.println(firstList);
    }
}
//Lists have dynamic size. Size can me dynamically changed at the runtime.(while program is running
//Lists can only store objects (not primitives), rather we have to use Wrapperclass for each primitive type