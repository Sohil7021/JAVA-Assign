package easy;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
    static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            if (count == 0) {
                count  = 1;
                candidate = nums[i];
            }else {
                if (candidate == nums[i]) {
                    count++;
                }else {
                    count--;
                }
            }
        }
        return candidate;
    }
}
