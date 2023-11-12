package Main;

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "books";
        boolean result = halveAreLike(s);
        System.out.println(result);
    }
    static boolean halveAreLike(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

       String vowels = "aeiouAEIOU";

        // Count the vowels in the first half
        int firstHalfVowel = countVovel(s.substring(0,s.length() / 2) , vowels);
        // Count the vowels in the second half
        int secondHalfVowel = countVovel(s.substring(s.length() / 2), vowels);
        // Compare the counts
        return firstHalfVowel == secondHalfVowel;


    }
    static int countVovel(String str, String vowels) {
        // Count the number of vowels in the given string
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
