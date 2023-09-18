import java.util.Scanner;

public class area_of_parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base:- ");
        double b = in.nextDouble();
        System.out.print("Enter the height:- ");
        double h = in.nextDouble();

        int a = (int) (b * h);
        System.out.println("The area of parallelogram is:- " + a);
    }
}

