package CodingBatArrays1;

public class maxTriple {
    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 2, 13};
        System.out.println(maxTriple(nums));
        //System.out.println(nums[nums.length/2]);
    }

    public static int maxTriple(int[] nums) {
        if (nums.length > 1) {
            if (nums[0] > nums[(nums.length / 2)] && nums[0] > nums[nums.length - 1]) {
                return nums[0];
            } else if (nums[nums.length / 2] > nums[0] && nums[nums.length / 2] > nums[nums.length - 1]) {
                return nums[(nums.length / 2)];
            } else if (nums[nums.length - 1] > nums[0] && nums[nums.length - 1] > nums[(nums.length / 2)]) {
                return nums[nums.length - 1];
            }
        }
        return nums[0];
    }
}
