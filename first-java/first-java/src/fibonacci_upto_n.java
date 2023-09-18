import java.util.Scanner;

public class fibonacci_upto_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        while (a <= n) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;

        }

//        System.out.println("The fibonacci up to n is:- " + b);
    }
}
