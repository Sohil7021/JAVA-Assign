import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {

        int n = 121;

        if (palindrome(n)) {
            System.out.println("The number is palindrome:- " + n);
        }else {
            System.out.println("The number is not palindrome:- " + n);
        }




    }

    static boolean palindrome(int n) {
        if (n < 0) {
            return false;
        }

        int originalNum = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return originalNum == reversed;


    }
}
