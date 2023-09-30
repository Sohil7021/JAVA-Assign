public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];

            max = Math.max(sum,max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }
}
