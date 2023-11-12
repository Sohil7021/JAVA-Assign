package Main;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = stringAreEqual(word1,word2);
        System.out.println(result);
    }
    static boolean stringAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        for (String word : word1) {
            w1.append(word);
        }

        StringBuilder w2 = new StringBuilder();
        for (String s: word2) {
            w2.append(s);
        }


        return w1.compareTo(w2) == 0;
    }
}
