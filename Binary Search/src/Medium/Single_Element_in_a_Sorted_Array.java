package Medium;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = single(nums);
        System.out.println(result);
    }
    static int single_element(int[] nums) {
        int start = 0;
        int end = nums.length - 1;


        while (start < end) {
            int mid = start + (end - start) / 2;
            if(mid % 2 == 1) {
                mid--;
            }  if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            }else {
                end = mid;
            }
        }

        return nums[start];
    }


    static int single(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
//            Even Odd index Pattern
            if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return nums[start];
    }
}
