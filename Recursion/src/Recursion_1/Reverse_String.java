package Recursion_1;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        String[] str = { "h","e","l","l","o"};
//        reverseString2(str,0, str.length - 1);
        System.out.println(Arrays.toString(str));
    }

//    Iterative Approach
    static void reverseString(char[] str) {
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }





    }


    static void reverseString2(char[] str, int i, int j) {
        if(i >= j) {
            return;
        }
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        reverseString2(str,i++, j--);
    }
}
