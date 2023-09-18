import java.util.Scanner;

public class perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base:- ");
        double b = in.nextDouble();
        System.out.print("Enter the side a:- ");
        double a = in.nextDouble();

        double p = 2 * (a+b);
        System.out.println("The perimeter of parallelogram is:- " + p);
    }
}
