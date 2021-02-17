package CodingBatArrays1;

import java.util.Arrays;

public class midThree {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(midThree(nums)));

    }
    public static int[] midThree(int[] nums){
        if(nums.length > 3) {
            int[] nums2 = {nums[(nums.length / 2) - 1], nums[(nums.length / 2)], nums[(nums.length / 2) + 1]};
            return nums2;
        }
        return nums;
    }
}
