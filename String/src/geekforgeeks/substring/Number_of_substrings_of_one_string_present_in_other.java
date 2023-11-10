package geekforgeeks.substring;

public class Number_of_substrings_of_one_string_present_in_other {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aaaab";

        int result = substring(s1,s2);
        System.out.println(result);
    }
    static int substring(String s1, String s2) {
        int ans = 0;
        for (int i = 0; i < s1.length() ; i++) {
            String s3 = "";
            char[] ch = s1.toCharArray();

            for (int j = i; j < s1.length() ; j++) {
                s3 += ch[j];

                if (s2.indexOf(s3) != -1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
