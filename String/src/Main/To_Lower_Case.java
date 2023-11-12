package Main;

public class To_Lower_Case {
    public static void main(String[] args) {
        String s = "HEllo";
        String result = lowerCase(s);
        System.out.println(result);
    }
    static String lowerCase(String s) {
//        return s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                sb.append((char) (s.charAt(i) + 32));
            }else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();

    }
}
