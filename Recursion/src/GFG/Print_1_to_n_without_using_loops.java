package GFG;

public class Print_1_to_n_without_using_loops {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int n) {
        if (n > 0) {
            num(n-1);
            System.out.println(n);


        }
        return;



    }
}
