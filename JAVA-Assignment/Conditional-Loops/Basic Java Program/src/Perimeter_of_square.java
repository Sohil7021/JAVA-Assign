import java.util.Scanner;

public class Perimeter_of_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of side:- ");
        double a = in.nextDouble();

        double p = 4 * a;
        System.out.println("The perimeter of square is:-  " + p);
    }
}
