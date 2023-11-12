package Main;

import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
      String[][]  items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
       String ruleKey = "color", ruleValue = "silver";
//       int result = countMatches(items,ruleKey,ruleValue);
    }
   static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int res = 0;
       for(int i = 0 ;i<items.size();i++){
           if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
           if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
           if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
       }

       return res;
   }
   }

