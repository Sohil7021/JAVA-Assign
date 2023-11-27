package Main;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s = "10#11#12";
//        String result = alphabet(s);
        String result = alpha(s);
        System.out.println(result);

    }
    static String alphabet(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >=0 ; i--) {
            if(s.charAt(i) == '#'){
                output.append((char) ('a' + (s.charAt(i-1) - '0') + 10 * (s.charAt(i-2) - '0') - 1));

                i -= 2;
            }else {
                output.append((char) ('a' + (s.charAt(i) - '0') - 1));
            }
        }
        output.reverse();
        return output.toString();
    }


    static String alpha(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // If there is a '#' after the current character, it represents a two-digit number.
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) ('a' + num - 1));
                i += 3; // Move to the next character after the '#'
            } else {
                // Otherwise, it's a single-digit number.
                int num = Integer.parseInt(s.substring(i, i + 1));
                result.append((char) ('a' + num - 1));
                i++;
            }
        }
        return result.toString();
    }
}
