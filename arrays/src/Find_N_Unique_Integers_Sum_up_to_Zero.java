import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {

        int[] result = sumZero2(5);
        System.out.println(Arrays.toString(result));

    }
    static int[] sumZero(int n) {
        int[] ans = new int[n];


        for (int i = 0; i < n - 1 ; i+= 2) {
            ans[i] = i + 1;
            ans[i+1] = -(i+1);
        }
        return ans;


    }

    static int[] sumZero2(int n) {
        int[] ans = new int[n];
        int sum = 0;

        for (int i = 0; i < n-1 ; i++) {
            ans[i] += i+1;
            sum += ans[i];
        }

        ans[n-1] = -sum;
        return ans;
    }
}
