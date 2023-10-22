public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }
        static int findNumbers(int[] nums) {
            int evenDigitCount = 0;
            for (int i = 0; i < nums.length ; i++) {
                if (hasEvenDigit(nums[i])) {
                    evenDigitCount++;
                }

            }
            return evenDigitCount;

        }

    static boolean hasEvenDigit(int num) {
        int digitCount = 0;
        while (num != 0) {
            digitCount++;
            num /= 10;
        }
        return (digitCount % 2 == 0);
    }


}
