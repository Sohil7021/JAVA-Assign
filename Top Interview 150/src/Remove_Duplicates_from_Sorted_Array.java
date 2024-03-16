public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = remove(nums);
        System.out.println(ans);

    }
    static int remove(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
