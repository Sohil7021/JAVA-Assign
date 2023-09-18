import java.util.Scanner;

public class Sum_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n number:- ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            System.out.print("Enter the number n: " + i + " :");
            int num = in.nextInt();
            sum += num;
        }

        System.out.println("The sum of N number is:- " + sum);

    }
}
