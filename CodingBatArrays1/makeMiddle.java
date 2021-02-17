package CodingBatArrays1;

import java.util.Arrays;

public class makeMiddle {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,1,2};
        System.out.println(Arrays.toString(makeMiddle(nums)));

    }
    public static int[] makeMiddle(int[] nums){
         int a =  nums[(nums.length /2) -1];
         int b = nums[nums.length/2];
         int[] ab = {a,b};
         return ab;
    }
}
