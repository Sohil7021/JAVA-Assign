import java.util.Scanner;

public class perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length:- ");
        double l = in.nextDouble();
        System.out.print("Enter the width:- ");
        double w = in.nextDouble();

        double p = 2 * (w+l);
        System.out.println("The perimeter of rectangle is:- " + p);
    }
}
