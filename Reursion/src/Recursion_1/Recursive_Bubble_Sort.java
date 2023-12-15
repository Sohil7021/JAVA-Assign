package Recursion_1;

import java.util.Arrays;

public class Recursive_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,2,1};
        bubble_sort(arr, arr.length - 1,0 );
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_sort(int[] arr, int r, int c) {
//        base condition
        if(r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble_sort(arr,r,c+1);
        }else {
            bubble_sort(arr,r-1,0);
        }
    }
}
