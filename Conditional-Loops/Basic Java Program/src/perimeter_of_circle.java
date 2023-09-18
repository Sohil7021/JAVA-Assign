import java.util.Scanner;

public class perimeter_of_circle {
    public static void main(String[] arg5s) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:- ");
        double r = in.nextDouble();

        double c = 2 * Math.PI * r;
        System.out.println("The area of perimeter is:- " + c);
    }
}
