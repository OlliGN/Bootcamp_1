package CodingBatArrays1;

import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(frontPiece(nums)));

    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int[] nums2 = {nums[0], nums[1]};
            return nums2;
        }
        return nums;
    }
}
