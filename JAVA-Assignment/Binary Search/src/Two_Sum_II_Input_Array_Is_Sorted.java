import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int[] result = twoSum2(numbers, 9);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            int start = i + 1;
            int end = numbers.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (numbers[mid] == complement) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] < complement) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int[] twoSum2(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target) {
                if (numbers[end - 1] > target - numbers[start]) {
                    end = binarySearch(numbers, target - numbers[start], start + 1, end - 1);
                } else {
                    end--;
                }

            } else if (numbers[start+1] < target - numbers[end]) {
                start = binarySearch(numbers,target-numbers[end],start+1,end-1);
            }else {
                start++;
            }
        }
        return new int[]{start+1,end+1};
    }




    static int binarySearch(int[] numbers,int target,int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] > target) {
                return binarySearch(numbers,target,0,end - 1);
            }else {
                return binarySearch(numbers,target,mid + 1,end);
            }
        }
        return -1;
    }

}
