import java.util.Scanner;

public class Calculate_Average_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = in.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n ; i++) {
            System.out.print("Enter the number:- " + i);
            double num = in.nextDouble();
            sum += num;
        }

        double avg = sum / n;
        System.out.print("The average is :- " + avg);

    }
}
