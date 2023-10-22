import java.util.Scanner;

public class rupees_to_dollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in rupees:- ");
        float rupees = in.nextFloat();
        float usd = rupees / 64;
        System.out.println("The rupee to usd is:- " + usd);
    }
}
