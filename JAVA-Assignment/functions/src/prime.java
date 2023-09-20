import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = in.nextInt();

        if (isPrime(n)) {
            System.out.println("The given number is prime:- " + n);
        }else {
            System.out.println("The given number is not prime:- " + n);
        }


    }

//    static boolean prime_num(int n) {
//        int c = 2;
//        while (c*c <= n) {
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return c*c > n;
//    }


    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
