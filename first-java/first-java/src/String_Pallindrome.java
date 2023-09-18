import java.util.Scanner;

public class String_Pallindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String name = in.nextLine();
        String rev = "";

        for (int i = name.length() - 1; i >= 0 ; i--) {
            rev = rev + name.charAt(i);
        }

        if (name.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(name + " is palindrome");
        } else {
            System.out.println(name + " not palindrome");
        }
    }
}
