package Lists;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class convertingListToArray {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(34);
        nums.add(43);
        nums.add(43);

        System.out.println(nums);

        //convert List to Array
        Integer[] numsArr = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numsArr));
        System.out.println(nums);

        //get(int index) ---> same as arr[int index]
        System.out.println(nums.get(1));


        String[] names = {"Elon Mask", "Steve Jobs", "B Franklin"};

        //convert names (Array) to List.
        List<String> namesList = Arrays.asList(names);
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        names[2] = "Bill Gates";
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        //Arrays.asList() - is fixed size
        //if we will try to add an element - we will get an error (add() method is no more available)


        List<String > namesListDynamic = new ArrayList<>(namesList);
        System.out.println(namesListDynamic);
        namesListDynamic.add("new name");
        System.out.println(namesListDynamic);

        //method add is overloading


    }
}
