import java.util.Scanner;

public class Find_Ncr__Npr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        long nCr = calculateCombination(n, r);
        long nPr = calculatePermutation(n, r);

        System.out.println("nCr (Combinations): " + nCr);
        System.out.println("nPr (Permutations): " + nPr);
    }

    public static long calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calculateCombination(int n, int r) {
        if (n < r) {
            return 0;
        }
        return calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
    }

    public static long calculatePermutation(int n, int r) {
        if (n < r) {
            return 0;
        }
        return calculateFactorial(n) / calculateFactorial(n - r);
    }

    }

