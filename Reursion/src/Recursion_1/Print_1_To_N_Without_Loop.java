package Recursion_1;

public class Print_1_To_N_Without_Loop {
    public static void main(String[] args) {
        num_1_to_N(10);
    }
    static void num_1_to_N(int n) {
        if (n <= 0) {
            return;
        }
        num_1_to_N(n-1);
        System.out.println(n);
    }
}
