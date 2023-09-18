import java.util.Scanner;

public class Calculate_Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of point 1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter the y-coordinate of point 1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter the x-coordinate of point 2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter the y-coordinate of point 2: ");
        double y2 = input.nextDouble();

        // Calculate the distance using the distance formula
        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("Distance between point 1 and point 2: " + distance);

        input.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }


    }

