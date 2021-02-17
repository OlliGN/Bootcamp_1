package set;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(625);
        nums.add(6325);
        nums.add(645);
        nums.add(615);
        nums.add(6435);
        nums.add(615);

        Set<Integer> uniqueNums = new HashSet<>();
        //1 way
        for (Integer n : nums) {
            uniqueNums.add(n);
        }
        System.out.println(uniqueNums);

        //2 way
        for (int i = 0; i < nums.size(); i++) {
            nums.get(i);
            //if I put "System.out.println(uniqueNums);" this here, it will print it 6 times
        }
        System.out.println(uniqueNums);//so i put it after for loop

        //3 way
        uniqueNums.addAll(nums);
        System.out.println(uniqueNums);

        //Copy the values/content of different collections
        Set<Integer> uniqueNums2 = new HashSet<>(nums);//--> I can pass in () any collections type, such as, List, Set, Queue.
        System.out.println(uniqueNums2);

        Set<Integer> nums3 = new HashSet<>();
        nums3.add(243);
        nums3.add(112);
        nums3.add(22);
        nums3.add(241243);
        //Add is adding on top of what the Set already has
        nums3.addAll(uniqueNums2);
        System.out.println(nums3);

    }

}
