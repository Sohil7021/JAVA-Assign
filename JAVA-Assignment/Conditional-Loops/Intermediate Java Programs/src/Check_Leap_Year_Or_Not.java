import java.util.Scanner;

public class Check_Leap_Year_Or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year:- ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year:- " + year);
        }else {
            System.out.println("Not leap year:- " + year);
        }

    }
}
