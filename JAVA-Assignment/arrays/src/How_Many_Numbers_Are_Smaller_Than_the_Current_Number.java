import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNum2(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] smallerNum(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length ; j++) {
                if (nums[j] < nums[i] && j != i) {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;




    }

    static int[] smallerNum2(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i < count.length ; i++) {
            count[i] += count[i-1];
        }

        int[] smallerCount = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] > 0) {
                smallerCount[i] = count[nums[i] - 1];
            }
        }
        return smallerCount;
    }
}
