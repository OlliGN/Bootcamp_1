package CodingBatArrays1;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args){

        int[] nums = {3};
        System.out.println((Arrays.toString(makeLast(nums))));

    }
    public static int[] makeLast(int[] nums){
        int[] array2 = new int[nums.length *2];
        array2[array2.length-1] = nums[nums.length -1];
        return array2;
    }
}
