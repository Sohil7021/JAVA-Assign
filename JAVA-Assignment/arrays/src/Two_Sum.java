import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        int[] result = twoSum(nums,9);
        System.out.println(Arrays.toString(result));

    }
    static int[] twoSum(int[] nums,int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }


    static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] {
                        map.get(comp),i
                };

            }
            map.put(nums[i],i);
        }
        return null;
    }
}
