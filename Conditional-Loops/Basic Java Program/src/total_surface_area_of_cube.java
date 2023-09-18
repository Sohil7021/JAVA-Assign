import java.util.Scanner;

public class total_surface_area_of_cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of side:- ");
        double a = in.nextDouble();

        double p = 6 * a * a;
        System.out.println("The total surface area of cube is:-  " + p);

    }
}
