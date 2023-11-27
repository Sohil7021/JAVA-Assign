public class String_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        String h =  "sadbutsad";
               String n = "sad";
               int result = match(h,n);
        System.out.println(result);

    }
    static int match(String h, String n) {
//        int index = h.indexOf(n);
//        if(index != -1) {
//            return index;
//        }
//        return -1;


        int first = 0;
        int second = 0;

        while(first < h.length() && second < n.length()) {
//            Match

            if(h.charAt(first) == n.charAt(second)) {
                first++;
                second++;
            }
//            not match
            else {
                if (second == 0) {
                    first++;
                }else {
                    lps(String.valueOf(second - 1));;
                }
            }



        }
        if (second == n.length()) {
            return first - second;
        }

        return -1;
//        answer exist



    }
    static void lps(String s) {

            // code here
            int n = s.length();
            int[] lps = new int[n];
            int prefix = 0;
            int suffix = 1;

            while(suffix < n) {
                // match
                if(s.charAt(prefix) == s.charAt(suffix)) {
                    lps[suffix] = prefix + 1;
                    suffix++;
                    prefix++;
                }
                // not match
                else {
                    if(prefix == 0) {
                        lps[suffix] = 0;
                        suffix++;
                    }else {
                        prefix = lps[prefix - 1];

                    }
                }
            }


    }
}
