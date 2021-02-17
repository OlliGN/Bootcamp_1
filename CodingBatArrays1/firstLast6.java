package CodingBatArrays1;

import java.util.Scanner;

import java.util.Arrays;

public class firstLast6 {
    public static void main(String[] args) {
        //Scanner for Arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Enters your numbers:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.println(firstLast6(nums));

    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        }
        return false;

        //Shortcut
        // return(nums[0] == 6 || nums[nums.length - 1] == 6);
    }
}


