import java.util.Scanner;

public class factorial_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = in.nextInt();

        int ans = factorial(n);
        System.out.println("The factorial of number is:- " + ans);
    }

    static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n ; i++) {
            product *= i;
        }

        return product;
    }
}
