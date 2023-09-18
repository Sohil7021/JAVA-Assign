import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of width:- ");
        double w = in.nextDouble();
        System.out.print("Enter the area of height:- ");
        double h = in.nextDouble();

        double a = w * h;
        System.out.println("The area of recatangle is:- " + a);
    }
}
