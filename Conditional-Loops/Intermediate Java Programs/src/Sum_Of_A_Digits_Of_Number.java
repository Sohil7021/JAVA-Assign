import java.util.Scanner;

public class Sum_Of_A_Digits_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- " );
        int num = in.nextInt();
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem;

            num /= 10;
        }
        System.out.println("The sum of digit is:- " + sum);
    }
}
