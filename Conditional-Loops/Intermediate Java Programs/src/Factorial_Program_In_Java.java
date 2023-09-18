import java.util.Scanner;

public class Factorial_Program_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = in.nextInt();
        int p = 1;

        for (int i = 1; i <= n ; i++) {
            p*= i;
        }
        System.out.println("The factorial of number is:- " + p);
    }
}
