package Main;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
       String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack,needle);
        System.out.println(result);
    }
    static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);

        if (index != -1) {
            return index;
        }
        return -1;
    }
}
