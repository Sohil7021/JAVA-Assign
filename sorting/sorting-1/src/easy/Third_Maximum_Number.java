package easy;

import java.util.Arrays;

public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int result = third_max(nums);
        System.out.println(result);

    }
    static int third_max(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for(int i:nums){
            if(i > max){
                tmax = smax;
                smax = max;
                max = i;
            }else if(i > smax && i!=max){
                tmax = smax;
                smax = i;
            }else if(i > tmax && i!=smax && i!= max){
                tmax = i;
            }
        }

        return tmax == Long.MIN_VALUE ? (int) max : (int) tmax;


    }
}
