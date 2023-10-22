import java.util.Scanner;

public class Calculate_CGPA_Java_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePoints = 0.0;
        int totalCreditHours = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            System.out.print("Enter grade (A, B, C, D, F): ");
            String grade = scanner.next();
            System.out.print("Enter credit hours: ");
            int creditHours = scanner.nextInt();

            double gradePoint = getGradePoint(grade);
            double courseGradePoints = gradePoint * creditHours;

            totalGradePoints += courseGradePoints;
            totalCreditHours += creditHours;
        }

        double cgpa = totalGradePoints / totalCreditHours;

        System.out.println("CGPA: " + cgpa);
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                System.out.println("Invalid grade entered: " + grade);
                return 0.0;
        }
    }
    }

