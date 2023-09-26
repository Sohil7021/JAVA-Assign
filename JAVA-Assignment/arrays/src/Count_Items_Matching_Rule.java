import java.util.List;

public class Count_Items_Matching_Rule {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}};

//        int result = countMatches(items,"type","phone");

    }
    static int countMatches(List<List<String>> items,String ruleKey, String ruleValue) {
        int  index = -1;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("name")) {
            index = 1;
        }else {
            index = 2;
        }

        int count = 0;

        for (int i = 0; i < items.size() ; i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;


    }
}
