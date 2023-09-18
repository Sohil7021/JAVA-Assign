import java.util.Scanner;

public class input_till_zero_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int sum = 0;

        while (true) {
            System.out.print("Enter the number:- ");
            n = in.nextInt();

            if (n == 0) {
                break;
            } else {
                sum += n;
            }
        }







        System.out.println(sum);
















//        System.out.println("The sum is:- " + sum);
    }
}
