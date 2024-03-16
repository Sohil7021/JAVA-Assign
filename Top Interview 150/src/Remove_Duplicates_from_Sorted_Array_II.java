public class Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int ans = remove(nums);
        System.out.println(ans);

    }
    static int remove(int[] nums) {
        int count = 0;
       for (int n : nums) {
           if (count < 2 || n > nums[count-2] ) {
               nums[count++] = n;
           }
       }
       return count;
    }
}
