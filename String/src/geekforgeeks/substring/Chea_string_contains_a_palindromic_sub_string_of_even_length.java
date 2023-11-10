package geekforgeeks.substring;

public class Chea_string_contains_a_palindromic_sub_string_of_even_length {
    public static void main(String[] args) {
        String s = "xyzxzx";
        boolean result = palindrome_even(s);
        System.out.println(result);
    }
    static boolean palindrome_even(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return true;
            }
        }
        return false;

//            int n = s.length();
//
//        for (int i = 0; i < n ; i++) {
//            for (int j = 2; i+j <=n ; j++) {
//                if (isPalindrome(s.substring(i,i+j))) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
