import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter a num2:- ");
        int num2 = in.nextInt();

        if (num1 < num2) {
            System.out.println("The largest num is:- " + num2);
        }else {
            System.out.println("The largest num is:- " + num1);
        }

    }
}
