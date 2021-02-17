package CodingBatArrays1;

import java.util.Arrays;

public class maxEnd3 {
    public static void main(String[] args){
        int[] nums = {2,11,2};
        System.out.println(Arrays.toString(maxEnd3(nums)));

    }
    public static int[] maxEnd3(int[] nums){

         if(nums[0] >= nums[2]){
            int[] nums1 = {nums[0],nums[0], nums[0]};
             return nums1;
         }
         else if(nums[2] > nums[0]){
             int[] nums1 = {nums[2], nums[2], nums[2]};
             return nums1;
         }
         return nums;
    }
}
