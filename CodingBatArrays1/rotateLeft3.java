package CodingBatArrays1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateLeft3 {
    public static void main(String[] args) {
        int[] nums = {5, 11, 9};
        System.out.println(Arrays.toString(rotateLeft3(nums)));

    }

    public static int[] rotateLeft3(int[] nums) {

        int[] rotated = {nums[1], nums[2], nums[0]};


        return rotated;
    }
}
