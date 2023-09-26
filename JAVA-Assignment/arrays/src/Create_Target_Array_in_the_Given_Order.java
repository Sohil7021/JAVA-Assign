import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            list.add(index[i], nums[i] );
        }

        for (int i = 0; i < target.length ; i++) {
            target[i] = list.get(i);
        }






        return target;

    }


}
