import java.util.Scanner;

public class input_till_zero_largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max =0;
        int n;

        while (true) {
            System.out.print("Enter the number:- ");
            n = in.nextInt();

            if (n == 0){
                break;
            }

            if (n > max) {
                max = n;
            }


        }
        System.out.println(max);
    }
}
