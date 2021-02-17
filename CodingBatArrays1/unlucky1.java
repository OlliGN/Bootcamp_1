package CodingBatArrays1;

public class unlucky1 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        System.out.println(unlucky1(nums));

    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            if ((nums[0] == 1 && nums[1] == 3)
                    || (nums[1] == 1 && nums[2] == 3)
                    || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
                return true;
            }
        }
        return false;
    }
}
