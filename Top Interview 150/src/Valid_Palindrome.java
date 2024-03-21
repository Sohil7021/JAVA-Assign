public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalin2(s);
        System.out.println(ans);

    }
    static boolean isPalin(String s) {
        String cleanString = s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int i = 0;
        int j = cleanString.length()-1;

        while (i < j) {
            if (cleanString.charAt(i) != cleanString.charAt(j)) {
                return false;
            }else {
                i++;j--;
            }
        }
        return true;
    }



    static boolean isPalin2(String s) {
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
    }
}
