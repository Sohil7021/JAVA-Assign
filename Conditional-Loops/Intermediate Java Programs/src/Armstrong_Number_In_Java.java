import java.util.Scanner;

public class Armstrong_Number_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int num = in.nextInt();

        int originalNum = num;
        int sum = 0;
        int digitNum = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit,digitNum);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong:- " + originalNum);
        }else {
            System.out.println("Not armstrong:- " + originalNum);
        }

    }
}
