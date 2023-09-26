import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum2(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }


    static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length ; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
