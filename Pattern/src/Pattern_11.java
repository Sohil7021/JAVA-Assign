public class Pattern_11 {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n) {
        for (int i = 1; i <= n ; i++) {

            int spaces = i-1;
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
