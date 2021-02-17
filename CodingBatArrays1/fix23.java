package CodingBatArrays1;

import java.util.Arrays;

public class fix23 {
    public static void main(String[] args){
        int[] nums = {2,2,2};
        System.out.println(Arrays.toString(fix23(nums)));

    }
    public static int[] fix23(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 3){
                nums[i+1] = 0;
                return nums;
            }
        }
        return nums;
    }
}
