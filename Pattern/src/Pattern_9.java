public class Pattern_9 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n) {
        for (int i = n; i >= 1 ; i--) {

            int spaces = n-i;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            int cols = 2*i-1;
            for (int j = cols; j >= 1 ; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
