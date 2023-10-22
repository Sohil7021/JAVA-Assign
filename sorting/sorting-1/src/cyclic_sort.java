import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

//    Range given from  [1 to n] apply Cyclic Sort -> *** Value - 1 ***

//    Range given from  [0 to n] apply Cyclic Sort -> *** Value ***

//    The complexity is O(N)

    static void cyclic_sort(int[] arr) {
        int i  = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
