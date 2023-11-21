public class String_LPS {
    public static void main(String[] args) {
        String s = "abab";
        int result = lps(s);
        System.out.println(result);
    }
    static int lps(String s) {
        int n = s.length();
        int[] lpss = new int[n];
        int prefix = 0;
        int suffix = 1;

        while (suffix < n) {
//            match
            if (s.charAt(prefix) == s.charAt(suffix)) {
                lpss[suffix] = prefix + 1;
                suffix++;
                prefix++;
            }else {
//                not match
                if (prefix == 0) {
                    lpss[suffix] = 0;
                    suffix++;
                }else {
                    prefix = lpss[prefix - 1];
                }
            }
        }
        return lpss[n-1];
    }
}
