import java.util.Scanner;

public class Calculate_Depreciation_of_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the v1:- ");
        int v1 = in.nextInt();
        System.out.print("Enter the rate:- ");
        int r = in.nextInt();
        System.out.print("Enter the time:- ");
        int t = in.nextInt();

        double result = v1 * (Math.pow((1 - r / 100) , t));
        System.out.println("The depreciation value is:- " + result);

    }
}
