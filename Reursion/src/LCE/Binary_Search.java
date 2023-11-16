package LCE;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int result = search(arr,5,0,arr.length - 1);
        System.out.println(result);

    }
    static int search(int[] arr,int target, int s, int e ) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }

    }

