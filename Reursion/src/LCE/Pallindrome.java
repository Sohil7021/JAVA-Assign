package LCE;

public class Pallindrome {
    public static void main(String[] args) {
        boolean ans = palin(1234);
        System.out.println(ans);
    }
    static int reverse(int n) {
        int digit = (int) (Math.log10(n)) + 1;

        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10,digit-1) + helper(n/10,digit-1);
    }

    static boolean palin(int n) {
        return  n == reverse(n);
    }
}
