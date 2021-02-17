package CodingBatArrays1;

public class double23 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 4};
        System.out.println(double23(nums));

    }

    public static boolean double23(int[] nums) {
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                counter++;
                if (counter >= 2) {
                    return true;
                }
            } else if (nums[i] == 3) {
                counter2++;
                if (counter2 >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
