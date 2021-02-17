package CodingBatArrays1;

import java.util.Arrays;

public class swapEnds {
    public static void main(String[] args){
        int[] nums = {1,2,5,6};
        System.out.println(Arrays.toString(swapEnds(nums)));

    }
    public static int[] swapEnds(int[] nums){
        if(nums.length > 1){
            int a = nums[0];
            nums[0] = nums[nums.length -1];
            nums[nums.length-1] = a;
            return nums;
        }
        return nums;
    }
}
