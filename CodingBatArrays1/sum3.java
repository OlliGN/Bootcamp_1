package CodingBatArrays1;

public class sum3 {
    public static void main(String[] args) {
        int[] num = {1, 12, 13, 12, 1};
        System.out.println(sum3(num));

    }

    //returns the sum of all the elements.
    public static int sum3(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
