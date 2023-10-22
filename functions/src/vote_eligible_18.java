import java.util.Scanner;

public class vote_eligible_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age for voting:- ");
        int age = in.nextInt();

        if (vote(age)) {
            System.out.println("You are eligible for voting:- " + age);
        }else {
            System.out.println("Not eligible for voting:- " + age);
        }
    }

    static boolean vote(int age) {

        return age >= 18;
    }
}
