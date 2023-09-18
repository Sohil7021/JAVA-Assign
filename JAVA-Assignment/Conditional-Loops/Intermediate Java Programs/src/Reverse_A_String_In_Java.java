import java.util.Scanner;

public class Reverse_A_String_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:- ");
        String s = in.nextLine();

        String rev = " ";

        for (int i = s.length() - 1; i >= 0 ; i--) {
             char ch = s.trim().charAt(i);
             rev += ch;
        }

        System.out.println("The reverse of string is:- " + rev);
    }
}
