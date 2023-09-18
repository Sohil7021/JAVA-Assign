import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:-");
        double r = in.nextDouble();

        double v = (4 * Math.PI * r*r*r) / 3;
        System.out.println("The Volume Of Sphere is:- " + v);
    }
}
