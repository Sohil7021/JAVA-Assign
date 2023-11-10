package geekforgeeks.substring;

public class Check_if_the_given_string_is_K_periodic {
    public static void main(String[] args) {
        String s = "geeksgeeks";
        int len = s.length();
        int k = 5;

        boolean result = isPeriodic(s,k,len);
        System.out.println(result);

    }
    static boolean isPrefix(String s, int k,int len,int i) {
        // Function that return true if sub-string
        // of length k starting at index i is also
        // a prefix of the string
        if (i + k > len) {
            return false;
        }
        for (int j = 0; j < k; j++) {

            // Character mismatch between the prefix
            // and the sub-string starting at index i
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            }
            i++;

        }

        return true;
    }

    static boolean isPeriodic(String s, int k, int len) {
        // Check whether all the sub-strings
        // str[0, k-1], str[k, 2k-1] ... are equal
        // to the k length prefix of the string
        for (int i = k; i < len  ; i+= k) {
            if (!isPrefix(s,k,len,i)) {
                return false;
            }
        }
        return true;
    }
}
