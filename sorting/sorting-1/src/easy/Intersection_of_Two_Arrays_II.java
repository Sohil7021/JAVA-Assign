package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] result = intersection(nums1,nums2);
        System.out.println(Arrays.toString(result));

    }
    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> set = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j] ) {
                j++;
            }else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[set.size()];
        int index = 0;
        for(int num: set) {
            result[index++] = num;
        }

        return result;


    }
}
