import java.util.Scanner;

public class sum_natural_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = in.nextInt();

        int ans = naturalSum(n);
        System.out.println("The sum of natural number is:- " + ans);
    }

    static int naturalSum(int n) {
        if (n < 0) {
            return -1;
        }

        return (n*(n+1)) / 2;
    }
}
