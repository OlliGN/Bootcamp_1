package CodingBatArrays1;

import java.util.Arrays;

public class has23 {
    public static void main(String[] args) {
        int[] nums = {3, 9};
        System.out.println(has23(nums));

    }

    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
