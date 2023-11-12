package Main;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
       String command = "G()(al)";
       String result = interpret(command);
        System.out.println(result);
    }
    static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < command.length() ; i++) {
            if (command.charAt(i) == 'G') {
                ans.append('G');
            } else if (command.charAt(i) == '(')
            {
                if (command.charAt(i+1) == ')') {
                    ans.append('o');
                    i++; // Skip the next character since it is already processed
                }else {
                   ans.append("al");
                   i += 3; // Skip the next two characters since "al" is processed
                }

            }
        }
        return ans.toString();
    }
}
