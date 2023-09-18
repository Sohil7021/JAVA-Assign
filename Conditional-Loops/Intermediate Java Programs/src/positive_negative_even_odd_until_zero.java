import java.util.Scanner;

public class positive_negative_even_odd_until_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int negSum = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        while (true) {
            System.out.println("Entre the number:- ");
          int  n = in.nextInt();

          if (n == 0) {
              break;
          } else if (n < 0) {
              negSum += n;
          }else if (n % 2 == 0) {
              sumOfEven += n;
          }else {
              sumOfOdd += n;
          }


        }

        System.out.println("The sum negative number:- " + negSum);
        System.out.println("The sum of even positive:- " + sumOfEven);
        System.out.println("The sum of odd number:- " + sumOfOdd);
    }
}
