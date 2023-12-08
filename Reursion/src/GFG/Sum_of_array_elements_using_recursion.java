package GFG;

public class Sum_of_array_elements_using_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = sum_Array(arr);
        System.out.println(result);

    }
    static int sum_Array(int[] arr) {
        return helper(arr,arr.length);

    }
    static int helper(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }else {
            return (helper(arr,n-1) + arr[n-1]);
        }
    }
}
