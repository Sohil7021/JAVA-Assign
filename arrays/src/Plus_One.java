import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >=0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
         int[] result = new int[n+1];
        result[0] = 1;
        return result;


    }
}
