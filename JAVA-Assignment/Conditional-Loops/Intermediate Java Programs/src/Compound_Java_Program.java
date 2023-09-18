import java.util.Scanner;

public class Compound_Java_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle:- ");
        double p = in.nextDouble();
        System.out.print("Enter the rate:- ");
        double r = in.nextDouble();
        System.out.print("Enter the time:- ");
        double t = in.nextDouble();

        double interest =  p * (Math.pow((1+r/100),t));

        System.out.println("The compound interest is:- " + interest);

    }
}
