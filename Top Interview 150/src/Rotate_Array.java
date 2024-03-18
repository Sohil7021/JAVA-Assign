import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k) {
        k %= arr.length;
        swap(arr,0, arr.length-1);
        swap(arr,0,k-1);
        swap(arr,k, arr.length-1);


    }

    static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



}
