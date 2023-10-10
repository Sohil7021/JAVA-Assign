public class Valid_Perfect_Square {
    public static void main(String[] args) {
        int num = 14;
        boolean result = isPerfectSquare(num);
        System.out.println(result);

    }
    static boolean isPerfectSquare(int num) {

//        use long data Type for long integer value
        if (num == 1) {
            return true;
        }


        int start = 1;
        int end = num / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            }else if (mid * mid > num) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
