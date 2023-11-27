import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);

    }
    static int romanToInt(String s) {
        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);


        int ans = 0;
        for (int i = 0; i < s.length() ; i++) {
            int currentVal = romanMap.get(s.charAt(i));
            if (i < s.length()-1 && romanMap.get(s.charAt(i+1)) > currentVal) {
                ans -= currentVal;
            }else {
                ans += currentVal;
            }
        }
        return ans;
    }
}
