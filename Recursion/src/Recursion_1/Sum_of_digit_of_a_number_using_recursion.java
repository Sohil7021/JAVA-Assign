package Recursion_1;

public class Sum_of_digit_of_a_number_using_recursion {
    public static void main(String[] args) {

        int result = sum_digits_rec(54321);
        System.out.println(result);

    }
//    Iterative approach
    static int sum_digit(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;

            n /= 10;
            sum += rem ;
        }
        return sum;
    }

//    Recursive Approach
    static int sum_digits_rec(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum_digits_rec(n/10);
    }
}
