import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int n = in.nextInt();

        if (isEven(n)) {
            System.out.println("The number is even:- " + n);
        }else {
            System.out.println("The number is odd:- " + n);
        }


    }

    static boolean isEven(int n) {
        return  n % 2 == 0;
    }
}



