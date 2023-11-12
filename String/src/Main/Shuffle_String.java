package Main;

public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = restoreString(s,indices);
        System.out.println(result);
    }
    static String restoreString(String s, int[] indices) {
        char[] temp = new char[indices.length];
        for (int i = 0; i < s.length() ; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
