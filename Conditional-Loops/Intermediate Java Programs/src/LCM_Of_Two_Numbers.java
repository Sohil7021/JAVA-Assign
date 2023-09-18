import java.util.Scanner;

public class LCM_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();

        int lcm = (num1 > num2 ) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }


    }
}
