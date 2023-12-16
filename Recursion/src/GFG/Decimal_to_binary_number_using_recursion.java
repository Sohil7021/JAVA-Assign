package GFG;

public class Decimal_to_binary_number_using_recursion {
    public static void main(String[] args) {
        int result = decimal_Binary(7);
        System.out.println(result);

    }
    static int decimal_Binary(int n) {
        if (n == 0) {
            return 0;
        }else {
            return (n % 2 + 10 * decimal_Binary(n / 2));
        }
    }
}
