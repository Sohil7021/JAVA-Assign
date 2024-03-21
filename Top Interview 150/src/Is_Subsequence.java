public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean ans = sub(s,t);
        System.out.println(ans);

    }
    static boolean sub(String s, String t) {
       int i = 0;
       int j = 0;

       while (i < s.length() && j < t.length()) {
           if (s.charAt(i) == t.charAt(j))
               i++;j++;


       }
       return i == s.length();
    }
}
