package Lecture_Math_DSA;

public class odd_even {
    public static void main(String[] args) {
        boolean n = odd_even(4);
        System.out.println(n);

    }
    static boolean odd_even(int n) {
        return (n & 1) == 1;
    }
}
