import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The given number is Even:-" + num);
        }else {
            System.out.println("The given number is odd:-" + num);
        }

    }
}
