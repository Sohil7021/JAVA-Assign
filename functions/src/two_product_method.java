import java.util.Scanner;

public class two_product_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        int ans = product(num1,num2);

        System.out.println("The product of two number is:- " + ans);
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }
}
