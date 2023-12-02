package GFG;

public class Print_N_to_1_without_loop {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int n) {
        if (n > 0) {
            System.out.println(n);
            num(n-1);
        }
        return;

//        base condition
//        if (n < 1) {
//            return;
//        }
//        System.out.println(n);
//        num(n-1);
    }
}
