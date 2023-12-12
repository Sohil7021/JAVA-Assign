package Medium;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = search(nums,target);
        System.out.println(Arrays.toString(result));

    }


    static int[] search(int[] nums, int target) {
//        int[] ans = {-1,-1};
//        ans[0] = binary_Search(arr,target,true);
//        if (ans[0] != -1) {
//         ans[1] =   binary_Search(arr,target,false);
//        }
//        return ans;


        int[] result = new int[] {-1,-1};
        result[0] = first(nums,target);

        result[1] = last(nums,target);

        return result;
    }


    static int binary_Search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


//    Another Method
    static int first(int[] nums, int target) {
        int ans1 = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans1 = mid;
                end = mid - 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans1;
    }


    static int last(int[] nums, int target) {
        int ans2 = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans2 = mid;
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans2;
    }
}
