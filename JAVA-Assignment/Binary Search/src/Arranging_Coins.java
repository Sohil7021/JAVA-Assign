public class Arranging_Coins {
    public static void main(String[] args) {
        int n = 8;
        int result = arrangeCoins2(n);
        System.out.println(result);

    }

    static int arrangeCoins2(int n) {
        int rows = 0;
        int coins = 1;

        while (n >= coins) {
            n -= coins;
            coins++;
            rows++;
        }
        return rows;
    }
    static  int arrangeCoins(int n) {
        long start = 1;
        long end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum == n) {
                return (int) mid;
            } else if (sum < n) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
