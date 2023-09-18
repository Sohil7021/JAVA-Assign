import java.util.Scanner;

public class Perfect_Number_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:- ");
        int num = in.nextInt();

        int sumOfDivi = 1;

        for (int i = 2; i*i <= num ; i++) {
            if (num % i ==0) {
                sumOfDivi += i;
                if (i != (num / i)) {
                    sumOfDivi += (num / i);
                }
            }
        }

        if (sumOfDivi == num) {
            System.out.println("Is perfect number:- " + num);
        }else  {
            System.out.println("Is not perefct number:- " + num);
        }



    }
}
