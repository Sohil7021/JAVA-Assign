package Main;

public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWord(s);
        System.out.println(result);
    }
    static String reverseWord(String s) {
        String[] word = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String words : word) {
            StringBuilder reverse = new StringBuilder(words);
            reverse.reverse();
            result.append(reverse).append(" ");
        }

        return result.toString().trim();
    }
}
