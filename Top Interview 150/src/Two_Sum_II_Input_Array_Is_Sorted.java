import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = sum(nums,9);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sum2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(nums[start] + nums[end] != target) {
            if(nums[start] + nums[end] < target) {
                start++;
            }else {
                end--;
            }
        }

        return new int[] {start+1,end+1};
    }

//    Arrays is Sorted apply - Binary Search
    static int[] sum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (nums[l] + nums[r] != target ) {
            if (nums[l] + nums[r] > target) {
                if (nums[r-1] > target - nums[l]) {
                    r = binary_Search(nums,target-nums[l],l+1,r-1);
                }else {
                    r--;
                }


            }else {
                if (nums[l+1] < target - nums[r]) {
                    l = binary_Search(nums,target-nums[r],l+1,r-1);
                }else {
                    l++;
                }
            }


        }
        return new  int[] {l+1,r+1};

    }

    static int binary_Search(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (end <= start) {
            return mid;
        }
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binary_Search(nums,target,start,end-1);
        } else if (nums[mid] < target) {
            return binary_Search(nums,target,start+1,end);
        }
        return mid;
    }
}
