import java.util.Scanner;

public class marks_grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the marks (out of 100):- ");
        int marks = in.nextInt();

        displayGrade(marks);

    }

    static void displayGrade(int marks) {
        String grade = " ";

        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        }else if (marks >= 81 && marks <= 90) {
            grade = "AB";
        } else if (marks >= 71 && marks <= 80) {
            grade = "BB";
        } else if (marks >= 61 && marks <= 70) {
            grade = "BC";
        } else if (marks >= 51 && marks <= 60) {
            grade = "CD";
        } else if (marks >= 41 && marks <= 50) {
            grade = "DD";
        } else if (marks <= 40) {
            grade = "Fail";
        }else {
            System.out.println("Please enter a valid marks:- " + marks);
        }
        System.out.println("The marks to Grade is:- " + grade);









    }
}
