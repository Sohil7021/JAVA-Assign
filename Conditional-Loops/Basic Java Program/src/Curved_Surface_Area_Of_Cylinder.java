import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:- ");
        double r = in.nextDouble();
        System.out.print("Enter the height:- ");
        double h = in.nextDouble();

        double v = 2 * Math.PI * r * h;
        System.out.println("The Curved Surface Area Of Cylinder is:- " + v);
    }
}
