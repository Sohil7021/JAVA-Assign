public class armstrong {
    public static void main(String[] args) {
        int low = 999;
        int high = 99999;

        for (int i = low + 1; i < high ; i++) {
            int digit = 0;
            int result = 0;
            int originalNUmber = i;

            while (originalNUmber != 0) {
                originalNUmber /= 10;
                ++digit;
            }
            originalNUmber = i;


            while (originalNUmber != 0) {
                int remainder = originalNUmber % 10;
                result += Math.pow(remainder,digit);
                originalNUmber /= 10;
            }

            if (result == i) {
                System.out.println(i);
            }
        }
    }
}
