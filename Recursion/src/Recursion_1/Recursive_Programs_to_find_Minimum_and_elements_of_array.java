package Recursion_1;

public class Recursive_Programs_to_find_Minimum_and_elements_of_array {
    public static void main(String[] args) {
      int[]  arr = {1, 4, 3, -5, -4, 8, 6};
      int result = findMin(arr, arr.length);
        System.out.println(result);
        int ans = findMax(arr, arr.length);
        System.out.println(ans);

    }
    static int findMin(int[] arr,int n) {
        if(n == 1) {
            return arr[0];
        }

        return Math.min(arr[n-1],findMin(arr,n-1) );
    }


    static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n-1],findMax(arr,n-1) );
    }

}
