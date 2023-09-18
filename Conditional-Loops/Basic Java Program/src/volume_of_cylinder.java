import java.util.Scanner;

public class volume_of_cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:- ");
        double r = in.nextDouble();
        System.out.print("Enter the height:- ");
        double h = in.nextDouble();

        double v = Math.PI * r * r * h;
        System.out.println("The volume of cylinder is:- " + v);
    }
}
