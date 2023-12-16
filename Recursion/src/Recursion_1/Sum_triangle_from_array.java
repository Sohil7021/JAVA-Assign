package Recursion_1;

import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = generateSumTriangle(arr);
        System.out.println(Arrays.toString(result));


    }

    static void sum_Triangle(int[] arr) {
//        Iterative Approach
        if (arr.length < 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }
        sum_Triangle(temp);

        System.out.println(Arrays.toString(arr));


    }


    static void sum_Triangle2(int[] arr) {
//        Recursive Approach

        if (arr.length == 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];
        helper(arr, temp, 0);
        sum_Triangle2(temp);
        System.out.println(Arrays.toString(temp));


    }

    static int[] helper(int[] arr, int[] temp, int index) {
        if (index == arr.length - 1) {
            return temp;
        }

        temp[index] = arr[index] + arr[index + 1];
        return helper(arr, temp, index + 1);
    }


//    GFG

    static int[] generateSumTriangle(int[] inputArray) {
        int n = inputArray.length;
        int[] resultArray = new int[n * (n + 1) / 2]; // Size of the result array

        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int currentElement = inputArray[i - j];
                resultArray[resultIndex] += currentElement;
                resultIndex++;
            }
        }

        return resultArray;

    }
}
