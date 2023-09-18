import java.util.Scanner;

public class HCF_Of_Two_Numbers_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }


        System.out.println("The hcf is:- " + num1 );
    }
}
