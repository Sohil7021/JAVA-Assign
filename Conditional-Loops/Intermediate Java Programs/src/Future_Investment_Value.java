import java.util.Scanner;

public class Future_Investment_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle:- ");
        double p = in.nextDouble();
        System.out.print("Enter the rate:- ");
        double r = in.nextDouble();
        System.out.print("Enter the time:- ");
        double t = in.nextDouble();


        double future = p * (Math.pow((1+r/100),t));
        System.out.println("The future investment is:- " + future);










    }
}
