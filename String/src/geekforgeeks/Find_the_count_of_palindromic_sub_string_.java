package geekforgeeks;

public class Find_the_count_of_palindromic_sub_string_ {
    public static void main(String[] args) {
        String str = "acbbd";
        int result = count_substring(str);
        System.out.println(result);
    }
    static int count_substring(String str) {
        int maxChar = 26;
        int n = str.length();
        int sum = 0;
        // calculate frequency
        int[] hashtable = new int[maxChar];
        for (int i = 0; i < n ; i++) {
            hashtable[str.charAt(i) - 'a']++;

        }
        // calculate count of palindromic sub-string
        for (int i = 0; i < 26 ; i++) {
            if (hashtable[i] != 0);
            sum += (hashtable[i] * (hashtable[i] + 1) / 2);
        }
        return sum;
    }
}
