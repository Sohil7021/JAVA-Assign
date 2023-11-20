package Lecture_Math_DSA;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        int result = ans(arr);
        System.out.println(result);
    }
    static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
