package Recursion_1;

public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) {
        int result = sum_natural_number(4);
        System.out.println(result);

    }
    static int sum_natural_number(int n) {
        if (n <= 1) {
            return 1;
        }

        return n + sum_natural_number(n-1);
    }
}
