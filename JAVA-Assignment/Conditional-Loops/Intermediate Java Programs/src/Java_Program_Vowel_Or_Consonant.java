import java.awt.*;
import java.util.Scanner;

public class Java_Program_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character:- ");

        char ch = in.next().toLowerCase().trim().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is vowel:- " + ch);
        } else {
            System.out.println("The consonant:- " + ch);
        }

    }

}
