import java.util.Scanner;

public class all_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        printPrimeNumbers(num1,num2);

        while (num1 < num2) {
            if (isPrime(num1)) {
                System.out.println(num1 + " ");
                num1++;
            }
        }
    }

     static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
