package Lists;

import java.util.*;

public class sortLists {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(5);
        nums.add(45);
        nums.add(335);
        nums.add(845);

        System.out.println(nums);

        //sort numerically
        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);

    }
}
