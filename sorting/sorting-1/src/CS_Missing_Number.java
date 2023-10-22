import java.util.Arrays;

public class CS_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        System.out.println(missing_num(arr));

    }
    static int missing_num(int[] arr) {
//        0 to n range
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if ( arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        for (int index = 0; index < arr.length ; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
