public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    static  int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;


    }

}
