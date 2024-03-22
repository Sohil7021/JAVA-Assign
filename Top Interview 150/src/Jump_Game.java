public class Jump_Game {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean ans = jump(nums);
        System.out.println(ans);
    }
    static boolean jump(int[] nums) {
        int curr = 0;

        for (int i = 0; i < nums.length ; i++) {

            if (i > curr) {
                return false;
            }

            curr = Math.max(curr,i+nums[i]);

        }
        return true;
    }
}
