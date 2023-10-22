import java.util.HashMap;
import java.util.Map;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";

        boolean result = checkIfPangram2(sentence);
        System.out.println(result);
    }

    static boolean checkIfPangram(String sentence) {
        for (int i = 0; i < 26 ; i++) {
            char ch = (char) ('a' + i);
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    static boolean checkIfPangram2(String sentence) {
        Map<Character,Integer> hash = new HashMap<>();

        for (int i = 0; i < sentence.length() ; i++) {
            hash.put(sentence.charAt(i),1);
        }
        return hash.size() == 26 ? true : false;
    }
}
