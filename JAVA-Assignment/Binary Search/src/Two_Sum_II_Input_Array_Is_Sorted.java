import java.util.Arrays;

public class Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
            int[] numbers = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997,
        542};
            int[] result = twoSum(numbers,9);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] numbers,int target) {
        for (int i = 0; i < numbers.length ; i++) {
            int complement = target - numbers[i];
            int start = i+1;
            int end = numbers.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (numbers[mid] == complement) {
                    return new int[] {i+1,mid+1};
                }else if (numbers[mid] < complement) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return new int[] {-1,-1};
    }

}
