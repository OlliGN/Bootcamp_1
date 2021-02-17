package CodingBatArrays1;

public class sum2 {
    public static void main(String[] args) {

    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        }
            return nums[0] + nums[1];
    }
}
