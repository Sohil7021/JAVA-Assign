package Recursion_1;

import java.util.Arrays;

public class Recursive_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertion_sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion_sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        insertion_sort(arr,n-1);
        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = last;


    }
}
