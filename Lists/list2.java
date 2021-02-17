package Lists;

import java.util.ArrayList;
import java.util.List;

public class list2 {
    public static void main(String[] args) {
        int[] arr = {1, 34, 56, 3};

        //Lists can not store primitive types
        List<Integer> nums = new ArrayList<>();

        nums.add(123);
        nums.add(232);
        nums.add(434);

        System.out.println(nums);

        //to remove with index
        nums.remove(2);
        System.out.println(nums);

        //to remove with value
        nums.remove(new Integer(123));
        System.out.println(nums);

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Cardinal");
        birds.add("Eagle");
        birds.add("Parrot");
        birds.add("Sparrow");
        System.out.println(birds);

        //update Sparrow to Jack Sparrow
        birds.set(4, "Jack Sparrow");

        System.out.println(birds);

        //to find an index of the element
        int indexOfParrot = birds.indexOf("Parrot");
        birds.set(indexOfParrot, "Talking Parrot");
        System.out.println(birds);

        //checks the list is empty or not
        System.out.println(birds.isEmpty());

        //checks how many elements contains the list
        System.out.println(birds.size());

        System.out.println(birds.contains("Parrot"));

        //List -> interface
        //List data type has an ability to take 2 forms (ArrayList/ LinkedList)
        //Interface enables a polymorphism
        //Polymorphism means an ability to take multiple forms
        //ArrayList -> is implementation of a list interface

        List<StringBuilder> sbList = new ArrayList<>();

        List<String> birds2 = new ArrayList<>(birds);
        System.out.println(birds2);

        List<String> birds3 = new ArrayList<>();
        birds3.add("Hawk");
        birds3.add("Cardinal");
        birds3.add("Eagle");
        birds3.add("Parrot");
        birds3.add("Sparrow");
        System.out.println(birds3);

        System.out.println(birds.equals(birds2));
        System.out.println(birds.equals(birds3));
        System.out.println(birds2.equals(birds3));


    }
}
