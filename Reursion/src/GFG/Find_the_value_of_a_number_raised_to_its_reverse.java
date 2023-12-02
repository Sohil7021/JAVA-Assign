package GFG;

public class Find_the_value_of_a_number_raised_to_its_reverse {
    static long mod = 1000000007;

    public static void main(String[] args) {
        long result = raised2(2,2);
        System.out.println(result);

    }
//    Iterative Approach
    static long raised(int n, int r) {
        long ans = 1;
        long mod = 1000000000 + 7;
        for (int i = 1; i <= r ; i++) {
            ans *= n;
            ans %= mod;
        }
        return ans;
    }

//    Recursive Approach

    static long raised2(int n, int r) {
        if (r == 0) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        return (n * raised2(n,r-1)) % mod;

    }

}
