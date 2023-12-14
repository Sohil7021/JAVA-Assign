package Main;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = valid(s);
        System.out.println(result);
    }
    static boolean valid(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char first = s.charAt(start);
            char second = s.charAt(end);

            if (!Character.isLetterOrDigit(first)) {
                start++;
            } else if (!Character.isLetterOrDigit(second)) {
                end--;
            }else {
                if (Character.toLowerCase(first) != Character.toLowerCase(second)) {
                    return false;
                }
                start++;
                end--;
            }

        }

        return true;


//        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//        int i = 0, j = cleanedString.length() - 1;
//
//        while (i < j) {
//            if (cleanedString.charAt(i) != cleanedString.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//
//        return true;
    }
}
