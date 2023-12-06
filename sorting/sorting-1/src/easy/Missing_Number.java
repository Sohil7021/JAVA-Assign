package easy;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int result = missing(nums);
        System.out.println(result);

    }
    static int missing(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += nums[i];
        }
        return n * (n + 1) / 2 - sum;
    }






    static int missing_number(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums [correctIndex]) {
                swap(nums,i,correctIndex);
            }else {
                i++;
            }

        }

        for (int index = 0; index < nums.length ; index++) {
            if (nums[index] != index) {
                return index;

            }
        }
        return nums.length;


    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
