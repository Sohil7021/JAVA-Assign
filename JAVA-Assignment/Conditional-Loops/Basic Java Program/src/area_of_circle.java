import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:-");
        double r = in.nextInt();
        double a = 3.142 * r * r;
        System.out.println("The area of circle is:- " + a);
    }
}
