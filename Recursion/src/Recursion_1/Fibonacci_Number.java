package Recursion_1;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int result = fib(7);
        System.out.println(result);

    }



//    Normal Approach
    static int fib(int n) {
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        return b;
    }

//    Recursive Approach
    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
