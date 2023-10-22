import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2:- ");
        int num2 = in.nextInt();
        int result = 0 ;
        System.out.print("Enter the operator (+,-,*,/):- ");
        char op = in.next().charAt(0);

        if (op == '+'){
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        } else if (op =='/') {
            result = num1 / num2;
        }
        else {
            System.out.println("Enter a valid operator that is given:- " + op);
        }

        System.out.println("The result is:- " + result);





        }
    }

