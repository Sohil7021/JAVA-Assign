import java.util.Scanner;

public class Greeting_Message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a your name:- ");
        String name = in.nextLine();
        System.out.println("Hello nice to meet you " + name);
    }
}
