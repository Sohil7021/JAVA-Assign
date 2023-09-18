import java.util.Scanner;

public class substract_the_product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = in.nextInt();

       int product = 1;
       int sum = 0;
       
       while (n > 0) {
           int r = n % 10;
           product *= r;
           sum += r;
           n /= 10;


       }

        System.out.println(product - sum);



    }
}
