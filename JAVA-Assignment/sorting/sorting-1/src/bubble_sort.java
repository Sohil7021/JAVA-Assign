import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {0,-25,-1,1,2,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

//    Unstable sort and both complexity (N^2)


    static void bubble_sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length  ; i++) {
            swapped = false;

            // run the steps n-1 times

            // for each step, max item will come at the last respective index

            for (int j = 1; j < arr.length - i ; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }


            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program

            if (!swapped) {
                break;
            }
        }

    }


    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = arr.length - 2; i >= 0 ; i--) {
            swapped = false;
            for (int j = 0; j <= i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }


    }


}
