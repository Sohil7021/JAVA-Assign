import java.util.Scanner;

public class area_of_equilateral_traingle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the area of equilateral:- ");
        double a = in.nextDouble();

        double area = (Math.sqrt(3)/4) * (a*a);
        System.out.println("The area of equilateral triangle is:- " + area);


    }
}
