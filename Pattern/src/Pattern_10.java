public class Pattern_10 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n) {
        for (int i = 1; i <= n ; i++) {

            int spaces = n - i;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
