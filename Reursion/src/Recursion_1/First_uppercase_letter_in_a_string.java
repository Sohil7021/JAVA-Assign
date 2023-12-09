package Recursion_1;

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        char result = upperCase2(str,0);
        System.out.println(result);
    }


//    Iterative Approach
    static char upperCase(String str) {
        for (int i = 0; i < str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return str.charAt(i);

            }
        }
        return 0;
    }


//    Recursive Approach
    static char upperCase2(String str, int i) {
        if (str.charAt(i) == '\0') {
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }

        try {
            return upperCase2(str,i+1);
        }
        catch (Exception e) {
            System.out.println("Exception Occurs!");
        }
        return 0;
    }

}
