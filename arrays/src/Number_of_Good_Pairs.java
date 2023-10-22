public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int result = numIdenticalPair(nums);
        System.out.println(result);


    }
    static int numIdenticalPair(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
