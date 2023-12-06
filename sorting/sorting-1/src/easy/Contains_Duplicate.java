package easy;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean result = duplicate(nums);
        System.out.println(result);

    }
    static boolean duplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }
}
