package CodingBatArrays1;

import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(nums)));

    }

    public static int[] reverse3(int[] nums) {
        int[] reverse = {nums[2], nums[1], nums[0]};
        return reverse;
    }
}
