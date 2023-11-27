package LCE;

public class _1_to_N {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if(n == 0) {
            return;
        }


        fun(n-1);
        System.out.println(n);
    }
}
