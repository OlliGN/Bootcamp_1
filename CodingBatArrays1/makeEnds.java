package CodingBatArrays1;

public class makeEnds {
    public static void main(String[] args){

    }
    public static int[] makeEnds(int[] nums){
        if(nums.length > 1){
            int[] nums2 = {nums[0], nums[nums.length-1]};
            return nums2;
        }
        int[] nums2 =  {nums[0], nums[0]};
        return nums2;
    }
}
