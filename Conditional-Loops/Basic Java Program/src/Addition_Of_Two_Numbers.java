import java.util.Scanner;

public class Addition_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is:- " + sum);

    }
}
