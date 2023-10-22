import java.util.Scanner;

public class circumference_area_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the circle of radius:- ");
        double r = in.nextDouble();

        double ans = circumference(r);
        System.out.println("The circumference of  circle is:- " + ans);

        double ans1 = area_circle(r);
        System.out.println("The area of circle is:- " + ans1);
    }

    static double circumference(double r) {
        return 2*Math.PI*r;
    }

    static double area_circle(double r) {
        return Math.PI*r*r;
    }

}
