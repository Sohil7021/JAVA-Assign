public class Pattern_5 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n) {
        for (int i = 1; i <= 2*n-1 ; i++) {

            int cols = i > n ? 2*n - i : i ;

            for (int j = 1; j <= cols ; j++) {
                System.out.print("*");
            }
            System.out.println();



        }
    }
}
