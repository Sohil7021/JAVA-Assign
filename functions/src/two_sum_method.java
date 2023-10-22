import java.util.Scanner;

public class two_sum_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        int ans = sum(num1,num2);
        System.out.println("The sum is:- " + ans);

    }

    static int sum(int num1, int num2) {
        return num1 +  num2;
    }
}
