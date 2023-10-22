import java.util.Scanner;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the a:- ");
        int a = in.nextInt();
        System.out.print("Enter the b:- ");
        int b = in.nextInt();
        System.out.print("Enter the c:- ");
        int c = in.nextInt();

        if (triplet(a,b,c)) {
            System.out.println("(" + a + " " + b + " " + c + ") is a triplet");
        }else {
            System.out.println("(" + a + " " + b + " " + c + ") is a not triplet");
        }

    }

    static boolean triplet(int a, int b, int c) {
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int tem = b;
            b = c;
            c = tem;
        }

        return a * a + b * b == c * c;
    }
}
