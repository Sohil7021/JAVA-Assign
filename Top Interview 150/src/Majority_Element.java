import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int ans = majority(nums);
        System.out.println(ans);
    }
    static int majority(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];

//        Moore Voting Algorithm
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
