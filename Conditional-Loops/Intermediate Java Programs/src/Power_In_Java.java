import java.util.Scanner;

public class Power_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number a:- ");
        int a = in.nextInt();
        System.out.print("Enter the base:- ");
        int b = in.nextInt();

        int result = (int) Math.pow(a,b);
        System.out.println("The power is:- " + result);


    }
}
