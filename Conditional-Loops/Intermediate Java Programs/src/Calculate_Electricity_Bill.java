import java.util.Scanner;

public class Calculate_Electricity_Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of unit consumed:-  ");
        double consumed = in.nextDouble();

        double rate = 5.0;

        double totalBill = consumed * rate;

        System.out.println("The electricity bill is:- " + totalBill);
    }
}
