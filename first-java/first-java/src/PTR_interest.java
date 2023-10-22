import java.util.Scanner;

public class PTR_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle value:- ");
        int p = in.nextInt();
        System.out.print("Enter the time value:- ");
        int t = in.nextInt();
        System.out.print("Enter the rate value:- ");
        int r = in.nextInt();

        int interest = (p * t * r) / 100;
        System.out.println("The simple interest is:- " + interest);
    }
}
