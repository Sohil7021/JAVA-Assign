package GFG;

public class Sum_of_natural_numbers_using_recursion {
    public static void main(String[] args) {
        int result = sumN(4);
        System.out.println(result);

    }
    static int sumN(int n) {
        if (n <= 1) {
            return 1;
        }

        return n + sumN(n-1);
    }
}
