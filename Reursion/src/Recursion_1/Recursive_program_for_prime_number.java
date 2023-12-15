package Recursion_1;

public class Recursive_program_for_prime_number {
    public static void main(String[] args) {
        boolean result = isPrime(11,2);
        System.out.println(result);

    }
    static boolean prime(int n) {
        int c = 2;
       while (c * c <= n) {
           if (n % c == 0) {
               return false;
           }
           c++;
       }
       return true;
    }



    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n==2 ? true : false;
        }

        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return isPrime(n,i+1);
    }
}
