import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};

        List<Boolean> result = kidsWithCandies(candies,3);
        System.out.println(Arrays.toString(new List[]{result}));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length ; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length ; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;

    }

    static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = 0;
        for(int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        Boolean[] result = new Boolean[candies.length];
        for (int i = 0; i < candies.length ; i++) {
            if (candies[i] + extraCandies >= max) {
                result[i] = true;
            }else {
                result[i] = false;
            }
        }
        return Arrays.asList(result);
    }
}
