import java.util.Scanner;

public class Calculate_Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of runs:- ");
        int runs = in.nextInt();

        System.out.print("Enter the number of matches:- ");
        int matches = in.nextInt();

        System.out.print("Enter the not-out in match number:-  ");
        int not_out = in.nextInt();

        int dismissed = matches - not_out;

        int avg = runs / dismissed;

        System.out.println("The batting avg is:- " + avg);

    }
}
