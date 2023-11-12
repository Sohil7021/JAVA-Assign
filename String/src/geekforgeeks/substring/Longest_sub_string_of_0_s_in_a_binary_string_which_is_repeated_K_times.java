package geekforgeeks.substring;

public class Longest_sub_string_of_0_s_in_a_binary_string_which_is_repeated_K_times {
    public static void main(String[] args) {
                String s = "100001";
                int result = longest_substring(s,3);
        System.out.println(result);
    }
    static int longest_substring(String s, int k) {
        int n = s.length();
        if (k > 1) {
            s += s;
            n *= 2;
        }

        int ans = 0;
        int i = 0;
        while ( i < n) {
            int x = 0;
            while (i < n && s.charAt(i) == '0') {
                x++;
                i++;
            }
            ans = Math.max(ans,x);
            i++;
        }

        if (k == 1 || ans != n) {
            return ans;
        }else {
            return (ans / 2) * k;
        }
    }
}
