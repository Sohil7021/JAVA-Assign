package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int num: nums1) {
            set.add(num);
        }

        for(int nums: nums2) {
            if (set.contains(nums)) {
                intersect.add(nums);
            }
        }

        int[] result = new int[intersect.size()];
        int index = 0;
        for(int num : intersect) {
            result[index++] = num;
        }
        return result;
    }
}
