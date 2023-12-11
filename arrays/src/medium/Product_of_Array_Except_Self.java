package medium;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = product(nums);
        System.out.println(Arrays.toString(result));

    }
    static int[] product_Self(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        int[] result = new int[n];

        int leftElement = 1;
        for (int i = 0; i < n ; i++) {
            left[i] = leftElement;
            leftElement *= arr[i];
        }

        int rightElement = 1;
        for (int i = n-1; i >= 0 ; i--) {
            right[i] = rightElement;
            rightElement *= arr[i];
        }


        for (int i = 0; i < n ; i++) {
            result[i] = left[i] * right[i];
        }


        return result;
    }

    static int[] product(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int left = 1;
        int right = 1;

        for (int i = n-1; i >=0 ; i--) {
           output[i] = right;
           right *= nums[i];
        }

        for (int i = 0; i < n ; i++) {
            output[i] *= left;
            left *= nums[i];

        }
        return output;
    }
}
