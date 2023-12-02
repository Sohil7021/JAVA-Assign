package GFG;

public class Mean_of_array_using_recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int result = (int) findMean(arr,n);
        System.out.println(result);

    }
    static float findMean(int[] arr, int n) {

        if (n == 1) {
            return (float) arr[n-1];
        }else {
            return ((float)(findMean(arr, n-1)*(n-1) +
                    arr[n-1]) / n);
        }
    }
}
