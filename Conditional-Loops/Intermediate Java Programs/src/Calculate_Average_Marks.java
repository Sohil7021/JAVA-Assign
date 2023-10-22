import java.util.Scanner;

public class Calculate_Average_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no.of subject:- ");
        int sub = in.nextInt();

        double totalMarks = 0.0;

        for (int i = 1; i <= sub ; i++) {
            System.out.print("Enter the marks out of 100:- ");
            double marks = in.nextDouble();
            totalMarks += marks;
        }

        double avg = totalMarks / sub;

        System.out.println("The average marks is:- " + avg);
    }
}
