import java.util.Scanner;

public class Fibonacci_Series_In_Java_Programs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");

        int n = in.nextInt();

       int a = 0;
       int b = 1;


       while (a <= n) {
           System.out.println(a);
           int temp = a + b;
           a = b;
           b = temp;
       }
//        System.out.println(b);



        }

    }

