import java.util.Scanner;

public class Calculate_Discount_Of_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price:- ");
        double originalPrice = in.nextDouble();

        System.out.print("Enter the discount price:- ");
        double discount = in.nextDouble();

        if (discount < 0 || discount > 100) {
            System.out.println("Invalid discount price");
        }

        double discountAmount = (discount / 100) * originalPrice;
        double discountPrice = originalPrice - discountAmount;

        System.out.println("The original price:- " + originalPrice);
        System.out.println("The discount percentage:- "+ discount);
        System.out.println("The discount amount:-" + discountAmount);
        System.out.println("discount price:- " + discountPrice);
    }
}
