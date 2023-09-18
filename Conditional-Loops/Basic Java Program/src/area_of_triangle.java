import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height:- ");
        double h = in.nextDouble();
        System.out.print("Enter the base:- ");
        double b = in.nextDouble();

        double a = (h * b) / 2;
        System.out.println("The area of triangle is:- " + a);
    }
}
