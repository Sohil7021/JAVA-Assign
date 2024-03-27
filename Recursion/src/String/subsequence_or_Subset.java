package String;

import java.util.ArrayList;

public class subsequence_or_Subset {
    public static void main(String[] args) {
//        subsequence("","abc");
        System.out.println(subsequence2("","abc"));

    }

    static void subsequence(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsequence(p+ch,up.substring(1));
        subsequence(p,up.substring(1));
    }

                    // Adding on List
    static ArrayList<String> subsequence2(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String > list = new ArrayList<>();
            list.add((p));
            return list;
        }

        char ch = up.charAt(0);
       ArrayList<String> left =  subsequence2(p+ch,up.substring(1));
       ArrayList<String> right =  subsequence2(p,up.substring(1));
       left.addAll(right);
       return left;

    }


}
