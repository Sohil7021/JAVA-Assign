package Recursion_1;

import java.util.Scanner;

public class Geek_onacci_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t ; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            System.out.println(onacci(a,b,c,n));
        }


    }
    static int onacci(int a, int b, int c, int n) {
        if (n == 1) {
             return a;
        }

        if (n == 2) {
            return b;
        }

        if (n == 3) {
            return c;
        }
        else {
            return onacci(a,b,c,n-1)+ onacci(a,b,c,n-2)+onacci(a,b,c,n-3);
        }
    }
}
