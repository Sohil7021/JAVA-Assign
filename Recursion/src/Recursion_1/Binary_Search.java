package Recursion_1;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = binarySearch(nums,target,0, nums.length-1);
        System.out.println(result);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr,target,mid+1,end);
        }else {
            return binarySearch(arr,target,start,mid-1);
        }

    }
}
