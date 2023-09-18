import java.util.Scanner;

public class Calculate_Commission_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the commission price:- ");
        double commission = in.nextDouble();

        System.out.print("Enter the sales amount:- ");
        double sales = in.nextDouble();

        double percentage = (commission / sales) * 100;

        System.out.println("The commission percentage is:- " + percentage + "%");

    }
}
