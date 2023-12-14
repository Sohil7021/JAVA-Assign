package Main;

public class Valid_Palindrome_II {
    public static void main(String[] args) {
        String s = "abca";
        boolean result = isValid(s);
        System.out.println(result);

    }
    static boolean isValid(String s) {
        int i = 0;
        int j = s.length() - 1;


        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }


    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
