package Recursion_1;

public class Program_for_length_of_a_string_using_recursion {
    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        int result = len(str);
        System.out.println(result);

    }
    static int len(String str) {
        if (str.equals("")) {
            return 0;
        }else {
            return len(str.substring(1)) + 1;
        }
    }
}
