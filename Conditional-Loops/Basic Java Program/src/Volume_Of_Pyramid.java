import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length:- ");
        double l = in.nextDouble();
        System.out.print("Enter the width:- ");
        double w = in.nextDouble();
        System.out.print("Entre the height:- ");
        double h = in.nextDouble();

        double v = (l*w*h) / 3;
        System.out.println("The volume of pyramid is:- " + v);
    }
}
