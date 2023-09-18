import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of side:- ");
        double a = in.nextDouble();

        double p = 3 * a;
        System.out.println("The perimeter of equilateral triangle is:-  " + p);
    }
}
