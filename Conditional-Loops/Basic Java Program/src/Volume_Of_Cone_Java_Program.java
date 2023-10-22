import java.util.Scanner;

public class Volume_Of_Cone_Java_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:- ");
        double r = in.nextDouble();
        System.out.print("Enter the height:- ");
        double h = in.nextDouble();

        double v = Math.PI * r * r * (h/3);
        System.out.println("The volume of cone is:- " + v);
    }
}
